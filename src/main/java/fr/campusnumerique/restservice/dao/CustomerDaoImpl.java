package fr.campusnumerique.restservice.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import fr.campusnumerique.restservice.model.Customer;
import org.springframework.stereotype.Repository;


    @Repository
    public class CustomerDaoImpl implements CustomerDAO {


    public static ArrayList<Customer> arr = new ArrayList<>();

    static {
        Customer userOne = new Customer();
        userOne.setId(1);
        userOne.setFirst_name("Alice");
        userOne.setLast_name("Dupont");
        userOne.setBirthdate("1985-03-15");
        userOne.setLicense_number("A1B2C3D4E");


        Customer userTwo = new Customer();
        userTwo.setId(2);
        userTwo.setFirst_name("Marie");
        userTwo.setLast_name("Teneve");
        userTwo.setBirthdate("1989-02-12");
        userTwo.setLicense_number("CSG5C3DKJ");

        arr.add(userOne);
        arr.add(userTwo);
    }

//    @GetMapping
    @Override
    public ArrayList<Customer> findAll() {
        return arr;
    }


    @Override
    public Customer findById(int id) {

        for (Customer users : arr) {
            if (users.getId() == id) {
                return users;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        arr.add(customer);
    }

    @Override
        public void delete(int id) {
            for (Customer user : arr) {
                if (user.getId() == id) {
                    arr.remove(id-1);
                }
            }
        }

        @Override
        public void edit(int id, Customer customerUpdate) {
            for (Customer user : arr) {
                if (user.getId() == id) {
                    arr.set(id-1, customerUpdate);
                }
            }
        }

}
