package com.example.greetingapp.GreetingApp.controller;

import com.example.greetingapp.GreetingApp.DTO.UserDTO;
import com.example.greetingapp.GreetingApp.Entity.GreetingEntity;
import com.example.greetingapp.GreetingApp.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PutMapping("/update/{id}")
    public String updateGreeting(@PathVariable Long id, @RequestBody String newMessage) {
        return greetingService.updateGreeting(id, newMessage);
    }
}