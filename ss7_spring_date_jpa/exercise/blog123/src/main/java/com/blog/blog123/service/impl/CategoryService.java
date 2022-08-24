package com.blog.blog123.service.impl;

import com.blog.blog123.model.Category;
import com.blog.blog123.repository.ICategoryRepository;
import com.blog.blog123.service.ICategoryService;
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
    public Category findCategoryById(int id) {
        return iCategoryRepository.findById(id).orElse(new Category());
    }

    @Override
    public void saveCategory(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Page<Category> findAllCategory(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }

    @Override
    public void deleteCategoryById(int id) {
        iCategoryRepository.deleteById(id);
    }

    @Override
    public List<Category> findAllCategory() {
        return iCategoryRepository.findAll();
    }
}
