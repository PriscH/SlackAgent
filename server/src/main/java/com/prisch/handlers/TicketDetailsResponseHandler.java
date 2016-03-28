package com.prisch.handlers;

import com.prisch.formatters.Formatters;
import com.prisch.messages.TicketDetails;
import com.prisch.slack.SlackAttachment;
import com.prisch.slack.SlackSession;
import com.ullink.slack.simpleslackapi.SlackChannel;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.prisch.slack.SlackFormatter.*;

public class TicketDetailsResponseHandler {

    private final SlackSession slackSession;
    private final SlackChannel slackChannel;

    public TicketDetailsResponseHandler(SlackSession slackSession, SlackChannel slackChannel) {
        this.slackSession = slackSession;
        this.slackChannel = slackChannel;
    }

    public void process(TicketDetails.Response response) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s: %s (%s)\n", response.getTicketNumber(), bold(response.getTitle()), response.getState()));

        if (response.getAssignee().isPresent()) {
            stringBuilder.append(italics(String.format("Assigned to %s", response.getAssignee().get())));
        } else {
            stringBuilder.append(italics("Not assigned to L3"));
        }

        stringBuilder.append(block(response.getDescription()) + "\n");
        stringBuilder.append(inline(response.getUrl()) + "\n");

        List<SlackAttachment> attachments = new LinkedList<>();
        if (!response.getNotes().isEmpty()) {
            attachments = buildNoteAttachments(response.getNotes());
        }

        String slackMessage = escape(stringBuilder.toString());
        slackSession.sendMessage(slackChannel, slackMessage, attachments);
    }

    private List<SlackAttachment> buildNoteAttachments(List<TicketDetails.Note> notes) {
        notes.sort((a, b) -> a.getModifiedDateTime().compareTo(b.getModifiedDateTime()));
        return notes.stream().map(this::noteToAttachment).collect(Collectors.toList());
    }

    private SlackAttachment noteToAttachment(TicketDetails.Note note) {
        SlackAttachment slackAttachment = new SlackAttachment();

        slackAttachment.setTitle(note.getTitle());
        slackAttachment.setAuthorName(String.format("%s on %s", note.getAuthor(), note.getModifiedDateTime().format(Formatters.DATE_TIME)));

        if (!note.getText().trim().isEmpty()) {
            slackAttachment.setText(note.getText());
        }

        return slackAttachment;
    }

}
