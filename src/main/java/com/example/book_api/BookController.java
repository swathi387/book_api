package com.example.book_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    @GetMapping
    public List<Book> getAllBooks() {
        return bookList;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        book.setId((long) (bookList.size() + 1)); // generate ID
        bookList.add(book);
        return book;
    }
}
