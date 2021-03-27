package com.mackittipat.springdatajdbc.model.school;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Student {

    @Id
    private Long id;
    private String fullName;
}
