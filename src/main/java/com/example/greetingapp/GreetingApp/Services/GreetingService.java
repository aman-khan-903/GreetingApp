package com.example.greetingapp.GreetingApp.Services;

import com.example.greetingapp.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    public String getGreetingById(Long id) {
        return greetingRepository.findGreetingById(id).orElse("Greeting not found");
    }
}