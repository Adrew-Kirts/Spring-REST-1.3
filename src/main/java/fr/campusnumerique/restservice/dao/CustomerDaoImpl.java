package fr.campusnumerique.restservice.dao;


import java.util.ArrayList;
import fr.campusnumerique.restservice.model.Customer;
import org.springframework.stereotype.Repository;


    @Repository
    public class CustomerDaoImpl implements CustomerDAO {

    public static ArrayList<Customer> arr = new ArrayList<>();

    static {
        Customer userOne = new Customer();
        userOne.setId(1);
        userOne.setFirstName("Alice");
        userOne.setLastName("Dupont");
        userOne.setBirthdate("1985-03-15");
        userOne.setLicenseNumber("A1B2C3D4E");

        Customer userTwo = new Customer();
        userTwo.setId(2);
        userTwo.setFirstName("Marie");
        userTwo.setLastName("Teneve");
        userTwo.setBirthdate("1989-02-12");
        userTwo.setLicenseNumber("CSG5C3DKJ");

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
                    arr.remove(findById(id));
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
