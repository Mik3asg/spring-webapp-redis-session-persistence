package com.example.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String index() {
        return """
               WEBAPP #01 is using REDIS for session persistence, with REDIS hosted on a separate server.<br>
               <a href="/page1">Page 1</a><br>
               <a href="/page2">Page 2</a><br>
               <a href="/page3">Page 3</a><br>
               <a href="/logout">Logout</a>  <!-- Logout Link -->
               """;
    }

    @GetMapping("/page1")
    public String page1() {
        return "Hello, welcome to page 1";
    }

    @GetMapping("/page2")
    public String page2() {
        return "Hello, welcome to page 2";
    }

    @GetMapping("/page3")
    public String page3() {
        return "Hello, welcome to page 3";
    }
}
