package com.example.flower_product_list.repository;

import com.example.flower_product_list.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
