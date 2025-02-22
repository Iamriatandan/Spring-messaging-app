package com.springmessaging.app;

import com.springmessaging.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.management.ValueExp;

@RestController
@RequestMapping
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
    @PostMapping("/hello/post")
    public String uc4(@RequestBody UserDto user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz";

    }
    
    @PutMapping("hello/put/{firstName}/")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}