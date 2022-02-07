package com.company.books.presentation;


import com.company.books.dto.Request.BookLocationDTO;
import com.company.books.dto.Response.BookDTOResponse;
import com.company.books.entity.Book;
import com.company.books.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@ResponseBody
@RestController
 class BooksController {

    @Autowired
    private BookService bookservice;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping(path = "/books/{bookId}")
    public BookDTOResponse getBook(Integer bookId) {
        return new BookDTOResponse(bookservice.getBook(bookId));
    }

    @PostMapping(path = "/books")
    public void addBook(@RequestBody BookLocationDTO books) {
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

