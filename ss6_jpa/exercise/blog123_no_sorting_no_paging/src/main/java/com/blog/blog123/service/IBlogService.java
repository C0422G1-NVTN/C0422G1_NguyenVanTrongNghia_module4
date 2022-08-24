package com.blog.blog123.service;

import com.blog.blog123.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findBlogById(int id);

    void writeNewBlog(Blog blog);

    void deleteBlog(int id);
}
