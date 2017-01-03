package com.prisch.oauth;

import com.google.gson.Gson;
import com.prisch.Bot;
import com.prisch.oauth.model.OAuthResponse;
import com.ullink.slack.simpleslackapi.SlackMessageHandle;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.replies.GenericSlackReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class OAuthTokenRequest implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(OAuthTokenRequest.class);

    private final SlackSession slackSession;
    private final String tokenCode;

    public OAuthTokenRequest(SlackSession slackSession, String tokenCode) {
        this.slackSession = slackSession;
        this.tokenCode = tokenCode;
    }

    @Override
    public void run() {
        Map<String, String> commandParams = buildCommandParams();
        SlackMessageHandle<GenericSlackReply> slackReply = slackSession.postGenericSlackCommand(commandParams, "oauth.access");
        String replyText = slackReply.getReply().getPlainAnswer();

        OAuthResponse authResponse = new Gson().fromJson(replyText, OAuthResponse.class);

        LOGGER.info("Received the GENERAL access token from Slack: " + authResponse.getAccessToken());
        if (authResponse.getBot() != null) {
            LOGGER.info("Received the BOT access token from Slack: " + authResponse.getBot().getAccessToken());
        }
    }

    private Map<String, String> buildCommandParams() {
        Properties properties = new Properties();
        try (final InputStream propertyStream = Bot.class.getResourceAsStream("/server.properties")) {
            properties.load(propertyStream);
        } catch (IOException ex) {
            LOGGER.error("Unable to load server.properties.", ex);
            return new HashMap<>();
        }

        Map<String, String> commandParams = new HashMap<>();
        commandParams.put("client_id", properties.getProperty("slack.clientid"));
        commandParams.put("client_secret", properties.getProperty("slack.clientsecret"));
        commandParams.put("code", tokenCode);

        return commandParams;
    }
}
