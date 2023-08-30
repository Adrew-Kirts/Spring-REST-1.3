package fr.campusnumerique.restservice;

// Importing classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Annotation
@SpringBootApplication
@EnableSwagger2
// Main class
public class ResponseApplication {

    // Main driver method
    public static void main(String[] args)
    {

        SpringApplication.run(
                ResponseApplication.class, args);
    }
}
