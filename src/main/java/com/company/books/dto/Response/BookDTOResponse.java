package com.company.books.dto.Response;

import com.company.books.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTOResponse {
    private String title;
    private String author;
    private String type;
    private double price;
    private String language;
    private String isbn13;

    public BookDTOResponse(Book book) {
        this.title = getTitle();
        this.author = getAuthor();
        this.type = getType();
        this.price = getPrice();
        this.language = getLanguage();
        this.isbn13 = getIsbn13();
    }
}
