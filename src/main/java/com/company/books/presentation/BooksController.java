package com.company.books.presentation;

import com.company.books.entity.Book;
import com.company.books.Service.BookService;
import com.company.books.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@ResponseBody
@RestController
 class BooksController {

    @Autowired
    private BookService bookservice;

    @Autowired
    private WarehouseRepository warehouseRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping(path = "/books/{bookId}")
    public Book getBook(Integer bookId) {
        return bookservice.getBook(bookId);
    }

    @PostMapping(path = "/books")
    public void addBook(@RequestBody Book books) {
        bookservice.addBook(books);
    }

    @PutMapping("/books/{books}")
    public void updateBook(@PathVariable String bookId, @RequestBody Book books) {
        bookservice.updateBook(bookId, books);
    }

    @DeleteMapping("books/{bookId}")
    public void deleteBook(@PathVariable Integer bookId) {
            bookservice.deleteBook(bookId);
    }
}

