package com.picture.service;

import com.picture.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();

    void addNewProduct(Product product);

    Product getProductById(int productId);

    void updateProduct(Product product);

    void deleteProduct(int productId);
}
