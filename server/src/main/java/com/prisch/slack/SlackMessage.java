package com.prisch.slack;

import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;

public class SlackMessage {

    private final String text;
    private final String senderUsername;
    private final String senderRealName;

    protected SlackMessage(String text, String senderUsername, String senderRealName) {
        this.text = text;
        this.senderUsername = senderUsername;
        this.senderRealName = senderRealName;
    }

    public static SlackMessage from(SlackMessagePosted slackEvent) {
        return new SlackMessage(slackEvent.getMessageContent(), slackEvent.getSender().getUserName(), slackEvent.getSender().getRealName());
    }

    public String getText() {
        return text;
    }

    public String getSenderUsername() {
        return senderUsername;
    }

    public String getSenderRealName() {
        if (senderRealName.trim().isEmpty()) {
            return getSenderUsername();
        }
        return senderRealName;
    }
}
