package com.example.Trail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test04 {
    @GetMapping("m4")
    public String m4(){
        return "Hello m4 method";
    }
}
