package com.prisch.parsers;

import com.prisch.factories.RequestFactory;
import com.prisch.messages.Message;
import com.prisch.responders.ChangelogResponder;
import com.prisch.responders.HelpResponder;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.tokensregex.Env;
import edu.stanford.nlp.ling.tokensregex.NodePattern;
import edu.stanford.nlp.ling.tokensregex.TokenSequenceMatcher;
import edu.stanford.nlp.ling.tokensregex.TokenSequencePattern;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

/**
 * Angel X. Chang and Christopher D. Manning. 2014. TokensRegex: Defining cascaded regular expressions over tokens. Stanford University Technical Report, 2014.
 */
public class SlackMessageParser {

    private static final Env MATCHER_ENVIRONMENT = TokenSequencePattern.getNewEnv();
    private static final Properties PIPELINE_PROPERTIES = new Properties();

    static {
        MATCHER_ENVIRONMENT.setDefaultStringMatchFlags(NodePattern.CASE_INSENSITIVE);
        MATCHER_ENVIRONMENT.setDefaultStringPatternFlags(NodePattern.CASE_INSENSITIVE);

        MATCHER_ENVIRONMENT.bind("$TICKET", "/[a-z]{3}[0-9]{6}/");
        MATCHER_ENVIRONMENT.bind("$TICKET_DETAILS", "/show|display/ $TICKET");
        MATCHER_ENVIRONMENT.bind("$WITH_NOTES", "/with|and|&/ /note[s]?/");

        PIPELINE_PROPERTIES.setProperty("annotators", "tokenize");
    }

    private static final StanfordCoreNLP PIPELINE = new StanfordCoreNLP(PIPELINE_PROPERTIES);

    private static final TokenSequencePattern TICKET_PATTERN = TokenSequencePattern.compile(MATCHER_ENVIRONMENT, "$TICKET");
    private static final TokenSequencePattern TICKET_DETAILS_PATTERN = TokenSequencePattern.compile(MATCHER_ENVIRONMENT, "$TICKET_DETAILS");
    private static final TokenSequencePattern TICKET_DETAILS_WITH_NOTES_PATTERN = TokenSequencePattern.compile(MATCHER_ENVIRONMENT, "($TICKET_DETAILS | $TICKET) $WITH_NOTES");

    private static final TokenSequencePattern CHANGELOG_PATTERN = TokenSequencePattern.compile(MATCHER_ENVIRONMENT, "/show|display/ changelog");
    private static final TokenSequencePattern HELP_PATTERN = TokenSequencePattern.compile(MATCHER_ENVIRONMENT, "help");

    public static ParsedResult parse(String message) {
        Annotation corpus = new Annotation(message);
        PIPELINE.annotate(corpus);
        List<CoreLabel> tokens = corpus.get(CoreAnnotations.TokensAnnotation.class);

        TokenSequenceMatcher ticketMatcher = TICKET_PATTERN.matcher(tokens);
        if (ticketMatcher.find()) {
            String ticketNumber = ticketMatcher.group().toUpperCase();

            if (tokens.size() == 1) {
                return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
            } else if (TICKET_DETAILS_WITH_NOTES_PATTERN.matcher(tokens).matches()) {
                return ParsedResult.with(RequestFactory.buildTicketDetailsWithNotesRequest(ticketNumber));
            } else if (TICKET_DETAILS_PATTERN.matcher(tokens).matches()) {
                return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
            }
        } else {
            if (CHANGELOG_PATTERN.matcher(tokens).matches()) {
                return ParsedResult.with(new ChangelogResponder());
            } else if (HELP_PATTERN.matcher(tokens).matches()) {
                return ParsedResult.with(new HelpResponder());
            }
        }

        return ParsedResult.empty();
    }
}
