package com.db.grad.javaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public String getWelcome() {
    return "Dogs API is up and running!";
  }

  @GetMapping("/hello")
  public String helloWorld() {
    return "Hello, user. You have added this endpoint successfully";
  }

  @GetMapping("/test")
  public String testAPI() {
    return "API test: Working";
  }
}
