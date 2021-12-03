package com.example.dockerDemo.dockerDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HelloWorldController {
    @GetMapping("/get")
    public String helloWorld() {
        return "Hello World!";
    }
}
