package com.prisch;

import com.google.gson.Gson;
import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import com.prisch.messages.NoContentMessage;
import com.prisch.oauth.OAuthTokenRequest;
import com.ullink.slack.simpleslackapi.SlackSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Spark;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AgentServer  {

    private static final int REQUEST_TIMEOUT_SECONDS = 60;
    private static final int CONNECTION_LOST_MILLISECONDS = REQUEST_TIMEOUT_SECONDS * 1000 + 5000;

    private static final Logger LOGGER = LoggerFactory.getLogger(AgentServer.class);
    private static final Gson GSON = new Gson();

    private Map<Integer, CompletableFuture<Message>> futureMap = new ConcurrentHashMap<>();
    private BlockingQueue<Message> messageQueue = new ArrayBlockingQueue<>(5);
    private AtomicInteger messageCount = new AtomicInteger();

    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final SlackSession slackSession;

    private long lastConnectionTime;

    public AgentServer(String address, int port, SlackSession slackSession) {
        this.slackSession = slackSession;

        Spark.ipAddress(address);
        Spark.port(port);
    }

    // ===== Interface =====

    public void start() throws IOException {
        Spark.get("/command", this::serveCommand, GSON::toJson); // Long polling for commands
        Spark.post("/result", this::serveResult); // Responses to commands
        Spark.post("/connect", this::handleConnection); // Checking server availability
        Spark.post("/slack", this::handleSlackAction); // Slack buttons
        Spark.get("/slack/oauth", this::handleSlackOAuth); // Slack app authorization

        LOGGER.info("Server is running.");
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

    public boolean isConnected() {
        return (System.currentTimeMillis() - lastConnectionTime < CONNECTION_LOST_MILLISECONDS);
    }

    // ===== HTTP Responders =====

    private Object serveCommand(Request request, Response response) {
        lastConnectionTime = System.currentTimeMillis();

        try {
            Message message = messageQueue.poll(REQUEST_TIMEOUT_SECONDS, TimeUnit.SECONDS);
            if (message == null) {
                return new NoContentMessage();
            } else {
                return message;
            }
        } catch (InterruptedException ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.status(204);
            return "Server thread was interrupted.";
        }
    }

    private String serveResult(Request request, Response response) {
        String messageJson = request.body();
        Class<? extends Message> messageClass = MessageMapping.responseMappingFor(messageJson);
        Message message = GSON.fromJson(messageJson, messageClass);

        if (futureMap.containsKey(message.getId())) {
            futureMap.remove(message.getId()).complete(message);
        }
        return "Successfully parsed result.";
    }

    private String handleConnection(Request request, Response response) {
        LOGGER.info("The client managed to establish a successful connection.");
        return "Success";
    }

    private String handleSlackAction(Request request, Response response) {
        return "";
    }

    private String handleSlackOAuth(Request request, Response response) {
        final String CODE = "code";

        String tokenCode = request.queryParams(CODE);
        if (tokenCode == null || tokenCode.trim().isEmpty()) {
            LOGGER.error("Slack did not provide an authorization code.");
            response.status(400);
            return "Unable to parse parameters.";
        }

        executorService.execute(new OAuthTokenRequest(slackSession, tokenCode));
        return "";
    }
}
