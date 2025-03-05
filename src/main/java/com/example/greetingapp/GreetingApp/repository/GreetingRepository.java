package com.example.greetingapp.GreetingApp.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class GreetingRepository {
    private final Map<Long, String> greetings = new HashMap<>();
    private long currentId = 1;

    public GreetingRepository() {
        // Adding a default greeting
        greetings.put(currentId++, "Hello World");
    }

    public String saveGreeting(String message) {
        greetings.put(currentId, message);
        return "Greeting saved with ID: " + currentId++;
    }

    public Optional<String> findGreetingById(Long id) {
        return Optional.ofNullable(greetings.get(id));
    }
}