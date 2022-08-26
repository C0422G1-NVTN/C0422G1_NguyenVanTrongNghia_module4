package com.example.library.service.impl;

import com.example.library.model.BookCard;
import com.example.library.repository.IBookCardRepository;
import com.example.library.service.IBookCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCardService implements IBookCardService {
    @Autowired
    private IBookCardRepository iBookCardRepository;

    @Override
    public void saveBookCard(BookCard bookCard) {
        iBookCardRepository.save(bookCard);
    }

    @Override
    public void deleteById(int id) {
        iBookCardRepository.deleteById(id);
    }

    @Override
    public BookCard getById(int id) {
        return iBookCardRepository.findById(id).orElse(new BookCard());
    }
}
