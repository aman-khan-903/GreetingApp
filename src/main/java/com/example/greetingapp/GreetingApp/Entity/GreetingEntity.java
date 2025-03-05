package com.example.greetingapp.GreetingApp.Entity;

public class GreetingEntity {
    private static long counter = 0;
    private final long id;
    private String message;

    public GreetingEntity(String message) {
        this.id = ++counter; // Auto-increment ID
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}