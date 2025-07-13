package com.example.libraryapi.service; // Use YOUR correct package here

import com.example.libraryapi.model.Book; // Update to your actual model package
import java.util.List;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);

    Book updateBookAvailability(Long id, boolean available);

    // Book updateBookAvailability(Long id, boolean available);
    boolean deleteBook(Long id);

    //Book updateAvailability(int id, boolean available);

   // Book updateAvailability(int id, boolean available);
}

