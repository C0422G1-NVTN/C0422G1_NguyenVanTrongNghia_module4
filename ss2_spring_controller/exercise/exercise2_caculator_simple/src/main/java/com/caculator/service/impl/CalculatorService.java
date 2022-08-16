package com.caculator.service.impl;

import com.caculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public Map<String, String> getCalculateResult(double num1, double num2, String operator) {
        Map<String, String> stringMap = new HashMap<>();
        switch (operator) {
            case "+":
                stringMap.put("result", num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                stringMap.put("result", num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                stringMap.put("result", num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    stringMap.put("numberErr", "cannot be divided by zero");
                } else {
                    stringMap.put("result", num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
        }
        return stringMap;
    }
}
