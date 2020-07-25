package com.mackittipat.springdatajdbc.repository;

import com.mackittipat.springdatajdbc.model.Customer;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Optional<Customer> findByName(String name);

    @Query("SELECT * FROM customer WHERE age=:age")
    Iterable<Customer> findByAge(@Param("age") int age);
}
