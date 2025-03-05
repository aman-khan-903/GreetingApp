package com.example.greetingapp.GreetingApp.controller;

import com.example.greetingapp.GreetingApp.DTO.UserDTO;
import com.example.greetingapp.GreetingApp.Services.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    @PostMapping("/personalized")
    public String getPersonalizedGreeting(@RequestBody UserDTO user) {
        return greetingService.getPersonalizedGreeting(user);
    }
}