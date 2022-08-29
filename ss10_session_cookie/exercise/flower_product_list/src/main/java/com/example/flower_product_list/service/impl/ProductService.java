package com.example.flower_product_list.service.impl;

import com.example.flower_product_list.model.Product;
import com.example.flower_product_list.repository.IProductRepository;
import com.example.flower_product_list.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
@Autowired
private IProductRepository iProductRepository;
    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }
}
