package fr.campusnumerique.restservice.model;

// Importing class
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


// Annotation
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String firstName;
    String lastName;
    Date birthdate;
    String licenseId;

}