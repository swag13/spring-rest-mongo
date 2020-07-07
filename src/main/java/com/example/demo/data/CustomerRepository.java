package com.example.demo.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByNpi(String npiid);
    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public Customer save(Customer customer);
}