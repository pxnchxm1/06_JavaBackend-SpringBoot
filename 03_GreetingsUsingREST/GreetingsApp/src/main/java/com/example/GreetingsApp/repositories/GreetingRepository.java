package com.example.GreetingsApp.repositories;


import com.example.GreetingsApp.models.Message;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GreetingRepository extends JpaRepository<Message,Long> {


}