package com.product.repository.impl;

import com.product.model.Product;
import com.product.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Quần", "17000vnd", "hàng nhập khẩu", "Dickies"));
        products.put(2, new Product(2, "Áo", "30000vnd", "hàng nhập khẩu", "Dickies"));
        products.put(3, new Product(3, "Mũ", "10000vnd", "nội địa trung", "Gucci"));
        products.put(4, new Product(4, "Nịt", "50000vnd", "Hàn Quốc", "Gucci"));
        products.put(5, new Product(5, "Kính", "100000vnd", "nhập khẩu", "Gucci"));
        products.put(6, new Product(6, "Đồng hồ", "1000000vnd", "nhập khẩu", "Rolex"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        product.setId((int) (Math.random() * 10000));

        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {
        products.replace(product.getId(), product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Integer i : products.keySet()) {
            if (products.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                productList.add(products.get(i));
            }
        }
        return productList;
    }
}
