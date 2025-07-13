package com.example.libraryapi.model;

import jakarta.persistence.*;

@Entity  //  Required so JPA knows this is a table
@Table(name = "book")  // (Optional) Sets table name in DB
public class Book {

    @Id  //  Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //  Auto-increment in MySQL
    private Integer id;

    private String title;
    private String author;
    private String isbn;
    private boolean available;

    //  Default constructor
    public Book() {}

    //  Constructor with parameters
    public Book(Integer id, String title, String author, String isbn, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    //  Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

