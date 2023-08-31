package fr.campusnumerique.restservice.controller;

import fr.campusnumerique.restservice.dao.CustomerDAO;
import fr.campusnumerique.restservice.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/JSON")
public class CustomerController {

private final CustomerDAO customerDAO;


    public CustomerController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @GetMapping
    public ArrayList<Customer> getAllUsers() {
        return customerDAO.findAll();
    }

    @GetMapping("{id}")
    public Customer findById(@PathVariable("id") int id) {
        return customerDAO.findById(id);
    }

    @PostMapping(value = "/add")
    public void save(@RequestBody Customer customer) {
        Validator.validator(customer.getLicense_number());
        customerDAO.save(customer);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") int id) {
    customerDAO.delete(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable("id") int id, @RequestBody Customer customerUpdate){
        customerDAO.edit(id, customerUpdate);
    }
}
