package fr.campusnumerique.restservice.controller;

import fr.campusnumerique.restservice.dao.UserRepository;
import fr.campusnumerique.restservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/JSON")
public class CustomerController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping(path="/all")
    public Iterable<Customer> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Customer> findById(@PathVariable("id") int id) {
        return userRepository.findById(id);
    }

    @PostMapping(value = "/add")
    public Optional<Customer> save(@RequestBody Customer customer) {
        Validator.validator(customer.getLicenseNumber());
        userRepository.save(customer);
//        return "New customer created successfully: \n" + Optional.of(customer);
        return Optional.of(customer);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") int id) {
    userRepository.deleteById(id);
    }

    @PutMapping
    public Customer edit (@RequestBody Customer customerUpdate){
        userRepository.save(customerUpdate);
        return customerUpdate;
    }
}
