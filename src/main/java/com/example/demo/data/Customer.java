package com.example.demo.data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("customer")
public class Customer {
    @Id
    public String id;
    
    @Field("npi_id")
    public String npi;
    
    @Field("firstName")
    public String firstName;
    
    @Field("lastName")
    public String lastName;

    public Customer() {}

    public Customer(String npi, String firstName, String lastName) {
        this.npi = npi;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, npi_id='%s', firstName='%s', lastName='%s']",
                id, npi, firstName, lastName);
    }
}