# Blog Application
This is a simple blog application built using Spring Boot framework.The idea was to build some basic blogging platform.
It provides CRUD operations, validation and exception handling ,using Hibernate as the ORM and MySQL as the database.
Posts are divided into categories for easy navigation and filtering.
It was made using Spring Boot, Spring Data JPA, Spring Data REST and MySql Database.
User can comment on posts made by other users.
Pagination has also been added to get all posts.
### Tech Stack :-
  * Spring Boot
  * Java
  * JPA Hibernate
  * MySQL
### Configuration :-

* Configuration Files - 

    * src/resources/application.properties - main configuration file. Here it is possible to change the port number.
    it has the properties for Database connection and for uploading file.

### Features :-
      * Create, Read, Update, Delete (CRUD) operations for Posts and Users.
      * Post categorization
      * Paggination for get Posts
      * Validation 
      * Exception handling for error scenarios
 ### Getting Started :-
* To get started with the application, clone the repository to your local machine using :
      
      git clone https://github.com/<your-username>/spring-boot-blog.git
* Make sure you have Java and Maven installed on your machine.
You will also need a MySQL server running on your local machine or a remote server.

* Configure the database connection in the application.properties file:

       spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
       spring.datasource.username=<database-username>
       spring.datasource.password=<database-password>
* Build and run the application.
