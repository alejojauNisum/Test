package com.nisum.interview.entity;

import com.nisum.interview.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByAuthorAndTitle(String author, String title);
}