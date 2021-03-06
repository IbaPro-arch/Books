package com.company.books.Service;

import com.company.books.dto.Request.BookLocationDTO;
import com.company.books.entity.Book;
import com.company.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService {
//Проклятый
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBook(Integer id) {
        return (Book) bookRepository.findById(id).orElseGet(Book::new);
    }

    public void addBook(BookLocationDTO bookLocationDTO) {
        bookRepository.save(bookLocationDTO.build());
    }

    public void updateBook(String id, Book books) {
        bookRepository.save(books);
    }

    public Integer deleteBook(Integer id) {
        bookRepository.deleteById(id);
        return id;
    }
}