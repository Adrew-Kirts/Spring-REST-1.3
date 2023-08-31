package fr.campusnumerique.restservice.controller;

import io.swagger.models.License;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

public class Validator {

    public static void validator(String licenceNumber){
        RestTemplate restTemplate = new RestTemplate();

        if (!restTemplate.getForObject("http://localhost:8081/licenses/"+licenceNumber, Boolean.class)){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "license number not found"
            );
        }
    }



}
