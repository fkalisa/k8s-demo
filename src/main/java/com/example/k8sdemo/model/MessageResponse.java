package com.example.k8sdemo.model;

public class MessageResponse {

    private String message;
    private Long timestamp;

    public String getMessage() {
        return message;
    }


    public MessageResponse(String message, Long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
