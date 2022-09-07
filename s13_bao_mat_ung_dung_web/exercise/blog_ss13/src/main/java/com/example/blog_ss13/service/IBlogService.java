package com.example.blog_ss13.service;

import com.example.blog_ss13.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {

    Page<Blog> finByName(String title, Pageable pageable);

    void saveBlog(Blog blog);

    Blog findById(int id);

    void deleteBlog(int id);
}
