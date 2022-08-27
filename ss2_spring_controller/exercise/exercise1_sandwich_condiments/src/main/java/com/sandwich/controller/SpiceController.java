package com.sandwich.controller;

import com.sandwich.service.ISpiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SpiceController {
    @Autowired
    private ISpiceService iSpiceService;

    @GetMapping("/")
    public String spice(Model model) {
        List<String> stringList = iSpiceService.findAllSpice();
        model.addAttribute("listSpice", stringList);
        return "/index";
    }

    @PostMapping("/choose-condiments")
    public String showChooseCondiments(@RequestParam String[] condiment, Model model) {
        if (condiment == null)
        model.addAttribute("condiments", condiment);
        return "/sandwich";
    }
}
