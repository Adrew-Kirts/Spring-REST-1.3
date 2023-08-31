package fr.campusnumerique.restservice.controller;

import fr.campusnumerique.restservice.dao.CustomerDAO;
import fr.campusnumerique.restservice.dao.UserRepository;
import fr.campusnumerique.restservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/JSON")
public class CustomerController {

//private final CustomerDAO customerDAO;

    @Autowired
    private UserRepository userRepository;


    @GetMapping(path="/all")
    public Iterable<Customer> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Customer> findById(@PathVariable("id") int id) {
        return userRepository.findById(id);
    }

    @PostMapping(value = "/add")
    public void save(@RequestBody Customer customer) {
        Validator.validator(customer.getLicenseNumber());
        userRepository.save(customer);
    }


    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") int id) {
    userRepository.deleteById(id);
    }

    @PutMapping
    public void edit (@RequestBody Customer customerUpdate){
        userRepository.save(customerUpdate);
    }
}
