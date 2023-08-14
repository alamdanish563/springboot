package com.example.Trail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test06 {
    @GetMapping("m6")
    public String m6(){
        return "Hello m6 Method";
    }
}
