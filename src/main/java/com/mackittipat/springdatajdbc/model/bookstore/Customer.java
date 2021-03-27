package com.mackittipat.springdatajdbc.model.bookstore;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Customer {

    @Id
    private Long id;
    private String name;
    private int age;

}
