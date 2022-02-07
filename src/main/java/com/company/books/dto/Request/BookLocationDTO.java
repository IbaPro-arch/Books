package com.company.books.dto.Request;

import com.company.books.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookLocationDTO {
    private String title;
    private String author;
    private String type;
    private double price;
    private String language;
    private String isbn13;

    public Book build() {
        Book book = new Book()
                .setTitle(this.title)
                .setAuthor(this.author)
                .setType(this.type)
                .setPrice(this.price)
                .setLanguage(this.language)
                .setIsbn13(this.isbn13);
        return book;
    }
}
