package com.codegym.blog.service;

import com.codegym.blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findBlogById(int id);
    void writeNewBlog(Blog blog);
    void updateBlog(Blog blog);
    void deleteBlog(int id);
}
