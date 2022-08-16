package com.caculator.service;

import java.util.Map;

public interface ICalculatorService {
    Map<String, String> getCalculateResult(double num1, double num2, String operator);
}
