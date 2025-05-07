package com.example.bridgelabsproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldWebController {
    @GetMapping("/helloweb")
    public String getHelloMessage(){
        return "hello.html";
    }
}
