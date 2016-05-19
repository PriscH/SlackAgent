package com.prisch.responders;

import com.prisch.slack.SlackSession;
import com.ullink.slack.simpleslackapi.SlackChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.stream.Collectors;

public class HelpResponder implements Responder {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelpResponder.class);

    @Override
    public void respond(SlackSession slackSession, SlackChannel slackChannel) {
        Optional<String> helpMessage = loadHelpMessage();
        if (!helpMessage.isPresent()) {
            slackSession.sendMessage(slackChannel, "Sorry, I'm unable to load the help documentation.");
            return;
        }

        slackSession.sendMessage(slackChannel, helpMessage.get());
    }

    private Optional<String> loadHelpMessage() {
        try (final InputStream helpStream = HelpResponder.class.getResourceAsStream("/help.md");
             final InputStreamReader helpReader = new InputStreamReader(helpStream);
             final BufferedReader bufferedReader = new BufferedReader(helpReader)) {

            return Optional.of(bufferedReader.lines().collect(Collectors.joining("\n")));
        } catch (IOException exception) {
            LOGGER.error("Unable to load help.md", exception);
        }
        return Optional.empty();
    }
}
