package com.mackittipat.springdatajdbc.repository;

import com.mackittipat.springdatajdbc.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Subject, Long> {

}
