# JAVA SPRINGBOOT

## Syntax glossary

### Microservice architecture (MSA)

- Designing software as small, independent services.
- Each service handles a specific task or functionality.
- Services can be developed, deployed, and updated independently.
- Communication between services often happens through well-defined APIs.
- Provides adaptability, speed, and resource efficiency.

#### Benefits:
    - Improved scalability based on individual service needs.
    - Agility in development and quicker time-to-market.
    - Fault isolation for better system resilience.
    - Flexibility to use different technologies for each service.

#### Challenges:
    - Managing inter-service communication complexity.
    - Ensuring consistent data across services.
    - Monitoring and maintaining multiple services.

#### Applications:
    - Web applications
    - E-commerce platforms
    - Large-scale enterprise systems

#### Example of an online e-commerce platform: 

Components:

    User Service: Handles user registration, login, and profile management.
    Product Service: Manages product information, such as details, prices, and availability.
    Order Service: Deals with placing orders, order history, and order processing.
    Payment Service: Responsible for processing payments and managing payment methods.
    Review Service: Allows users to submit and view product reviews and ratings.

How They Interact:

    When a user wants to buy a product, they log in via the User Service.
    They search for a product, which requests data from the Product Service.
    When they select a product, the Order Service is informed to create an order.
    The Payment Service handles payment processing once the order is confirmed.
    Users can leave reviews, which are managed by the Review Service.

In this architecture, each service focuses on a specific task and can be developed, deployed, and maintained independently. They communicate through APIs, and if one service fails, it doesn't necessarily affect the others. This modularity allows for easier scaling, quicker updates, and flexibility in choosing technologies for each service.

### RESTful services

RESTful services, or Representational State Transfer, are a type of software architecture that uses a set of constraints to create web services. These services are designed to be simple, scalable, and easily accessible via standard HTTP methods. They enable communication between different software applications over the internet, often used for building APIs that allow systems to interact with each other.

### Used Annotations

#### Main class

    @SpringBootApplication: Marks the main class of a Spring Boot application and enables various configurations and auto-configuration.

#### Configuration

    @EnableSwagger2: Enables Swagger API documentation generation for the application.
    @Bean: Indicates that a method produces a bean to be managed by the Spring container.
    @Configuration: Indicates that a class provides Spring Bean configuration.

#### DAO

    @Repository: Marks a class as a Data Access Object (DAO), allowing Spring to handle database interactions.

#### Model

    @Data (Lombok project): Lombok annotation to generate boilerplate code for getters, setters, toString, etc. in a class.

#### Controller

    @RestController: Indicates that a class is a controller, capable of handling incoming HTTP requests and returning response objects.
    @RequestMapping: Maps (any) HTTP requests (POST, PUT, GET, DELETE, ...) to controller methods or classes.
    @GetMapping: Maps HTTP GET requests to specific controller methods.
    @PostMapping: Maps HTTP POST requests to specific controller methods.
    @DeleteMapping: Maps HTTP DELETE requests to specific controller methods.
    @PutMapping: Maps HTTP PUT requests to specific controller methods.

    @PathVariable: Used to extract data from the URL path. It allows you to define placeholders in your request mapping URL and bind those placeholders to method parameters.
    @RequestBody: Maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object

### Getters and setters with Lombok

    Java Beans requires the Getter/Setter methods.
    One can generate them automatically with the ‘@Data’ annotation of the ‘Lombok’ library.
    Dependency is as depicted below as follows:

Maven -> pom.xml

	<dependency>
	    <groupId>org.projectlombok</groupId>
	    <artifactId>lombok</artifactId>
	    <optional>true</optional>
	</dependency>

The @Data annotation is equivalent to the combination of the following annotations:

    @Getter
    @Setter
    @RequiredArgsConstructor
    @ToString
    @EqualsAndHashCode

What it does: 

    It generates the getter methods for all the fields.
    It generates the setter methods for all the non-final fields.
    It generates the toString() method implementation.
    It generates appropriate equals() and hashCode() implementations, involving the fields of class.
    It generates a constructor that initializes all the final fields, as well as all the non-final 	
    fields with no initializer that have been marked with @NonNull, in order to ensure that the field is 
    never null.

### DAO

The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business layer from the persistence layer (usually a relational database but could be any other persistence mechanism) using an abstract API.

The API hides from the application all the complexity of performing CRUD operations in the underlying storage mechanism. This permits both layers to evolve separately without knowing anything about each other.


### CRUD (Create, Read, Update, Delete)

Users must be able to create data, have access to the data in the UI by reading the data, update or edit the data, and delete the data.

In full-fledged applications, CRUD apps consist of 3 parts: an API (or server), a database, and a user interface (UI).


### Swagger (2) Documentation

Add dependency

    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>3.0.0</version>
    </dependency>

Configuration in a new class: 

    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {
    @Bean
    public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
    .select()
    .apis(RequestHandlerSelectors.basePackage("fr.campusnumerique.restservice"))
    .paths(PathSelectors.any())
    //possibility to add regex paths 
    .build();
    }
    }

Add to application.properties: 

    spring.mvc.pathmatch.matching-strategy=ant_path_matcher






