package com.prisch.slack;

public class TestSlackMessage extends SlackMessage {

    private TestSlackMessage(String text, String senderUsername, String senderRealName) {
        super(text, senderUsername, senderRealName);
    }

    public static SlackMessage of(String text) {
        return new TestSlackMessage(text, null, null);
    }

    public static final class Builder {

        private String text;
        private String senderUsername;
        private String senderRealname;

        public Builder withText(String text) {
            this.text = text;
            return this;
        }

        public Builder withSenderUsername(String senderUsername) {
            this.senderUsername = senderUsername;
            return this;
        }

        public Builder withSenderRealname(String senderRealname) {
            this.senderRealname = senderRealname;
            return this;
        }

        public SlackMessage build() {
            return new TestSlackMessage(text, senderUsername, senderRealname);
        }
    }
}
