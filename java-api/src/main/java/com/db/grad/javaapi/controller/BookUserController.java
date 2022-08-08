package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.BookUserRepository;
import com.db.grad.javaapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookUserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookUserRepository bookUserRepository;

    @GetMapping("bookuser/all")
    public List<BookUser> getAllBookUsers() {
        return bookUserRepository.findAll();
    }

    @GetMapping("bookuser/user/{user_id}")
    public ResponseEntity<User> getUser(@PathVariable(value = "user_id") Long id)
        throws ResourceNotFoundException {
        User result = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("User for id: %s not found", id)
                ));
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("bookuser/book/{book_id}")
    public ResponseEntity<Book> getBook(@PathVariable(value = "book_id") Long id)
            throws ResourceNotFoundException {
        Book result = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("User for id: %s not found", id)
                ));
        return ResponseEntity.ok().body(result);
    }

}
