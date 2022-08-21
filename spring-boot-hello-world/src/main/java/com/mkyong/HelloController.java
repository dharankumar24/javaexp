package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }
 @RequestMapping("/wish")
    String wish() {
        return "Hello Sir/Madam, This is Docker built application.";
    }
}