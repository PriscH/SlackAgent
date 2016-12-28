package com.prisch.handlers;

import com.overzealous.remark.Options;
import com.overzealous.remark.Remark;
import com.prisch.collections.Lists;
import com.prisch.formatters.Formatters;
import com.prisch.messages.TicketDetails;
import com.prisch.slack.SlackAttachmentFactory;
import com.ullink.slack.simpleslackapi.*;

import java.util.Comparator;
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
        SlackPreparedMessage.Builder slackMessageBuilder = new SlackPreparedMessage.Builder();

        String messageText = escape(buildMessageText(response));
        slackMessageBuilder.withMessage(messageText);

        if (!response.getNotes().isEmpty()) {
            List<SlackAttachment> attachments = buildNoteAttachments(response.getNotes());
            slackMessageBuilder.withAttachments(attachments);
        }

        if (response.getUserReference().isPresent()) {
            SlackUser receiver = slackSession.findUserById(response.getUserReference().get());
            if (receiver.isBot()) {
                slackSession.sendMessage(slackChannel, "Sorry, I only talk to humans.");
            } else {
                String receiverName = receiver.getRealName().trim().isEmpty() ? receiver.getUserName() : receiver.getRealName();

                SlackUser receiverUser = slackSession.findUserById(response.getUserReference().get());
                slackSession.sendMessageToUser(receiverUser, slackMessageBuilder.build());
                slackSession.sendMessage(slackChannel, String.format("Okay, I shared %s with %s", response.getTicketNumber(), receiverName));
            }
        } else {
            SlackAction slackAction = new SlackAction();
            slackAction.setName("Test");
            slackAction.setValue("Test");

            SlackAttachment slackAttachment = new SlackAttachment();
            slackAttachment.addAction(slackAction);
            slackMessageBuilder.withAttachments(Lists.of(slackAttachment));

            slackSession.sendMessage(slackChannel, slackMessageBuilder.build());
        }
    }

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
