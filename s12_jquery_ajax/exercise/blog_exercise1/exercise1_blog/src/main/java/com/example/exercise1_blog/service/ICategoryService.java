package com.example.exercise1_blog.service;

import com.example.exercise1_blog.model.Blog;
import com.example.exercise1_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);
}