package com.prisch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Agent {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 10001;

        try ( Socket socket = new Socket(host, port);
              PrintWriter serverWriter = new PrintWriter(socket.getOutputStream(), true);
              BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream())) ) {

            String message = serverReader.readLine();
            System.out.println(message);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
