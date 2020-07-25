package com.mackittipat.springdatajdbc;

import com.mackittipat.springdatajdbc.model.Customer;
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
        customers.forEach(c -> log.info("Query : " + c.toString()));
    }
}
