package com.example.greetingapp.GreetingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "{ \"message\": \"Hello, Welcome to the Greeting App!\" }";
    }

    @PostMapping
    public String postGreeting() {
        return "{ \"message\": \"Greeting created successfully!\" }";
    }

    @PutMapping
    public String putGreeting() {
        return "{ \"message\": \"Greeting updated successfully!\" }";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{ \"message\": \"Greeting deleted successfully!\" }";
    }
}