package com.example.case_study_module4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuramaController {
    @GetMapping(value = "/")
    public String home(){
        return "home/home";
    }
}
