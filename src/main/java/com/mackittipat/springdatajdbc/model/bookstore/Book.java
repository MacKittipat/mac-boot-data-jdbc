package com.mackittipat.springdatajdbc.model.bookstore;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
public class Book {

    @Id
    private Long id;
    @Column("BOOK_TITLE")
    private String title;
    private Float price;
    private Author author;
}
