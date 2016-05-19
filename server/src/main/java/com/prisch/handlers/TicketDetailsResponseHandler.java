package com.prisch.handlers;

import com.overzealous.remark.Options;
import com.overzealous.remark.Remark;
import com.overzealous.remark.convert.DocumentConverter;
import com.prisch.formatters.Formatters;
import com.prisch.messages.TicketDetails;
import com.prisch.slack.SlackAttachment;
import com.prisch.slack.SlackFormatter;
import com.prisch.slack.SlackSession;
import com.ullink.slack.simpleslackapi.SlackChannel;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.prisch.slack.SlackFormatter.*;

public class TicketDetailsResponseHandler {

    private final SlackSession slackSession;
    private final SlackChannel slackChannel;

    private final Remark remarker = new Remark(Options.markdown());

    public TicketDetailsResponseHandler(SlackSession slackSession, SlackChannel slackChannel) {
        this.slackSession = slackSession;
        this.slackChannel = slackChannel;
    }

    public void process(TicketDetails.Response response) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s: %s (%s)", response.getTicketNumber(), bold(response.getTitle()), response.getState()));
        stringBuilder.append(newline());

        if (response.getAssignee().isPresent()) {
            stringBuilder.append(italics(String.format("Assigned to %s", response.getAssignee().get())));
        } else {
            stringBuilder.append(italics("Not assigned to L3"));
        }

        stringBuilder.append(block(response.getDescription()) + newline());
        stringBuilder.append(inline(response.getUrl()) + newline());

        List<SlackAttachment> attachments = new LinkedList<>();
        if (!response.getNotes().isEmpty()) {
            attachments = buildNoteAttachments(response.getNotes());
            stringBuilder.append(newline());
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

        slackAttachment.enableTextMarkdown();
        slackAttachment.setTitle(note.getTitle());

        StringBuilder noteBuilder = new StringBuilder();
        noteBuilder.append(italics(String.format("%s on %s", note.getAuthor(), note.getModifiedDateTime().format(Formatters.DATE_TIME))));

        if (!note.getText().trim().isEmpty()) {
            noteBuilder.append(newline());
            noteBuilder.append(remarker.convert(note.getText()));
        }

        slackAttachment.setText(noteBuilder.toString());

        return slackAttachment;
    }

}
