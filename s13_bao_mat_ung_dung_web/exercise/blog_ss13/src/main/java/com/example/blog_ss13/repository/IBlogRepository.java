package com.example.blog_ss13.repository;

import com.example.blog_ss13.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

}