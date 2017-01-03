package com.prisch;

import com.google.gson.Gson;
import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import com.prisch.messages.NoContentMessage;
import com.prisch.oauth.OAuthTokenRequest;
import com.ullink.slack.simpleslackapi.SlackSession;
import fi.iki.elonen.NanoHTTPD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AgentServer extends RouterHTTPD {

    private static final int REQUEST_TIMEOUT_SECONDS = 60;
    private static final int CONNECTION_LOST_MILLISECONDS = REQUEST_TIMEOUT_SECONDS * 1000 + 5000;
    private static final String JSON_DATA_PARAM = "postData";

    private static final Logger LOGGER = LoggerFactory.getLogger(AgentServer.class);
    private static final Gson GSON = new Gson();

    private Map<Integer, CompletableFuture<Message>> futureMap = new ConcurrentHashMap<>();
    private BlockingQueue<Message> messageQueue = new ArrayBlockingQueue<>(5);
    private AtomicInteger messageCount = new AtomicInteger();

    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final SlackSession slackSession;

    private long lastConnectionTime;

    public AgentServer(String address, int port, SlackSession slackSession) {
        super(address, port);
        this.slackSession = slackSession;
    }

    // ===== Interface =====

    public void start() throws IOException {
        addRoute("/command", Method.GET, this::serveCommand); // Long polling for commands
        addRoute("/result", Method.POST, this::serveResult); // Responses to commands
        addRoute("/connect", Method.POST, this::handleConnection); // Checking server availability
        addRoute("/slack", Method.POST, this::handleSlackAction); // Slack buttons
        addRoute("/slack/oauth", Method.GET, this::handleSlackOAuth); // Slack app authorization

        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        LOGGER.info("Server running on " + getHostname() + ":" + getListeningPort());
    }

    // TODO: The messageQueue can grow unbounded if the futures are never resolved
    public CompletableFuture<Message> send(Message message) {
        CompletableFuture<Message> future = new CompletableFuture<>();

        if (isConnected()) {
            message.setId(messageCount.addAndGet(1));
            futureMap.put(message.getId(), future);

            if (!messageQueue.offer(message)) {
                LOGGER.error("The message queue is full.");
                future.complete(new FailureResponse("Sorry, I can't talk to the agent at the moment."));
            }
        } else {
            LOGGER.error("The client isn't connected, so unable to send the message.");
            future.complete(new FailureResponse("Sorry, I can't talk to the agent at the moment."));
        }

        return future;
    }

    // ===== HTTP Responders =====

    private Response serveCommand(IHTTPSession session) {
        lastConnectionTime = System.currentTimeMillis();

        try {
            Message message = messageQueue.poll(REQUEST_TIMEOUT_SECONDS, TimeUnit.SECONDS);
            if (message == null) {
                return serveMessage(new NoContentMessage());
            } else {
                return serveMessage(message);
            }
        } catch (InterruptedException ex) {
            LOGGER.error(ex.getMessage(), ex);
            return newFixedLengthResponse(Response.Status.INTERNAL_ERROR, MIME_PLAINTEXT, "Server thread was interrupted.");
        }
    }

    private Response serveMessage(Message message) {
        String messageJson = GSON.toJson(message);
        return newFixedLengthResponse(messageJson);
    }

    private Response serveResult(IHTTPSession session) {
        String messageJson;
        try {
            Map<String, String> requestParams = new HashMap<>();
            session.parseBody(requestParams);
            messageJson = requestParams.get(JSON_DATA_PARAM);
        } catch (IOException | ResponseException ex) {
            LOGGER.error(ex.getMessage(), ex);
            return newFixedLengthResponse(Response.Status.INTERNAL_ERROR, MIME_PLAINTEXT, "Unable to parse parameters.");
        }

        Class<? extends Message> messageClass = MessageMapping.responseMappingFor(messageJson);
        Message message = GSON.fromJson(messageJson, messageClass);

        if (futureMap.containsKey(message.getId())) {
            futureMap.remove(message.getId()).complete(message);
        }

        return newFixedLengthResponse("Successfully parsed result.");
    }

    private Response handleConnection(IHTTPSession session) {
        LOGGER.info("The client managed to establish a successful connection.");
        return newFixedLengthResponse(null);
    }

    private Response handleSlackAction(IHTTPSession session) {
        return newFixedLengthResponse(null);
    }

    private Response handleSlackOAuth(IHTTPSession session) {
        final String CODE = "code";

        if (!session.getParameters().containsKey(CODE)) {
            handleInvalidOAuthCode();
        }

        Optional<String> tokenCode = session.getParameters().get(CODE).stream().findAny();
        if (!tokenCode.isPresent()) {
            handleInvalidOAuthCode();
        }

        executorService.execute(new OAuthTokenRequest(slackSession, tokenCode.get()));

        return newFixedLengthResponse(null);
    }

    private Response handleInvalidOAuthCode() {
        LOGGER.error("Slack did not provide an authorization code.");
        return newFixedLengthResponse(Response.Status.BAD_REQUEST, MIME_PLAINTEXT, "Unable to parse parameters.");
    }

    // === Helpers ===

    public boolean isConnected() {
        return (System.currentTimeMillis() - lastConnectionTime < CONNECTION_LOST_MILLISECONDS);
    }
}
