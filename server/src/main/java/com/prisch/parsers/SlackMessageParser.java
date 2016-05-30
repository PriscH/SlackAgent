package com.prisch.parsers;

import edu.stanford.nlp.ling.tokensregex.*;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Angel X. Chang and Christopher D. Manning. 2014. TokensRegex: Defining cascaded regular expressions over tokens. Stanford University Technical Report, 2014.
 */
public class SlackMessageParser {

    private static final String[] PATTERN_FILES = {"patterns/core.rgx", "patterns/utility.rgx", "patterns/show_ticket.rgx"};

    private static final Env MATCHER_ENVIRONMENT = TokenSequencePattern.getNewEnv();
    private static final Properties PIPELINE_PROPERTIES = new Properties();

    static {
        MATCHER_ENVIRONMENT.setDefaultStringMatchFlags(NodePattern.CASE_INSENSITIVE);
        MATCHER_ENVIRONMENT.setDefaultStringPatternFlags(NodePattern.CASE_INSENSITIVE);

        PIPELINE_PROPERTIES.setProperty("annotators", "tokenize");
    }

    private static final StanfordCoreNLP PIPELINE = new StanfordCoreNLP(PIPELINE_PROPERTIES);
    private static final CoreMapExpressionExtractor<MatchedExpression> EXPRESSION_EXTRACTOR = CoreMapExpressionExtractor.createExtractorFromFiles(MATCHER_ENVIRONMENT, PATTERN_FILES);

    public static ParsedResult parse(String message, String senderName) {
        Annotation corpus = new Annotation(message);
        PIPELINE.annotate(corpus);
        List<MatchedExpression> expressions = EXPRESSION_EXTRACTOR.extractExpressions(corpus);

        return expressions.stream().findFirst().flatMap(expression -> {
            return Arrays.stream(ExpressionParser.values()).filter(parser -> parser.toString().equals(expression.getValue().get()))
                                                           .findFirst()
                                                           .map(parser -> parser.parse(expression.getText(), senderName));
        }).orElse(ParsedResult.empty());
    }
}
