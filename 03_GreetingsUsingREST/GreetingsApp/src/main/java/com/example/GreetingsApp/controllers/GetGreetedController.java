package com.example.GreetingsApp.controllers;

import com.example.GreetingsApp.models.Message;
import com.example.GreetingsApp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getgreeted")
public class GetGreetedController {

    @Autowired
    public GreetingService gs;
    @PostMapping("/")
    public String addMessage(@RequestBody Message msg) {
        return gs.getGreeting(msg);
    }
    @PutMapping("/{id}")
    public void updateGreeting(@PathVariable  long id,@RequestBody  Message msg){
        gs.updateGreeting(id,msg);
    }
    @GetMapping("/{userid}")
    public  String getMessageById(@PathVariable long userid){
        return gs.getGreetingById(userid);
    }
    @GetMapping("/getAllUsers")
    public List<Message> getAllGreetings(){
        return gs.getAllGreetings();
    }
    @GetMapping("/getAllGreetings")
    public List<String> getAllGreetingsInString(){
        return gs.getAllGreetingsInMessage();
    }
    @DeleteMapping("/{id}")
    public void deleteGreeting(@PathVariable  long id){
        gs.deleteGreeting(id);
    }
}
