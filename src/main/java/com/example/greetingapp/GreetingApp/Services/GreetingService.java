package com.example.greetingapp.GreetingApp.Services;

import com.example.greetingapp.GreetingApp.DTO.UserDTO;
import com.example.greetingapp.GreetingApp.Entity.GreetingEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {
    private final List<GreetingEntity> greetingList = new ArrayList<>();

    public String getGreeting() {
        GreetingEntity greeting = new GreetingEntity("Hello World");
        greetingList.add(greeting);
        return "{ \"message\": \"Hello World\" }";
    }

    public String getPersonalizedGreeting(UserDTO user) {
        String message;
        if (user.getFirstName() != null && user.getLastName() != null) {
            message = "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
        } else if (user.getFirstName() != null) {
            message = "Hello, " + user.getFirstName() + "!";
        } else if (user.getLastName() != null) {
            message = "Hello, " + user.getLastName() + "!";
        } else {
            message = "Hello World";
        }

        GreetingEntity greeting = new GreetingEntity(message);
        greetingList.add(greeting);
        return "{ \"message\": \"" + message + "\" }";
    }

    public List<GreetingEntity> getAllGreetings() {
        return greetingList;
    }
}