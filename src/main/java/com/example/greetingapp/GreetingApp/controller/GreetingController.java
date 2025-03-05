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

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/{id}")
    public String getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}