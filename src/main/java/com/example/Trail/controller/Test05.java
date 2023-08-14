package com.example.Trail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test05 {
    @GetMapping("m5")
    public String m5(){
        return "Hello m5 method";
    }
}
