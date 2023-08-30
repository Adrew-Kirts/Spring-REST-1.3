package fr.campusnumerique.restservice.dao;

import fr.campusnumerique.restservice.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//@RestController
//@RequestMapping("/JSON")
public interface CustomerDAO {

    ArrayList<Customer> findAll();

    Customer findById(int id);
    
    void save(Customer customer);
    //add: return of new customer

    void delete(int id);

    void edit(int id, Customer customerUpdate);
    
}

    //@Repository
//    public static ArrayList<Customer> arr = new ArrayList<>();
//
//    static {
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
//    }
//
//    @GetMapping
//    public default ArrayList<Customer> getAllUsers() {
//        return arr;
//    }
//
//    @GetMapping("{id}")
//    public Customer getUserById(@PathVariable("id") String id) {
//
//
//        for (Customer users : arr) {
//            if (users.getId().equals(id)) {
//                return users;
//            }
//        }
//        return null;
//    }
//
//    @PostMapping(value = "/add")
//    public void addCustomer(@RequestBody Customer customer) {
//        arr.add(customer);
//    }
//
//    @DeleteMapping("{id}")
//    public void deleteUserById(@PathVariable("id") String id) {
//        for (Customer users : arr) {
//            if (users.getId().equals(id)) {
//                arr.remove(users);
//            }
//        }
//    }
//}
