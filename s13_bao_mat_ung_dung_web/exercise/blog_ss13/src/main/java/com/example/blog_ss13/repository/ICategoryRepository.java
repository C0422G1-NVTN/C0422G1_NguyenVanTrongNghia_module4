package com.example.blog_ss13.repository;

import com.example.blog_ss13.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

    Page<Category> findAllByNameContaining(String keySearch, Pageable pageable);
}