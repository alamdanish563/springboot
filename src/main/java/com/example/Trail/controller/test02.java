package com.example.Trail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test02{
    @GetMapping("m2")
    public String m2(){
        return "Hello Java";
    }
}
