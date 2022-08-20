package com.picture.repository;

import com.picture.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAllProduct(String name);

    void addNewProduct(Product product);

    Product getProductById(int productId);

    void updateProduct(Product product);

    void deleteProduct(int productId);
}
