package com.example.indianms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hoilday {
    @GetMapping("/goa")
    public String getData(){
        return "please book your ticket";
    }
}
