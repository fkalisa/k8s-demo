package com.example.k8sdemo.controller;

import com.example.k8sdemo.model.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestController
public class TimestampController {


    @GetMapping("/get")
    public MessageResponse getTimestamp(){

        return new MessageResponse("Automate all the things!", Timestamp.valueOf(LocalDateTime.now()).getTime());
    }
}
