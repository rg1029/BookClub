package com.example.bookclub.services;

import com.example.bookclub.models.Book;
import com.example.bookclub.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void create(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book getOne(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    public void update(Book book) {
        bookRepository.save(book);
    }

    public void destroy(Book book) {
        bookRepository.delete(book);
    }
}