package com.example.Trail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test03 {
    @GetMapping("m3")
    public String m3(){
        return "Hello m3";
    }
}
