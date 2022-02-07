package com.company.books.Kafka;

import com.company.books.Service.BookService;
import com.company.books.dto.Request.BookLocationDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;



@Service
public class Consumer {

    @Autowired
    BookService bookService;

    @KafkaListener(topics = "MenageService", groupId = "group_id")
    @KafkaHandler
    public void consume(@Payload String message) {
        String stringCanParse = cutStartAndEnd(message);
        BookLocationDTO bookLocationDTO = new Gson().fromJson(stringCanParse, BookLocationDTO.class);
        bookService.addBook(bookLocationDTO);
        System.out.println("message = " + message);
    }
    public String cutStartAndEnd(String line){
        return line;
    }
}
