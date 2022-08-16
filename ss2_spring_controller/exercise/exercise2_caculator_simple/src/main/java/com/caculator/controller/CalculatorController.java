package com.caculator.controller;

import com.caculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String displayCalculator() {
        return "/index";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operator, ModelMap modelMap) {
        Map<String, String> map = iCalculatorService.getCalculateResult(num1, num2, operator);
        modelMap.addAllAttributes(map);
        return "/index";
    }
}
