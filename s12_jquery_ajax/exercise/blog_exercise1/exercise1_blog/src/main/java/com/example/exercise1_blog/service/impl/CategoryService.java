package com.example.exercise1_blog.service.impl;

import com.example.exercise1_blog.model.Blog;
import com.example.exercise1_blog.model.Category;
import com.example.exercise1_blog.repository.ICategoryRepository;
import com.example.exercise1_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }
}
