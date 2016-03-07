package com.prisch;

import com.google.gson.Gson;
import com.prisch.handlers.MessageHandlerFactory;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AgentClient {

    private static final String HOST = "localhost";
    private static final int PORT = 10001;
    private static final Gson GSON = new Gson();

    private volatile boolean connected;

    public void connect() {
        while (true) {
            try ( Socket socket = new Socket(HOST, PORT);
                  PrintWriter serverWriter = new PrintWriter(socket.getOutputStream(), true);
                  BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream())) ) {

                connected = true;

                while (connected) {
                    String input = serverReader.readLine();
                    new Thread(new Responder(serverWriter, input)).run();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                connected = false;
            }
        }
    }

    public boolean isConnected() {
        return connected;
    }

    private final class Responder implements Runnable {

        private final PrintWriter writer;
        private final String input;

        public Responder(PrintWriter writer, String input) {
            this.writer = writer;
            this.input = input;
        }

        @Override
        public void run() {
            Class<? extends Message> messageClass = MessageMapping.requestMappingFor(input);
            Message message = GSON.fromJson(input, messageClass);
            Message response = MessageHandlerFactory.handle(message);
            String output = GSON.toJson(response);

            writer.println(output);
        }
    }
}
