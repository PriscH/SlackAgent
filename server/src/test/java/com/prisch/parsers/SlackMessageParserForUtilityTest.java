package com.prisch.parsers;

import com.prisch.responders.ChangelogResponder;
import com.prisch.responders.HelpResponder;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SlackMessageParserForUtilityTest {

    @Test
    public void shouldParseHelp() {
        ParsedResult result = SlackMessageParser.parse("help", null);
        assertTrue(result.hasResponder());
        assertTrue(result.getResponder() instanceof HelpResponder);
    }

    @Test
    public void shouldParseChangelog() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show changelog", null));
        results.add(SlackMessageParser.parse("display changelog", null));

        results.stream().forEach(result -> {
            assertTrue(result.hasResponder());
            assertTrue(result.getResponder() instanceof ChangelogResponder);
        });
    }
}
