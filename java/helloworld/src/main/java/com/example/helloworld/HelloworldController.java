package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    
    @GetMapping("/")
    private String hello() {
        return "Hello, World!";
    }

    @GetMapping("/{name}")
    private String helloName(@PathVariable String name) {
        return String.format("Hello, %s!", name);
    }
}
