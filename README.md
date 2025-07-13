 Book Library REST API

Hi! This is a simple backend project I built using **Java**, **Spring Boot**, and **MySQL**. It’s a RESTful API that manages books in a library — you can add, view, update, and delete books easily.

This project helped me learn how to build real-world APIs, connect with databases, and handle HTTP requests like GET, POST, PUT, and DELETE.


 What This Project Can Do

- Add a new book to the library  
- Get all books or search by ID  
- Update if a book is available or not  
- Delete a book from the system



 Tools & Technologies Used

- Java 22
- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven
- IntelliJ IDEA
- Postman (for testing the API)



 Project Structure

library-api/
├── controller/ // Handles all API requests
├── model/ // Book class (fields like title, author, etc.)
├── repository/ // JPA repository interface for DB access
├── service/ // Business logic for managing books
├── resources/
│ └── application.properties // DB connection config
└── LibraryApiApplication.java // Main Spring Boot app runner

 API Endpoints Summary

| Method | URL | What it does |
| GET    | `/books` | Shows all books |
| GET    | `/books/{id}` | Gets one book by its ID |
| POST   | `/books` | Adds a new book |
| PUT    | `/books/{id}/availability?available=true/false` | Updates a book’s availability |
| DELETE | `/books/{id}` | Deletes a book by ID |


 How to Run This Project

1. Make sure you have Java, MySQL, and Maven installed.
2. Create a database in MySQL named: `library-db`
3. Open the project in IntelliJ (or any IDE you like).
4. Update your database credentials inside `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/library-db
   spring.datasource.username=root
   spring.datasource.password=your_password
Run the app. Spring Boot will start on http://localhost:8080/library

Use Postman or any API tool to test the endpoints.

📸 Example API Call
PUT Request: Update Book Availability
http://localhost:8080/library/books/1/availability?available=false

This updates the availability of the book with ID = 1 to false (unavailable).
- What I Learned
This project taught me:

How REST APIs work in real life

Using Spring Boot with MySQL

Writing clean service-layer logic

Testing APIs using Postman

Working with real databases
- About Me
I'm Arshad Ashrafi, a Computer Science student who loves building backend systems and learning by doing real projects.

- Connect with me on LinkedIn - www.linkedin.com/in/
arshadashrafi9792

📌 Location: India

🙌 Thank You!
Thanks for checking out my project. If you liked it, feel free to leave a ⭐ on the repo or reach out. I’m always open to internship or job opportunities in software development!
