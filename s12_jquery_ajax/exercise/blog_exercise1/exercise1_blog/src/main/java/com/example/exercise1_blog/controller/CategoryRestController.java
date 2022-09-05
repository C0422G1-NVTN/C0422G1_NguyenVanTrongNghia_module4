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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoryRest")
public class CategoryRestController {

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping(value = "/list")
    public ResponseEntity<Page<Category>> goCategoryList(@PageableDefault(size = 5) Pageable pageable){
        Page<Category> categoryPage = this.iCategoryService.findAll(pageable);

        if (!categoryPage.hasContent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryPage,HttpStatus.OK);
    }
}
