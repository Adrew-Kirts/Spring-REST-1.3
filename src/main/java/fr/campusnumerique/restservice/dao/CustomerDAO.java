package fr.campusnumerique.restservice.dao;

import fr.campusnumerique.restservice.model.Customer;

import java.util.ArrayList;


public interface CustomerDAO {

    ArrayList<Customer> findAll();

    Customer findById(int id);
    
    void save(Customer customer);
    //add: return of new customer

    void delete(int id);

    void edit(int id, Customer customerUpdate);
    
}

