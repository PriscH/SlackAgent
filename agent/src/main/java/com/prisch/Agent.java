package com.prisch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URISyntaxException;

public class Agent {

    public static void main(String[] args) throws URISyntaxException {
        AgentClient client = new AgentClient("ws://localhost:8080");
        client.connect();
    }
}
