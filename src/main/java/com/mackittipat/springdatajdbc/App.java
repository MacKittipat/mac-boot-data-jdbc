package com.mackittipat.springdatajdbc;

import com.mackittipat.springdatajdbc.model.Book;
import com.mackittipat.springdatajdbc.model.Customer;
import com.mackittipat.springdatajdbc.model.Subject;
import com.mackittipat.springdatajdbc.repository.BookRepository;
import com.mackittipat.springdatajdbc.repository.CategoryRepository;
import com.mackittipat.springdatajdbc.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Slf4j
@EnableJdbcRepositories
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setName("Python");
        customerRepository.save(customer);
        log.info("Inserted customer table");

        Iterable<Customer> customers = customerRepository.findAll();
        customers.forEach(c -> log.info("Query customer : {}", c.toString()));

        // One to Many
        Iterable<Subject> subjects = categoryRepository.findAll();
        subjects.forEach(sub -> log.info("Query subjects : {}", sub.toString()));

        // One to One
        Iterable<Book> books = bookRepository.findAll();
        books.forEach(b -> log.info("Query book : {}", b.toString()));

    }
}
