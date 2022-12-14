package com.example.exercise1_blog.service.impl;

import com.example.exercise1_blog.model.Blog;
import com.example.exercise1_blog.repository.IBlogRepository;
import com.example.exercise1_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

    @Override
    public Blog save(Blog blog) {
        return this.iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return this.iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        this.iBlogRepository.delete(findById(id));
    }

    @Override
    public Page<Blog> findAllByTitleContaining(String title, Pageable pageable) {
        return iBlogRepository.findAllByTitleContaining(title, pageable);
    }

    @Override
    public List<Blog> findByCategoryId(Integer id) {
        return iBlogRepository.findByCategoryId(id);
    }

}
