package com.example.GreetingsApp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("/")
    public String getgreeted(){
        return "Hello From BridgeLabz.... !";
    }
    @GetMapping("/query")
    public String getUserGreeted(@RequestParam String firstname,@RequestParam String lastname){
      return "Hello "+firstname +" "+ lastname;
    }
    @GetMapping("/param/{firstname}/{lastname}")
    public String getgreetedBypath(@PathVariable String firstname,@PathVariable String lastname){
        return "Hello "+firstname +" "+ lastname;
    }
}
