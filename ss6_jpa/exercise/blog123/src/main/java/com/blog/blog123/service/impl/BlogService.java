package com.blog.blog123.service.impl;

import com.blog.blog123.model.Blog;
import com.blog.blog123.repository.IBlogRepository;
import com.blog.blog123.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Blog findBlogById(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void writeNewBlog(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void deleteBlog(int id) {
        iBlogRepository.delete(findBlogById(id));
    }
}
