package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/all")
    public List <User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        User result = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("user with id %s not found", id)
                ));
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/user/add")
    public User addUser(@Valid @RequestBody User user) {
        return userRepository.saveAndFlush(user);
    }
}
