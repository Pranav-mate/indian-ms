package com.example.indianms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class off {
    @GetMapping("/off")
    public String getData(){
        return "yesterday was my off";
    }
}