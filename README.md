# <h1 align="center"> User Managment System With Validation </h1>
<p align="center">
<a href="Java url">
<img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
<img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
<img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />

</p>

 

---

 

<p align="left">

 

## Overview

 

The URL Hit Counter is a simple Spring Boot application that allows you to track the number of times a specific URL endpoint has been accessed. It also provides an additional feature to track hit counts for different usernames.

 

## Technologies Used

 

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **Data Base:** MySQL workbench

 

## Data Flow

 

The URL Hit Counter application follows a structured data flow pattern to handle requests and manage data efficiently:

 

### Controller

 

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for various operations, including adding visitors, retrieving hit counts, and updating counts for specific users. Each endpoint maps to a specific service method to ensure proper request handling and response generation.

 

```java
@RestController
public class UserController {

    @Autowired
    UserService myUser;

    //adding users
    @PostMapping("users")
    public String addUsers(@RequestBody List<User> newUser){
        return myUser.addNewUser(newUser);
    }

 

    // Endpoint mappings for various operations
    // ...
}
```

 

### Service

 

The Service layer encapsulates the core business logic and data processing. It interacts with the Repository layer to retrieve and store data. In this application, it handles operations like adding, getting, updating, deleting user. The Service layer validates input data and performs necessary operations before returning results to the Controller.

 

```java
@Service
public class UserService {
    @Autowired
    IUserRepo user;

 

    // Service methods for various operations
    // ...
}
```

 

### Repository

 

The Repository layer manages data access to in-memory storage. It maintains all the data member of user. we have use MySQL as a database for data persistence. We also use the validation dependency to provide some sort of validation like @Email, @Size, @Pattern.

 

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer userId;

    private String userName;

 

    // Repository methods for managing visitor data
    // ...
}
```

 

## Database Design

 

The User Managment project is a simple app to store the data in a database(MySQL) so it's a permament data so we don't need to worry about dataloss anymore.

 

### In-Memory Data Structure

 

The primary data structure used in this application is a `List` of `User` objects. This structure allows for easy manipulation of the data in our database.

 

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer userId;

    private String userName;
.
.
.
}
```

 

## Data Structures Used

 

### List



 

 

## Endpoints

 

### Post all the users
- **Endpoint**: `/users`
- **HTTP Method**: POST
- **Description**: It will add the list of the users in the database.

 

### Get user by ids
- **Endpoint**: `/user/id/{ids}`
- **HTTP Method**: GET
- **Description**: Retrieves all the user following their ids.

 

### Get all the users
- **Endpoint**: `/users`
- **HTTP Method**: GET
- **Description**: Get all the user from database at a time.

 

### Put user by id
- **Endpoint**: `/user/id/{id}`
- **HTTP Method**: PUT
- **Description**: Update the user following their id.

 

### Delete user by id
- **Endpoint**: `/user/id/{id}`
- **HTTP Method**: DELETE
- **Description**: Delete the user following their id.

 

### Delete user by ids
- **Endpoint**: `/users/ids/{ids}`
- **HTTP Method**: DELETE
- **Description**:  Delete all the provided user following their id`.

### Delete user by ids
- **Endpoint**: `/users`
- **HTTP Method**: DELETE
- **Description**:  Delete all the user at a time`.

 

## Usage

 

1. Use a tool like [Swagger UI](https://swagger.io/) to make HTTP requests to the provided endpoints.

 

2.  Use a tool like [MySQL Workbench](https://www.mysql.com/products/workbench/) to store all the data parmanently.

 

## Project Structure

 

The project follows a standard Spring Boot application structure with components organized into layers:

 

- **Controller:** Handles incoming HTTP requests and defines API endpoints.
- **Service:** Implements business logic and interacts with the repository.
- **Model:** Defines data models.
- **repo:** Contains interface to interact with JAP

 

## Data Storage

 

MySQL Workbench is used for storage.

 

## Contributing

 

Contributions to this project are welcome! If you have any suggestions, find issues, or want to enhance the functionality, please feel free to open an issue or submit a pull request.

 

 

<!-- Acknowledgments -->
## Acknowledgments
Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

 

<!-- Contact -->
## Contact
For questions or feedback, please contact [Rebel Sk](mailto:iamrebelsk@gmail.com).
