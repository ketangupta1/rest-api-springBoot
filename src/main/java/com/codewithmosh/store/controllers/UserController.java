package com.codewithmosh.store.controllers;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users")
    private Iterable<User> getAllUser(){
        return userRepository.findAll();
    }
}
