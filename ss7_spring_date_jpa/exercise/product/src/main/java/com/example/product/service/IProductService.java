package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAllProduct(String name, Pageable pageable);

    void save(Product product);

    Product getProductById(int productId);

    void deleteProduct(int productId);
}
