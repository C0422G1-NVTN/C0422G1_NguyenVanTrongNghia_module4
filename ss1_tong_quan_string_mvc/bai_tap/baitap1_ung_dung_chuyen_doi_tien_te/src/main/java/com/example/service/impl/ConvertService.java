package com.example.service.impl;

import com.example.service.IConvertService;
import org.springframework.stereotype.Service;

@Service
public class ConvertService implements IConvertService {
    @Override
    public double convertUsdAndVnd(double usd) {
        return usd * 23000;
    }
}
