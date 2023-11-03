<h1>SpringRest Courses</h1>

<b>This is a simple RESTful API built with Spring Boot for managing courses. The API allows you to perform CRUD operations on courses.</b>

**Features**
- Get all courses
- Get a specific course by ID
- Add a new course
- Update an existing course
- Delete a course

**Technologies Used**

- Spring Boot
- Spring Data JPA
- MySQL

**Setup prerequisites**

- Java 8 or higher
- MySQL

**Configuration**
The application's configuration is located in src/main/resources/application.properties. Here, you can set up your database connection and other settings.
Running the Application
# Database Configuration
          spring.datasource.url=jdbc:mysql://localhost:3306/Courses
          spring.datasource.username=root
          spring.datasource.password=root
          spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
          
          #hibernate configuration
          spring.jpa.hibernate.ddl-auto=update
          spring.jpa.show-sql=true
          spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

**API Endpoints**

- GET /courses: Fetch all courses
- GET /courses/{courseId}: Fetch a specific course by its ID
- POST /courses: Add a new course
- PUT /courses/{courseId}: Update an existing course
- DELETE /courses/{courseId}: Delete a course

**Entities**

The Course entity has the following fields:

- id: a unique identifier for the course
- title: the title of the course
- description: a description of the course
- author: the author of the course

**Services**
The CourseService interface defines the operations that can be performed on a Course. The CourseServiceimpl class provides an implementation for these operations.

**DAO**
The CourseDao interface extends JpaRepository, providing methods for performing CRUD operations on the Course entity.

**Controllers**
The MyController class is a REST controller that handles HTTP requests and responses. It uses the CourseService to perform operations.

**Note:**  This is a basic application for learning purposes. It does not handle exceptions or edge cases.
