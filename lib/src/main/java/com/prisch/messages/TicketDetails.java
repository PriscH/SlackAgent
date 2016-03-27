package com.prisch.messages;

import java.util.Optional;

public abstract class TicketDetails {

    public static final class Request extends Message {

        private String ticketNumber;

        public String getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
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
    }
}
