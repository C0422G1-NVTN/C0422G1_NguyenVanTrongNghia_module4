package com.example.blog_ss13.service;

import com.example.blog_ss13.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    Page<Category> findAllByNameContaining(String keySearch, Pageable pageable);

    void saveCategory(Category category);

    Category findById(int id);

    void deleteCategory(int id);
}
