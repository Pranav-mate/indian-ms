package com.example.indianms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class veg {
    @GetMapping("/veg")
    public String getData(){
        return "Book ur veg";
    }
}