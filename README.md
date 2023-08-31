# JAVA SPRINGBOOT

## Syntax glossary

### RESTful services

Annotations

Description

@RestController	Combines @Controller and @ResponseBody

@RequestMapping	Maps web requests with ‘path’ attribute and response format with ‘produces’ attribute

@CrossOrigin	Permits cross-origin web requests on the specific handler classes/methods

@GetMapping	Maps GET request on specific handler method

@PathVariable	Binds the URI template variables to method parameters



### Getters and setters

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

### Microservice architecture (MSA)

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






