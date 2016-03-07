package com.prisch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Agent {

    public static void main(String[] args) {
        AgentClient client = new AgentClient();
        client.connect();
    }
}
