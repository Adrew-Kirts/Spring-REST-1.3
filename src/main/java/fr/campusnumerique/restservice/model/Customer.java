package fr.campusnumerique.restservice.model;

// Importing class
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

// Annotation
@Data
public class Customer {

    int id;
    String first_name;
    String last_name;
    String birthdate;
    String license_number;

}