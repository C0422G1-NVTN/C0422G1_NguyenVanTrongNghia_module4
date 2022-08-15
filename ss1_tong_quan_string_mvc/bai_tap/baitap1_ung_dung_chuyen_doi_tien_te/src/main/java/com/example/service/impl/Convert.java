package com.example.service.impl;

import com.example.service.IConvert;
import org.springframework.stereotype.Service;

@Service
public class Convert implements IConvert {
    @Override
    public double convertUsdAndVnd(double usd) {
        return usd * 23000;
    }
}
