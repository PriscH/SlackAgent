package com.prisch.slack;

public class SlackAttachment extends com.ullink.slack.simpleslackapi.SlackAttachment {

    private static final String AUTHOR_NAME = "author_name";

    public void setAuthorName(String authorName) {
        super.addMiscField(AUTHOR_NAME, authorName);
    }
}
