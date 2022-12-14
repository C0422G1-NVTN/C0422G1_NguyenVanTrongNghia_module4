package com.example.controller;


import com.example.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @Autowired
    private IConvertService iConvertService;

    @GetMapping("/")
    public String listMoney() {
        return "/listMoney";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double usd, Model model) {
        double result = this.iConvertService.convertUsdAndVnd(usd);
        model.addAttribute("result", result);
        return "/listMoney";
    }
}


