package com.example.GreetingsApp.services;


import com.example.GreetingsApp.models.Message;
import com.example.GreetingsApp.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository gs;
    private final String  template ="Hello %s";

    public String getGreeting(Message msg){
        String first = msg.getFirstname().isEmpty() ? "firstname" : msg.getFirstname();
        String last = msg.getLastname().isEmpty() ? "lastname" : msg.getLastname();

         gs.save(new Message(first,last));
         return String.format(template,first+" "+last);

    }
    public String getGreetingById(long userid){
        return gs.findById(userid)
                .map(obj -> String.format(template, obj.getFirstname() + " " + obj.getLastname()))
                .orElse("User not found");
    }
    public List<Message> getAllGreetings(){
        return gs.findAll();
    }
    public List<String> getAllGreetingsInMessage(){
        return gs.findAll()
                .stream()
                .map(u -> String.format(template, u.getFirstname() + " " + u.getLastname()))
                .collect(Collectors.toList());
    }
    public String updateGreeting( long id, Message newMsg) {
        return gs.findById(id).map(existing -> {
            existing.setFirstname(newMsg.getFirstname());
            existing.setLastname(newMsg.getLastname());
            gs.save(existing);
            return String.format(template, existing.getFirstname() + " " + existing.getLastname());
        }).orElse("User not found");
    }
    public void deleteGreeting( long id){
        Message msg = gs.findById(id).get();
        gs.delete(msg);
    }


}
