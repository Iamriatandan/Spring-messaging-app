package com.springmessaging.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String uc1(){
        return "Hello from Bridgelabz";
    }

    //Respond to GET request at "/hello/query" with a name query parameter
    @GetMapping("/hello/query")
    public String uc2(@RequestParam String name){
        return "Hello " + name + "Welcome to bridgelabz!";
    }
    @GetMapping("/hello/param/{name}")
    public String uc3(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
