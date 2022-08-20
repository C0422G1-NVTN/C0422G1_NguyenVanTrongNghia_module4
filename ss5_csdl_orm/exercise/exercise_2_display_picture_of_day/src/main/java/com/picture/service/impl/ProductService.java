package com.picture.service.impl;

import com.picture.model.Product;
import com.picture.repository.IProductRepository;
import com.picture.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void addNewProduct(Product product) {
        iProductRepository.addNewProduct(product);
    }

    @Override
    public Product getProductById(int productId) {
        return iProductRepository.getProductById(productId);
    }

    @Override
    public void updateProduct(Product product) {
        iProductRepository.updateProduct(product);
    }

    @Override
    public void deleteProduct(int productId) {
        iProductRepository.deleteProduct(productId);
    }
}
