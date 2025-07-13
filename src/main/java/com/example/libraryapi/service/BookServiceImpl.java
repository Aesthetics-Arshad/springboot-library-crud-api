package com.example.libraryapi.service;


import com.example.libraryapi.model.Book;
import com.example.libraryapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }

    @Override
    public Book updateBookAvailability(Long id, boolean available) {
        Book book = getBookById(id);
        if (book != null) {
            book.setAvailable(available);
            return bookRepository.save(book);
        }
        return null;
    }
    public boolean deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }

//    @Override
//    public Book updateAvailability(int id, boolean available) {
//        return null;
//    }
}

