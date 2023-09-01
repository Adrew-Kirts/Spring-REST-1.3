package fr.campusnumerique.restservice;

// Importing classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Annotation
@SpringBootApplication
@EnableSwagger2
@EnableConfigurationProperties
@EnableDiscoveryClient
// Main class
public class ResponseApplication {

    // Main driver method
    public static void main(String[] args)
    {

        SpringApplication.run(
                ResponseApplication.class, args);
    }
}
