package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(String firstName, String lastName) {
        String message;

        if (firstName != null && !firstName.isBlank() &&
                lastName != null && !lastName.isBlank()) {
            message = "Hello " + firstName + " " + lastName;
        } else if (firstName != null && !firstName.isBlank()) {
            message = "Hello " + firstName;
        } else if (lastName != null && !lastName.isBlank()) {
            message = "Hello " + lastName;
        } else {
            message = "Hello World";
        }

        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
}