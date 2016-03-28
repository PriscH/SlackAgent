package com.ullink.slack.simpleslackapi.impl;

import com.ullink.slack.simpleslackapi.SlackAttachment;
import org.json.simple.JSONObject;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Expose the package protected implementations.
 */
public class ExposedSlackJSONAttachmentFormatter {

    public static List<JSONObject> encodeAttachments(Collection<? extends SlackAttachment> attachments) {
        if (attachments == null || attachments.isEmpty()) {
            return new LinkedList<>();
        }

        SlackAttachment[] attachmentArray = new SlackAttachment[attachments.size()];
        attachments.toArray(attachmentArray);
        return SlackJSONAttachmentFormatter.encodeAttachments(attachmentArray);
    }
}
