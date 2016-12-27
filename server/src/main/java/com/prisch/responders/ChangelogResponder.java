package com.prisch.responders;

import com.prisch.domain.Changelog;
import com.prisch.domain.Release;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import static com.prisch.slack.SlackFormatter.newline;

public class ChangelogResponder implements Responder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChangelogResponder.class);

    @Override
    public void respond(SlackSession slackSession, SlackChannel slackChannel) {
        Optional<Release> release = loadChangelog();
        if (!release.isPresent()) {
            slackSession.sendMessage(slackChannel, "Sorry, I'm unable to load the changelog.");
            return;
        }

        String changelogMessage = buildChangelogMessage(release.get());
        slackSession.sendMessage(slackChannel, changelogMessage);
    }

    private Optional<Release> loadChangelog() {
        Constructor changelogConstructor = new Constructor(Changelog.class);
        changelogConstructor.addTypeDescription(new TypeDescription(Release.class));

        try (final InputStream changelogStream = ChangelogResponder.class.getResourceAsStream("/changelog.yaml")) {
            Yaml yaml = new Yaml(changelogConstructor);
            Changelog changelog = (Changelog)yaml.load(changelogStream);

            if (!changelog.getReleases().isEmpty()) {
                return Optional.of(changelog.getReleases().get(0));
            }
        } catch (IOException exception) {
            LOGGER.error("Unable to load changelog.yaml", exception);
        }
        return Optional.empty();
    }

    private String buildChangelogMessage(Release release) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("I'm currently at %s", release.getVersion()));
        stringBuilder.append(newline());

        for (String changeEntry : release.getChanges()) {
            stringBuilder.append(String.format("• %s", changeEntry));
            stringBuilder.append(newline());
        }

        return stringBuilder.toString();
    }
}
