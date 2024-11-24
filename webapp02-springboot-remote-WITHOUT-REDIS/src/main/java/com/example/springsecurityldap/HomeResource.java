package com.example.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

  @GetMapping("/")
  public String index() {
    return "WEBAPP #02 uses Spring's built-in session management to persist sessions within the same WEBAPP instance.";
  }

}
