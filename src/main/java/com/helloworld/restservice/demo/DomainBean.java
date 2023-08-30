package com.helloworld.restservice.demo;

// Importing class
import lombok.Data;

// Annotation
@Data
public class DomainBean {

    String id;
    String first_name;
    String last_name;
    String birthdate;
    String license_number;

}