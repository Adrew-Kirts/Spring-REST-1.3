package com.helloworld.restservice.demo.dao;

import ch.qos.logback.core.net.server.Client;
import com.helloworld.restservice.demo.Customer;

import java.util.List;


public interface ClientDao {
    List<Client> findAll();
    Client findById(int id);
    Customer save(Customer product);

    Client save(Client client);
}
