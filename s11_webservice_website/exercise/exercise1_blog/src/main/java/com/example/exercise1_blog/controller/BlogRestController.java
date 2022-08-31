package com.example.exercise1_blog.controller;

import com.example.exercise1_blog.model.Blog;
import com.example.exercise1_blog.model.Category;
import com.example.exercise1_blog.service.IBlogService;
import com.example.exercise1_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blogRest")
public class BlogRestController {
    @Autowired
    private ICategoryService iCategoryService;

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/listCategory")
    public ResponseEntity<Page<Category>> getListCategoriesRest(@PageableDefault(size = 3) Pageable pageable) {
        Page<Category> categoryPage = iCategoryService.findAllCategory(pageable);
        if (!categoryPage.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryPage, HttpStatus.OK);
    }

    @GetMapping("/listBlog")
    public ResponseEntity<Page<Blog>> getListBlogsRest(@PageableDefault(size = 3) Pageable pageable) {
        Page<Blog> blogPage = iBlogService.findAll(pageable);
        if (!blogPage.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogPage, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Blog>> getCategoryRest(@PathVariable int id) {
        List<Blog> blogs = iBlogService.findAllByByCategory_Id(id);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogRest(@PathVariable int id) {
        Optional<Blog> blog = Optional.ofNullable(iBlogService.findBlogById(id));
        if (!blog.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog.get(), HttpStatus.OK);
    }
}
