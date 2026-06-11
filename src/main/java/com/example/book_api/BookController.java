/* package com.example.book_api;

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
*/

// src/main/java/com/example/bookapi/web/BookController.java
package com.example.book_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public List<String> list() {
        log.info("Getting all books");          // shows general flow
        log.debug("Inside list() method");      // detailed dev info
        return List.of("Clean Code", "Effective Java");
    }

    @PostMapping
    public String add(@RequestBody String title) {
        log.info("Adding a book");
        log.debug("Book title received: {}", title);  // use {} placeholders
        return "Added: " + title;
    }
}
