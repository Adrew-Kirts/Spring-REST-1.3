package com.helloworld.restservice.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/JSON")
public class RestJsonResponse {

//@Repository
public static ArrayList<Customer> arr = new ArrayList<>();

    static {
        Customer userOne = new Customer();
        userOne.setId("1");
        userOne.setFirst_name("Alice");
        userOne.setLast_name("Dupont");
        userOne.setBirthdate("1985-03-15");
        userOne.setLicense_number("A1B2C3D4E");


        Customer userTwo = new Customer();
        userTwo.setId("2");
        userTwo.setFirst_name("Marie");
        userTwo.setLast_name("Teneve");
        userTwo.setBirthdate("1989-08-12");
        userTwo.setLicense_number("CSG5C3DKJ");


        arr.add(userOne);
        arr.add(userTwo);
    }

    @GetMapping
    public ArrayList<Customer> getAllUsers() {

//        ArrayList<Customer> arr = new ArrayList<>();
//
//        Customer userOne = new Customer();
//        userOne.setId("1");
//        userOne.setFirst_name("Alice");
//        userOne.setLast_name("Dupont");
//        userOne.setBirthdate("1985-03-15");
//        userOne.setLicense_number("A1B2C3D4E");
//
//
//        Customer userTwo = new Customer();
//        userTwo.setId("2");
//        userTwo.setFirst_name("Marie");
//        userTwo.setLast_name("Teneve");
//        userTwo.setBirthdate("1989-08-12");
//        userTwo.setLicense_number("CSG5C3DKJ");
//
//
//        arr.add(userOne);
//        arr.add(userTwo);

        return arr;
    }

    @GetMapping("{id}")
    public Customer getUserById(@PathVariable("id") String id) {

//        ArrayList<Customer> arr = new ArrayList<>();
//
//        Customer userOne = new Customer();
//        userOne.setId("1");
//        userOne.setFirst_name("Alice");
//        userOne.setLast_name("Dupont");
//        userOne.setBirthdate("1985-03-15");
//        userOne.setLicense_number("A1B2C3D4E");
//
//
//        Customer userTwo = new Customer();
//        userTwo.setId("2");
//        userTwo.setFirst_name("Marie");
//        userTwo.setLast_name("Teneve");
//        userTwo.setBirthdate("1989-08-12");
//        userTwo.setLicense_number("CSG5C3DKJ");
//
//        arr.add(userOne);
//        arr.add(userTwo);

        for (Customer users : arr) {
            if (users.getId().equals(id)) {
                return users;
            }
        }
        return null;
    }

    @PostMapping(value = "/add")
    public void addCustomer(@RequestBody Customer customer){
        arr.add(customer);
    }


}
