package com.example.product.service.impl;

import com.example.product.model.Product;
import com.example.product.repository.IProductRepository;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findAllProduct(String name, Pageable pageable) {
        return iProductRepository.findAllByProductNameContaining(name, pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product getProductById(int productId) {
        return iProductRepository.findById(productId).get();
    }

    @Override
    public void deleteProduct(int productId) {
        iProductRepository.deleteById(productId);
    }
}
