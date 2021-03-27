package com.mackittipat.springdatajdbc.model.school;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
public class Subject {

    @Id
    private Long id;
    private String name;
    private Set<Student> students;
}
