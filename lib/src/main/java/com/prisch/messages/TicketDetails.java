package com.prisch.messages;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public abstract class TicketDetails {

    public static final class Request extends Message {

        private String ticketNumber;
        private boolean notesIncluded;

        private String userReference;
        private String senderName;

        public String getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public boolean isNotesIncluded() {
            return notesIncluded;
        }

        public void setNotesIncluded(boolean notesIncluded) {
            this.notesIncluded = notesIncluded;
        }

        public Optional<String> getUserReference() {
            return Optional.ofNullable(userReference);
        }

        public void setUserReference(String userReference) {
            this.userReference = userReference;
        }

        public Optional<String> getSenderName() {
            return Optional.ofNullable(senderName);
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }
    }

    public static final class Response extends Message {

        private String ticketNumber;
        private String type;
        private String title;
        private String description;
        private String state;
        private String url;

        private String assignee;
        private List<Note> notes = new LinkedList<>();

        private String userReference;
        private String senderName;

        public String getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Optional<String> getAssignee() {
            return Optional.ofNullable(assignee);
        }

        public void setAssignee(String assignee) {
            this.assignee = assignee;
        }

        public List<Note> getNotes() {
            return notes;
        }

        public void setNotes(List<Note> notes) {
            this.notes = notes;
        }

        public Optional<String> getUserReference() {
            return Optional.ofNullable(userReference);
        }

        public void setUserReference(String userReference) {
            this.userReference = userReference;
        }

        public Optional<String> getSenderName() {
            return Optional.ofNullable(senderName);
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }
    }

    public static final class Note {

        private String title;
        private String text;
        private String author;
        private LocalDateTime modifiedDateTime;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public LocalDateTime getModifiedDateTime() {
            return modifiedDateTime;
        }

        public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
            this.modifiedDateTime = modifiedDateTime;
        }
    }
}
