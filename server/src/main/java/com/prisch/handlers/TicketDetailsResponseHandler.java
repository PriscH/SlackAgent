package com.prisch.handlers;

import com.overzealous.remark.Options;
import com.overzealous.remark.Remark;
import com.prisch.collections.Lists;
import com.prisch.formatters.Formatters;
import com.prisch.messages.TicketDetails;
import com.prisch.slack.*;
import com.ullink.slack.simpleslackapi.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.prisch.formatters.Formatters.capitalize;
import static com.prisch.slack.SlackFormatter.*;

public class TicketDetailsResponseHandler {

    private final SlackSession slackSession;
    private final SlackChannel slackChannel;

    private final Remark remarker = new Remark(Options.markdown());

    // === Constructor ===

    public TicketDetailsResponseHandler(SlackSession slackSession, SlackChannel slackChannel) {
        this.slackSession = slackSession;
        this.slackChannel = slackChannel;
    }

    // === API ===

    public void process(TicketDetails.Response response) {
        SlackPreparedMessage.Builder slackMessageBuilder = new SlackPreparedMessage.Builder();

        String messageText = escape(buildMessageText(response));
        slackMessageBuilder.withMessage(messageText);

        if (response.getNotes().isEmpty()) {
            Optional<SlackAttachment> actionAttachment = buildActionsAttachment(response);
            if (actionAttachment.isPresent()) {
                slackMessageBuilder.withAttachments(Lists.of(actionAttachment.get()));
            }
        } else {
            List<SlackAttachment> noteAttachments = buildNoteAttachments(response.getNotes());
            slackMessageBuilder.withAttachments(noteAttachments);
        }

        sendMessage(response, slackMessageBuilder.build());
    }

    // === Functionality ===

    private void sendMessage(TicketDetails.Response response, SlackPreparedMessage slackMessage) {
        if (response.getUserReference().isPresent()) {
            SlackUser receiver = slackSession.findUserById(response.getUserReference().get());
            if (receiver.isBot()) {
                slackSession.sendMessage(slackChannel, "Sorry, I only talk to humans.");
            } else {
                String receiverName = receiver.getRealName().trim().isEmpty() ? receiver.getUserName() : receiver.getRealName();

                SlackUser receiverUser = slackSession.findUserById(response.getUserReference().get());
                slackSession.sendMessageToUser(receiverUser, slackMessage);
                slackSession.sendMessage(slackChannel, String.format("Okay, I shared %s with %s", response.getTicketNumber(), receiverName));
            }
        } else {
            slackSession.sendMessage(slackChannel, slackMessage);
        }
    }

    // === Message Builders ===

    private String buildMessageText(TicketDetails.Response response) {
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

        stringBuilder.append(newline());

        return stringBuilder.toString();
    }

    private Optional<SlackAttachment> buildActionsAttachment(TicketDetails.Response response) {
        SlackAction slackAction = new SlackAction();
        slackAction.setText("Add Note");
        slackAction.setName("add_note");
        slackAction.setType("button");

        SlackAttachment slackAttachment = new SlackAttachment();
        slackAttachment.setText("Available Actions:");
        slackAttachment.setCallbackId("ticket_actions");
        slackAttachment.addAction(slackAction);

        return Optional.of(slackAttachment);
    }

    private List<SlackAttachment> buildNoteAttachments(List<TicketDetails.Note> notes) {
        notes.sort(Comparator.comparing(TicketDetails.Note::getModifiedDateTime));
        return notes.stream().map(this::noteToAttachment).collect(Collectors.toList());
    }

    private SlackAttachment noteToAttachment(TicketDetails.Note note) {
        SlackAttachment slackAttachment = SlackAttachmentFactory.create();
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
