package com.bridgelabz.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && !firstName.isBlank() &&
                lastName != null && !lastName.isBlank()) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null && !firstName.isBlank()) {
            return "Hello " + firstName;
        } else if (lastName != null && !lastName.isBlank()) {
            return "Hello " + lastName;
        } else {
            return "Hello World";
        }
    }
}