package com.example.greetingapp.GreetingApp.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "{ \"message\": \"Hello World\" }";
    }
}