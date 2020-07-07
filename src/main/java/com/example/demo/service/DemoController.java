package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Customer;
import com.example.demo.data.CustomerRepository;

@RestController
public class DemoController {

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/customers/firstName/{firstName}")
	public List<Customer> getByFirstName(@PathVariable String firstName) {
		return customerRepository.findByFirstName(firstName);	
	}

	@GetMapping("/customers/lastName/{lastName}")
	public List<Customer> getByLastName(@PathVariable String lastName) {
		return customerRepository.findByLastName(lastName);
	}

	@GetMapping("/customers/npiid/{npiid}")
	public Customer getByNpi(@PathVariable String npiid) {
		return customerRepository.findByNpi(npiid);
	}

	@GetMapping("/customer")
	public String save() {
		Customer customer = new Customer("3", "San", "Diego");
		customerRepository.save(customer);	
		return "success";
	}

}