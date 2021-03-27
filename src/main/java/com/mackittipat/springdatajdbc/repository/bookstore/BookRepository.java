package com.mackittipat.springdatajdbc.repository.bookstore;

import com.mackittipat.springdatajdbc.model.bookstore.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
