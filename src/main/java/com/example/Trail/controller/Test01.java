package com.example.Trail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test01 {
    @GetMapping("m1")
    public String m1(){
        return "Hello Java World";
    }
}
