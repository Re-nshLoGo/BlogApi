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
    it has the properties for Database connection and for uploading file like:
    
<h1 align="left"><img width=700 height=300 alt="EER" src="https://user-images.githubusercontent.com/117101699/230089571-fd3074b6-5093-470c-83f9-4ece58fd3d96.png"/></h1>
   
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
## There are Four models -
 * Users
 * Post
 * Comment
 * Category
## Mapping between Models -
<h1 align="left"><img width=700 height=300 alt="EER" src="https://user-images.githubusercontent.com/117101699/230090205-f72cfc4c-b184-4155-a50f-91ab301837a3.png"/></h1>

## Endpoints
* User Controller has -

<h1 align="left"><img width=700 height=300 alt="user" src="https://user-images.githubusercontent.com/117101699/230092083-0b3013d6-0d04-4321-9ced-2b701f64673f.png"/></h1>
  
* Post Controller has -
 
<h1 align="left"><img width=700 height=500 alt="post" src="https://user-images.githubusercontent.com/117101699/230092832-7420595b-8f09-490e-9576-9c3f9bcef936.png"/></h1>
  
* Category Controller has -
  
<h1 align="left"><img width=700 height=300 alt="cate" src="https://user-images.githubusercontent.com/117101699/230093142-3a577c6a-4278-4bb6-a7b2-603035c5bd18.png"/></h1>
 
* Comment Controller has -

<h1 align="left"><img width=700 height=300 alt="comment" src="https://user-images.githubusercontent.com/117101699/230093314-404e46b9-763f-4948-a06c-8d44082c412f.png"/></h1>

## Output like - 
  * Get All posts -
<h1 align="left"><img width=700 height=300 alt="allpost" src="https://user-images.githubusercontent.com/117101699/230096905-ef8a9847-7e39-4c52-bfce-1b406f212f68.png"/></h1>

  * Get User by userId - 
  
<h1 align="left"><img width=700 height=300 alt="allpost" src="https://user-images.githubusercontent.com/117101699/230097430-02732950-3529-4dbf-83fe-454d66fb648e.png"/></h1>
  



