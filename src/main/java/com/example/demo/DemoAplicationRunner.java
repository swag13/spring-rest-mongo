/*package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.data.Customer;

@Component
public class DemoAplicationRunner implements CommandLineRunner {

	private MongoTemplate mongoTemplate;
	
	public DemoAplicationRunner(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		this.mongoTemplate.save(customer);
		System.out.println("App started");
	}
}
*/