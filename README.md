# Studentinfosystem
# 🧑‍🎓 Student Information System (SIS)

A Spring Boot-based **Student Information System** designed to manage and process student records including name, department, marks, and more. It supports CRUD operations, an admin/teacher dashboard, and displays information using Thymeleaf templates.

## 📌 Features

- Create, Read, Update, Delete (CRUD) student records
- Admin/Teacher Dashboard interface
- Display all student information in a tabular format
- Uses H2 in-memory database for simplicity
- Clean frontend using Thymeleaf templates

## 🛠️ Technologies Used

| Component      | Technology     |
|----------------|----------------|
| Backend        | Spring Boot (Java) |
| Frontend       | Thymeleaf Templates |
| Database       | H2 In-Memory Database |
| Build Tool     | Maven |
| IDE            | IntelliJ / Eclipse / VS Code |
| Web Framework  | Spring Web MVC |

## ⚙️ Project Structure

student-system/
├── src/
│ ├── controller/
│ │ └── StudentController.java
│ ├── model/
│ │ └── Student.java
│ ├── repository/
│ │ └── StudentRepository.java
│ ├── service/
│ │ └── StudentService.java
│ └── templates/
│ ├── index.html
│ ├── new_student.html
│ ├── update_student.html
│ └── dashboard.html
├── application.properties
└── README.md

🧑‍💻 Contributors
Harshad A Magdum (Roll No: 101)

Anirudh A Zalki (Roll No: 112)

Sanjana S (Roll No: 108)

Apeksha Raikar (Roll No: 116)

📌 Problem Statement
Design and implement a Student Information System using Java and Spring Boot which:

Allows storing and managing student data

Uses object-oriented programming concepts (encapsulation, inheritance)

Utilizes Spring MVC and JPA

Uses design patterns where applicable (Service pattern, DAO pattern)

Is capable of being extended with admin dashboards and REST APIs
