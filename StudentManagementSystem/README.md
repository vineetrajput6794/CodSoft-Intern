# Task 3: Student Management System

A robust Java console application for managing student records, utilizing Object-Oriented Programming (OOP) design and MySQL database connectivity via JDBC.

## Features
- **Add Student**: Create new student profiles with details like name, roll number, grade, etc.
- **Delete Student**: Remove a student record using their unique Roll Number.
- **Search Student**: Retrieve and display specific student records.
- **Display All Students**: List all registered students.
- **MySQL Integration**: Connected to a database using JDBC (`DBConnection.java`) for persistent data storage.
- **Student Data Access Object (DAO)**: Structured using the DAO design pattern (`StudentDAO.java`) to cleanly separate business logic from database operations.

## Database Setup
1. Create a MySQL database named `student_db` (or as configured in `DBConnection.java`).
2. Create a table named `students` with appropriate columns (e.g., `roll_no`, `name`, `grade`, etc.).
3. Update connection URL, username, and password in `DBConnection.java`.

## How to Run
Run the `Main.java` file in your IDE after setting up your MySQL database and adding the JDBC driver dependency.
