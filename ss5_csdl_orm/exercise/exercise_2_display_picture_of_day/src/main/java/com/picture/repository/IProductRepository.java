package com.picture.repository;

import com.picture.model.Product;

import java.util.List;

public interface IProductRepository {
    public List<Product> findAll();

    void addNewProduct(Product product);

    Product getProductById(int productId);

    void updateProduct(Product product);

    void deleteProduct(int productId);
}
