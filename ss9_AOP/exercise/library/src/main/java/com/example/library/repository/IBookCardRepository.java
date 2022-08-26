package com.example.library.repository;

import com.example.library.model.BookCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookCardRepository extends JpaRepository<BookCard,Integer> {
}
