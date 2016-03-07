package com.prisch;

import com.google.gson.Gson;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import com.prisch.messages.TicketDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AgentServer {

    private static final int PORT = 10001;
    private static final Gson GSON = new Gson();

    private Thread listenerThread;
    private Thread senderThread;

    private Map<Integer, CompletableFuture<Message>> futureMap = new HashMap<>();
    private BlockingQueue<Message> messageQueue = new ArrayBlockingQueue<>(5);
    private AtomicInteger messageCount = new AtomicInteger();

    private volatile boolean connected;

    public void start() {
        while (true) {
            try ( ServerSocket serverSocket = new ServerSocket(PORT);
                  Socket clientSocket = serverSocket.accept() ){

                connected = true;

                listenerThread = new Thread(new Listener(clientSocket));
                listenerThread.start();

                senderThread = new Thread(new Sender(clientSocket));
                senderThread.start();

                while (connected) {
                    Thread.sleep(1000L);
                    if (isConnected()) {
                        Future<Message> test = send(new TicketDetails.Request());
                        System.out.println(GSON.toJson(test.get()).toString());
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                connected = false;
                listenerThread.interrupt();
                senderThread.interrupt();
            }
        }
    }

    public Future<Message> send(Message message) {
        if (!isConnected()) {
            throw new IllegalStateException("The agent is not connected.");
        }

        message.setId(messageCount.addAndGet(1));

        CompletableFuture<Message> future = new CompletableFuture<>();
        futureMap.put(message.getId(), future);

        try {
            messageQueue.put(message);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        return future;
    }

    public boolean isConnected() {
        return connected;
    }

    private final class Listener implements Runnable {

        private final Socket socket;

        public Listener(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                while (isConnected()) {
                    String input = reader.readLine();
                    Class<? extends Message> messageClass = MessageMapping.responseMappingFor(input);
                    Message message = GSON.fromJson(input, messageClass);
                    futureMap.get(message.getId()).complete(message);
                }
            } catch (Exception ex) {
                connected = false;
            }
        }
    }

    private final class Sender implements Runnable {

        private final Socket socket;

        public Sender(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                while (isConnected()) {
                    Message message = messageQueue.take();
                    writer.println(GSON.toJson(message));
                }
            } catch (Exception ex) {
                connected = false;
            }
        }
    }
}
