package com.prisch.slack;

import com.ullink.slack.simpleslackapi.SlackAttachment;

public class SlackAttachmentFactory {

    // addMarkdownIn required to support Markdown in attachments
    public static SlackAttachment create() {
        SlackAttachment slackAttachment = new SlackAttachment();
        slackAttachment.addMarkdownIn("text");
        return slackAttachment;
    }

}
