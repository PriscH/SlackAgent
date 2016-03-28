package com.prisch.slack;

import com.ullink.slack.simpleslackapi.*;
import com.ullink.slack.simpleslackapi.impl.ExposedSlackJSONAttachmentFormatter;
import com.ullink.slack.simpleslackapi.impl.SlackChatConfiguration;
import com.ullink.slack.simpleslackapi.listeners.*;
import com.ullink.slack.simpleslackapi.replies.GenericSlackReply;
import com.ullink.slack.simpleslackapi.replies.SlackChannelReply;
import com.ullink.slack.simpleslackapi.replies.SlackMessageReply;
import com.ullink.slack.simpleslackapi.replies.SlackReply;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SlackSession implements com.ullink.slack.simpleslackapi.SlackSession {

    private static final String CHAT_POST_MESSAGE_COMMAND = "chat.postMessage";

    private final com.ullink.slack.simpleslackapi.SlackSession delegate;

    private SlackSession(com.ullink.slack.simpleslackapi.SlackSession delegate) {
        this.delegate = delegate;
    }

    public static SlackSession wrap(com.ullink.slack.simpleslackapi.SlackSession delegate) {
        return new SlackSession(delegate);
    }

    // ===== Extension =====

    public SlackMessageHandle<GenericSlackReply> sendMessage(SlackChannel channel, String message, Collection<? extends SlackAttachment> attachments) {
        Map<String, String> arguments = new HashMap<>();
        
        arguments.put("channel", channel.getId());
        arguments.put("text", message);
        arguments.put("as_user", "true");

        if (attachments != null && !attachments.isEmpty()) {
            arguments.put("attachments", ExposedSlackJSONAttachmentFormatter.encodeAttachments(attachments).toString());
        }

        return delegate.postGenericSlackCommand(arguments, CHAT_POST_MESSAGE_COMMAND);
    }

    // ===== Delegation =====

    @Override
    public Collection<SlackChannel> getChannels() {
        return delegate.getChannels();
    }

    @Override
    public Collection<SlackUser> getUsers() {
        return delegate.getUsers();
    }

    @Override
    public Collection<SlackBot> getBots() {
        return delegate.getBots();
    }

    @Override
    public SlackChannel findChannelByName(String channelName) {
        return delegate.findChannelByName(channelName);
    }

    @Override
    public SlackChannel findChannelById(String channelId) {
        return delegate.findChannelById(channelId);
    }

    @Override
    public SlackUser findUserById(String userId) {
        return delegate.findUserById(userId);
    }

    @Override
    public SlackUser findUserByUserName(String userName) {
        return delegate.findUserByUserName(userName);
    }

    @Override
    public SlackUser findUserByEmail(String userMail) {
        return delegate.findUserByEmail(userMail);
    }

    @Override
    public SlackPersona sessionPersona() {
        return delegate.sessionPersona();
    }

    @Override
    @Deprecated
    public SlackBot findBotById(String botId) {
        return delegate.findBotById(botId);
    }

    @Override
    public SlackMessageHandle<GenericSlackReply> inviteUser(String email, String firstName, boolean setActive) {
        return delegate.inviteUser(email, firstName, setActive);
    }

    @Override
    public void connect() throws IOException {
        delegate.connect();
    }

    @Override
    public void disconnect() throws IOException {
        delegate.disconnect();
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> deleteMessage(String timeStamp, SlackChannel channel) {
        return delegate.deleteMessage(timeStamp, channel);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, com.ullink.slack.simpleslackapi.SlackAttachment attachment, SlackChatConfiguration chatConfiguration) {
        return delegate.sendMessage(channel, message, attachment, chatConfiguration);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, com.ullink.slack.simpleslackapi.SlackAttachment attachment) {
        return delegate.sendMessage(channel, message, attachment);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> sendMessageToUser(SlackUser user, String message, com.ullink.slack.simpleslackapi.SlackAttachment attachment) {
        return delegate.sendMessageToUser(user, message, attachment);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> sendMessageToUser(String userName, String message, com.ullink.slack.simpleslackapi.SlackAttachment attachment) {
        return delegate.sendMessageToUser(userName, message, attachment);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> updateMessage(String timeStamp, SlackChannel channel, String message) {
        return delegate.updateMessage(timeStamp, channel, message);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> sendMessageOverWebSocket(SlackChannel channel, String message, com.ullink.slack.simpleslackapi.SlackAttachment attachment) {
        return delegate.sendMessageOverWebSocket(channel, message, attachment);
    }

    @Override
    public SlackMessageHandle<SlackMessageReply> addReactionToMessage(SlackChannel channel, String messageTimeStamp, String emojiCode) {
        return delegate.addReactionToMessage(channel, messageTimeStamp, emojiCode);
    }

    @Override
    public SlackMessageHandle<SlackChannelReply> joinChannel(String channelName) {
        return delegate.joinChannel(channelName);
    }

    @Override
    public SlackMessageHandle<SlackChannelReply> leaveChannel(SlackChannel channel) {
        return delegate.leaveChannel(channel);
    }

    @Override
    public SlackMessageHandle<SlackChannelReply> inviteToChannel(SlackChannel channel, SlackUser user) {
        return delegate.inviteToChannel(channel, user);
    }

    @Override
    public SlackMessageHandle<SlackReply> archiveChannel(SlackChannel channel) {
        return delegate.archiveChannel(channel);
    }

    @Override
    public SlackMessageHandle<SlackChannelReply> openDirectMessageChannel(SlackUser user) {
        return delegate.openDirectMessageChannel(user);
    }

    @Override
    public SlackMessageHandle<SlackChannelReply> openMultipartyDirectMessageChannel(SlackUser... users) {
        return delegate.openMultipartyDirectMessageChannel(users);
    }

    @Override
    public SlackPersona.SlackPresence getPresence(SlackPersona persona) {
        return delegate.getPresence(persona);
    }

    @Override
    public SlackMessageHandle<GenericSlackReply> postGenericSlackCommand(Map<String, String> params, String command) {
        return delegate.postGenericSlackCommand(params, command);
    }

    @Override
    public void addchannelArchivedListener(SlackChannelArchivedListener listener) {
        delegate.addchannelArchivedListener(listener);
    }

    @Override
    public void removeChannelArchivedListener(SlackChannelArchivedListener listener) {
        delegate.removeChannelArchivedListener(listener);
    }

    @Override
    public void addchannelCreatedListener(SlackChannelCreatedListener listener) {
        delegate.addchannelCreatedListener(listener);
    }

    @Override
    public void removeChannelCreatedListener(SlackChannelCreatedListener listener) {
        delegate.removeChannelCreatedListener(listener);
    }

    @Override
    public void addchannelDeletedListener(SlackChannelDeletedListener listener) {
        delegate.addchannelDeletedListener(listener);
    }

    @Override
    public void removeChannelDeletedListener(SlackChannelDeletedListener listener) {
        delegate.removeChannelDeletedListener(listener);
    }

    @Override
    public void addChannelRenamedListener(SlackChannelRenamedListener listener) {
        delegate.addChannelRenamedListener(listener);
    }

    @Override
    public void removeChannelRenamedListener(SlackChannelRenamedListener listener) {
        delegate.removeChannelRenamedListener(listener);
    }

    @Override
    public void addChannelUnarchivedListener(SlackChannelUnarchivedListener listener) {
        delegate.addChannelUnarchivedListener(listener);
    }

    @Override
    public void removeChannelUnarchivedListener(SlackChannelUnarchivedListener listener) {
        delegate.removeChannelUnarchivedListener(listener);
    }

    @Override
    public void addMessageDeletedListener(SlackMessageDeletedListener listener) {
        delegate.addMessageDeletedListener(listener);
    }

    @Override
    public void removeMessageDeletedListener(SlackMessageDeletedListener listener) {
        delegate.removeMessageDeletedListener(listener);
    }

    @Override
    public void addMessagePostedListener(SlackMessagePostedListener listener) {
        delegate.addMessagePostedListener(listener);
    }

    @Override
    public void removeMessagePostedListener(SlackMessagePostedListener listener) {
        delegate.removeMessagePostedListener(listener);
    }

    @Override
    public void addMessageUpdatedListener(SlackMessageUpdatedListener listener) {
        delegate.addMessageUpdatedListener(listener);
    }

    @Override
    public void removeMessageUpdatedListener(SlackMessageUpdatedListener listener) {
        delegate.removeMessageUpdatedListener(listener);
    }

    @Override
    public void addGroupJoinedListener(SlackGroupJoinedListener listener) {
        delegate.addGroupJoinedListener(listener);
    }

    @Override
    public void removeGroupJoinedListener(SlackGroupJoinedListener listener) {
        delegate.removeGroupJoinedListener(listener);
    }

    @Override
    public void addSlackConnectedListener(SlackConnectedListener listner) {
        delegate.addSlackConnectedListener(listner);
    }

    @Override
    public void removeSlackConnectedListener(SlackConnectedListener listener) {
        delegate.removeSlackConnectedListener(listener);
    }

    @Override
    public boolean isConnected() {
        return delegate.isConnected();
    }

    @Override
    public void addReactionAddedListener(ReactionAddedListener listener) {
        delegate.addReactionAddedListener(listener);
    }

    @Override
    public void removeReactionAddedListener(ReactionAddedListener listener) {
        delegate.removeReactionAddedListener(listener);
    }

    @Override
    public void addReactionRemovedListener(ReactionRemovedListener listener) {
        delegate.addReactionRemovedListener(listener);
    }

    @Override
    public void removeReactionRemovedListener(ReactionRemovedListener listener) {
        delegate.removeReactionRemovedListener(listener);
    }
}
