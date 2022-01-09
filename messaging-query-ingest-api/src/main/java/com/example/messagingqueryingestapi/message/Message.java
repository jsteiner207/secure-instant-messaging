package com.example.messagingqueryingestapi.message;

import java.time.LocalDate;

public class Message {

    private Long id;
    private String messageBody;
    private LocalDate sentTimestamp;

    public Message(Long id, String messageBody, LocalDate sentTimestamp) {
        this.id = id;
        this.messageBody = messageBody;
        this.sentTimestamp = sentTimestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public LocalDate getSentTimestamp() {
        return sentTimestamp;
    }

    public void setSentTimestamp(LocalDate sentTimestamp) {
        this.sentTimestamp = sentTimestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", messageBody='" + messageBody + '\'' +
                ", sentTimestamp=" + sentTimestamp +
                '}';
    }
}




