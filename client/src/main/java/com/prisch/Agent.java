package com.prisch;

import com.prisch.handlers.MessageHandlerFactory;
import com.prisch.sbm.SBMService;
import org.apache.http.HttpHost;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.Properties;

public class Agent {

    public static void main(String[] args) throws Exception {
        Properties properties = loadProperties();
        SBMService sbmService = initializeSBMService(properties);
        MessageHandlerFactory messageHandlerFactory = new MessageHandlerFactory(sbmService);
        AgentClient agentClient = buildAgentClient(properties, messageHandlerFactory);

        agentClient.connect();
    }

    private static Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        try (final InputStream propertyStream = Agent.class.getResourceAsStream("/client.properties")) {
            properties.load(propertyStream);
        }
        return properties;
    }

    private static SBMService initializeSBMService(Properties properties) throws Exception {
        String sbmUsername = properties.getProperty("sbm.username");

        System.console().writer().write(String.format("Provide the SBM password for %s: ", sbmUsername));
        System.console().writer().flush();

        char[] sbmPasswordChar = System.console().readPassword();
        String sbmPassword = new String(sbmPasswordChar);

        SBMService service = new SBMService(sbmUsername, sbmPassword);
        service.initialise();

        return service;
    }

    private static AgentClient buildAgentClient(Properties properties, MessageHandlerFactory messageHandlerFactory) throws URISyntaxException {
        String serverAddress = properties.getProperty("server.address");
        String proxyHost = properties.getProperty("proxy.host");
        String proxyPort = properties.getProperty("proxy.port");

        Optional<HttpHost> proxy = Optional.empty();
        if (proxyHost != null && !proxyHost.isEmpty() && proxyPort != null && !proxyPort.isEmpty()) {
            proxy = Optional.of(new HttpHost(proxyHost, Integer.parseInt(proxyPort)));
        }

        return new AgentClient(serverAddress, proxy, messageHandlerFactory);
    }
}
