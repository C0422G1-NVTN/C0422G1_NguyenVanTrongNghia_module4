package com.example.library.service;

import com.example.library.model.BookCard;

public interface IBookCardService {
    void saveBookCard(BookCard bookCard);

    void deleteById(int id);

    BookCard getById(int id);
}
