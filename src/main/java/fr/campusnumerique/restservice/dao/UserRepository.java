package fr.campusnumerique.restservice.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import fr.campusnumerique.restservice.model.Customer;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Customer, Integer> {

}