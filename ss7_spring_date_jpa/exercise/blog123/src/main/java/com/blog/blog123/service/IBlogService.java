package com.blog.blog123.service;

import com.blog.blog123.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(String keyword, String categoryName, Pageable pageable);

    Blog findBlogById(int id);

    void saveBlog(Blog blog);

    void deleteBlogById(int id);
}
