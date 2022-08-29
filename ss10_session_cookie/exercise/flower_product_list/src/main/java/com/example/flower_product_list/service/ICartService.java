package com.example.flower_product_list.service;

import com.example.flower_product_list.model.Product;

import java.util.Map;

public interface ICartService {
    void changeCart(Map<Product,Integer> cart, Long id, String expression);

    double total(Map<Product,Integer> cart);
}
