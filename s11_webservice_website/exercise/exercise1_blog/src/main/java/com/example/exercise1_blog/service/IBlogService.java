package com.example.exercise1_blog.service;

import com.example.exercise1_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(String keyword, String categoryName, Pageable pageable);

    Page<Blog> findAll(Pageable pageable);

    Blog findBlogById(int id);

    void saveBlog(Blog blog);

    void deleteBlogById(int id);

    List<Blog> findAllByByCategory_Id(int id);
}
