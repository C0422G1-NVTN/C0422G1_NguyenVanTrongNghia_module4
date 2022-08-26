package com.example.library.service;

import com.example.library.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAllBook();

    Book findBookById(String id);

    void saveBook(Book book);
}
