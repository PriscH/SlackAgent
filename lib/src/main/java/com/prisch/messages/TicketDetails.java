package com.prisch.messages;

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

        private String subject;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }
    }
}
