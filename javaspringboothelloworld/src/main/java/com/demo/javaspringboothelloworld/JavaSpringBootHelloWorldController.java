package com.demo.javaspringboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaSpringBootHelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello world from Sring Boot!";
    }

    @RequestMapping("/goodbye")
    public String goodbyeWorld(){
        return "Goodbye world from Spring Boot!";
    }
}
