package com.example.bridgelabsproject.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String printHello(){
        return "Hello From BridgeLabz !!!";
    }
    @GetMapping("/query")
    public String printHelloFromQuery(@RequestParam String name){
        return "Hello From "+ ""+name +" !!! ";

    }
    @GetMapping("/{name}")
    public String helloFromPath(@PathVariable String name){
        return "Hello From "+ ""+name +" !!! ";

    }
    @PostMapping("/hello/mark")
    public String printNames(@RequestBody String firstname,String lastname){
        return "Hello to BridgeLabz -- "+ firstname+" "+ lastname;
    }

}
