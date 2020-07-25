package com.mackittipat.springdatajdbc.repository;

import com.mackittipat.springdatajdbc.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
