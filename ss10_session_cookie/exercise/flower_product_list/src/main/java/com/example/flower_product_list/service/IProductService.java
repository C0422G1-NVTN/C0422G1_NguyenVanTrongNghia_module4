package com.example.flower_product_list.service;

import com.example.flower_product_list.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
