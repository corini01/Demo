package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {
    @GetMapping()
    public String api() {
        return "Home";
    }
}