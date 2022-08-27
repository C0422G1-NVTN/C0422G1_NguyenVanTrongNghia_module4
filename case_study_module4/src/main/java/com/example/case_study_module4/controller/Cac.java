package com.example.case_study_module4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cac {
    @GetMapping("")
    public String buoi(){
        return "home/home";
    }
}
