package com.example.exercise1_blog.repository;

import com.example.exercise1_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    Category findCategoryById(int id);
}
