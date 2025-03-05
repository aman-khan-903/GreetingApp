package com.example.greetingapp.GreetingApp.Services;

import com.example.greetingapp.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public List<String> getAllGreetings() {
        return greetingRepository.findAllGreetings();
    }
}