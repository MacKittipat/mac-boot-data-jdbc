package com.mackittipat.springdatajdbc;

import com.mackittipat.springdatajdbc.model.bookstore.Book;
import com.mackittipat.springdatajdbc.model.bookstore.Customer;
import com.mackittipat.springdatajdbc.model.school.Subject;
import com.mackittipat.springdatajdbc.repository.bookstore.BookRepository;
import com.mackittipat.springdatajdbc.repository.school.SubjectRepository;
import com.mackittipat.springdatajdbc.repository.bookstore.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import java.util.Collection;

@Slf4j
@EnableJdbcRepositories
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setName("Python");
        customerRepository.save(customer);
        log.info(">>>>> Inserted customer table");

        Iterable<Customer> customers = customerRepository.findAll();
        customers.forEach(c -> log.info(">>>>> Query customer : {}", c.toString()));

        log.info(">>>>> Query customer by name : {}", customerRepository.findByName("Python").get());

        Iterable<Customer> customerByAges = customerRepository.findByAge(31);
        log.info(">>>>> Count customer by age : {}", ((Collection<Customer>) customerByAges).size());

        // One to Many
        Iterable<Subject> subjects = subjectRepository.findAll();
        subjects.forEach(sub -> log.info(">>>>> Query subjects : {}", sub.toString()));

        // One to One
        Iterable<Book> books = bookRepository.findAll();
        books.forEach(b -> log.info(">>>>> Query book : {}", b.toString()));

    }
}
