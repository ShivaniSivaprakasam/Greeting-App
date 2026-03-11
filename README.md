# Greeting App – Spring Boot (UC1–UC8)

## Project Overview
The **Greeting App** is a Spring Boot REST API application built using **Spring Boot, Spring Data JPA, and MySQL**.  
It demonstrates a layered architecture with **Controller, Service, Repository, and Entity** layers while performing full **CRUD operations** on greeting messages.

The application provides APIs to:

- Generate greeting messages
- Store greetings in a database
- Retrieve greetings
- Update greetings
- Delete greetings

---

# Tech Stack

- Java (JDK 17+)
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven
- Postman (API Testing)

---

# Project Structure

```
src/main/java/com/bridgelabz/greetingapp
│
├── controller
│     GreetingController.java
│
├── service
│     GreetingService.java
│
├── repository
│     GreetingRepository.java
│
├── model
│     Greeting.java
│
└── DemoApplication.java
```

---

# Database Configuration

Update **application.properties**

```
spring.datasource.url=jdbc:mysql://localhost:3306/greeting_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Create database in MySQL

```sql
CREATE DATABASE greeting_db;
```

---

# Implemented Use Cases

## UC1 – Basic Greeting Controller

API

```
GET /greeting
```

Response

```
Hello World
```

---

## UC2 – Move Greeting Logic to Service Layer

Greeting logic moved from **Controller to Service layer** to maintain layered architecture.

---

## UC3 – Accept First Name and Last Name

API

```
GET /greeting?firstName=Shivani&lastName=Sivaprakasam
```

Responses

```
Hello Shivani Sivaprakasam
Hello Shivani
Hello Sivaprakasam
Hello World
```

---

## UC4 – Save Greeting in Database

Created:

- Greeting Entity
- GreetingRepository

Greeting messages are stored in MySQL.

---

## UC5 – Get Greeting by ID

API

```
GET /greeting/{id}
```

Example

```
GET /greeting/1
```

Response

```json
{
  "id": 1,
  "message": "Hello Shivani"
}
```

---

## UC6 – Get All Greetings

API

```
GET /greetings
```

Response

```json
[
  {
    "id": 1,
    "message": "Hello Shivani"
  },
  {
    "id": 2,
    "message": "Hello World"
  }
]
```

---

## UC7 – Update Greeting

API

```
PUT /greeting/{id}
```

Request Body

```json
{
  "message": "Hello Updated Shivani"
}
```

---

## UC8 – Delete Greeting

API

```
DELETE /greeting/{id}
```

Response

```
Greeting deleted successfully
```

---

# API Testing

Use Postman to test APIs.

Example

```
GET http://localhost:8080/greeting
```

```
GET http://localhost:8080/greeting?firstName=Shivani
```

```
GET http://localhost:8080/greetings
```

---

# Git Flow Branch Strategy

Each use case was implemented in separate feature branches.

Example branches

```
feature/UC1-basic-controller
feature/UC2-service-layer
feature/UC3-accept-name
feature/UC4-entity-repository
feature/UC5-get-by-id
feature/UC6-list-all
feature/UC7-update-greeting
feature/UC8-delete-greeting
```

---

# Author

**Shivani Sivaprakasam**
