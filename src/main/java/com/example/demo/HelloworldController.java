package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
    @RequestMapping("/name")
    public String getName(){
        return "abhishek Rasamalla";
    }

}