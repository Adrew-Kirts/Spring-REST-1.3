# JAVA SPRINGBOOT

## Syntax glossary

### RESTful services

Annotation

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



