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
## There are Four models -
 * Users
 * Post
 * Comment
 * Category
## Endpoints
* User Controller has -
    * POST - `http://localhost:9000/api/users/add-user`
    * GET - `http://localhost:9000/api/users/`
    * PUT - `http://localhost:9000/api/users/update/{userId}`
    * DELETE - ` http://localhost:9000/api/users/delete/{userId}`
* Post Controller has -
    * POST - `http://localhost:9000/post/save?userid="userId"&categoryid="categoryId"`
    * POST - `http://localhost:9000/post/upload-image/{postId}`
    * Delete - `http://localhost:9000/post/delete/{postId}`
    * GET - `http://localhost:9000/post/post-by-category/{categoryId}`
    * GET - `http://localhost:9000/post/post-by-user/{userId}`
    * GET - `http://localhost:9000/post/get-all?pageno="pageNo"&pagesize="pageSize"&sortby="sortBy"`
    * GET - `http://localhost:9000/post/search/by-title/{keyword}`
* Category Controller has -
    * POST - `http://localhost:9000/category/save`
    * GET - `http://localhost:9000/category/?id="categoryId"`
    * PUT - `http://localhost:9000/category/update/{categoryId}`
    * DELETE -`http://localhost:9000/category/delete/{categoryId}`
* Comment Controller has -
    * POST - `http://localhost:9000/api/comment/add?userId="userID"&postId="postId"`
    * DELETE - `http://localhost:9000/api/comment/delete?commentId="commentId"&userId="userId"&postId="postId"`


