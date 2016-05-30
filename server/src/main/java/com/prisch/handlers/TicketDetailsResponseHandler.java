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
import com.ullink.slack.simpleslackapi.SlackUser;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.prisch.formatters.Formatters.capitalize;
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

        if (response.getUserReference().isPresent()) {
            stringBuilder.append(italics(bold(capitalize(response.getSenderName().get()))));
            stringBuilder.append(" ");
            stringBuilder.append(italics("asked me to share this ticket with you:"));
            stringBuilder.append(newline() + newline() + newline());
        }

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

        if (response.getUserReference().isPresent()) {
            SlackUser receiver = slackSession.findUserById(response.getUserReference().get());
            if (receiver.isBot()) {
                slackSession.sendMessage(slackChannel, "Sorry, I only talk to humans.");
            } else {
                String receiverName = receiver.getRealName().trim().isEmpty() ? receiver.getUserName() : receiver.getRealName();

                slackSession.sendMessageToUser(response.getUserReference().get(), slackMessage);
                slackSession.sendMessage(slackChannel, String.format("Okay, I shared %s with %s", response.getTicketNumber(), receiverName));
            }
        } else {
            slackSession.sendMessage(slackChannel, slackMessage, attachments);
        }
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
