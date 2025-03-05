package com.example.greetingapp.GreetingApp.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public String findGreetingById(Long id) {
        return greetings.getOrDefault(id, "Greeting not found");
    }

    public Map<Long, String> findAllGreetings() {
        return greetings;
    }

    // ✅ New Method to Update a Greeting
    public String updateGreeting(Long id, String newMessage) {
        if (greetings.containsKey(id)) {
            greetings.put(id, newMessage);
            return "Greeting updated successfully!";
        }
        return "Greeting not found!";
    }
}