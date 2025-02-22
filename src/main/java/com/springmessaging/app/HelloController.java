package com.springmessaging.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String uc1() {
        return "Hello from Bridgelabz";
    }

    //Respond to GET request at "/hello/query" with a name query parameter
    @GetMapping("/hello/query")
    public String uc2(@RequestParam String name) {
        return "Hello " + name + "Welcome to bridgelabz!";
    }

    @GetMapping("/hello/param/{name}")
    public String uc3(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // POST request to "/hello/post" with User details in the body
    @GetMapping("/hello/post")
    public String uc4(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from Bridgelabz";

    }
}