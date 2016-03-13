package com.prisch;

import java.net.URISyntaxException;

public class Agent {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        AgentClient client = new AgentClient("http://slack-prisch.rhcloud.com:80");
        client.connect();
    }
}
