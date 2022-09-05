package com.example.exercise1_blog.repository;

import com.example.exercise1_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByTitleContaining(String title,Pageable pageable);
    List<Blog> findByCategoryId(Integer id);
}
