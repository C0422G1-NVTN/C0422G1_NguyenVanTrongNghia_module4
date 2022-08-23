package com.codegym.blog.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@SpringBootApplication
@Table(name = "blog")
public class Blog {
    @Id
    private Integer id;
    private String tittle;
    private String author;
    private String content;

    public Blog() {
    }

    public Blog(Integer id, String tittle, String author, String content) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
