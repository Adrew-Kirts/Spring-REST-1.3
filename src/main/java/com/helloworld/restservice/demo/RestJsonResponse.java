package com.helloworld.restservice.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/JSON", produces="application/json")
public class RestJsonResponse {



    @GetMapping
    public ArrayList<DomainBean> get() {

        ArrayList<DomainBean> arr = new ArrayList<>();

        DomainBean userOne = new DomainBean();
        userOne.setId("1");
        userOne.setFirst_name("Alice");
        userOne.setLast_name("Dupont");
        userOne.setBirthdate("1985-03-15");
        userOne.setLicense_number("A1B2C3D4E");


        DomainBean userTwo = new DomainBean();
        userTwo.setId("2");
        userTwo.setFirst_name("Marie");
        userTwo.setLast_name("Teneve");
        userTwo.setBirthdate("1989-08-12");
        userTwo.setLicense_number("CSG5C3DKJ");


        arr.add(userOne);
        arr.add(userTwo);

        return arr;
    }

    @GetMapping("{id}")
    public DomainBean getUserById(@PathVariable("id") String id) {

        ArrayList<DomainBean> arr = new ArrayList<>();

        DomainBean userOne = new DomainBean();
        userOne.setId("1");
        userOne.setFirst_name("Alice");
        userOne.setLast_name("Dupont");
        userOne.setBirthdate("1985-03-15");
        userOne.setLicense_number("A1B2C3D4E");


        DomainBean userTwo = new DomainBean();
        userTwo.setId("2");
        userTwo.setFirst_name("Marie");
        userTwo.setLast_name("Teneve");
        userTwo.setBirthdate("1989-08-12");
        userTwo.setLicense_number("CSG5C3DKJ");

        arr.add(userOne);
        arr.add(userTwo);

        for (DomainBean users : arr) {
            if (users.getId().equals(id)) {
                return users;
            }
        }
        return null;
    }


}
