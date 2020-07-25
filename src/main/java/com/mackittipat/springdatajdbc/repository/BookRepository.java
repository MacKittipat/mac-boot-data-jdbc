package com.mackittipat.springdatajdbc.repository;

import com.mackittipat.springdatajdbc.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
