# 🎓 Task 3: Student Management System

A full-featured Java console application to perform **CRUD operations** on student records using **MySQL database** connectivity via **JDBC** — structured using the **DAO (Data Access Object)** design pattern.

---

## 📖 About the Project

This Student Management System allows administrators to efficiently manage student records through a clean menu-driven interface. Student data (ID, Name, Age, Course, Email) is persisted in a **MySQL database** (`studentdb`), ensuring data is retained between sessions. The project follows industry-standard patterns like DAO for clean separation of business logic and database code.

---

## ✨ Key Features

- **Add Student** – Register a new student with ID, Name, Age, Course, and Email.
- **View All Students** – Display a complete list of all registered students from the database.
- **Search Student** – Find and view a specific student's record by Student ID.
- **Update Student** – Modify an existing student's details (Name, Age, Course, Email).
- **Delete Student** – Permanently remove a student record by Student ID.
- **Menu-Driven Interface** – Interactive loop-based menu for easy navigation.
- **MySQL Persistence** – All data stored and managed in a MySQL database.
- **Graceful Error Handling** – Catches and reports SQL and JDBC driver errors.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| **Java** | Core programming language |
| **JDBC (Java Database Connectivity)** | Connects Java application to MySQL database |
| **MySQL** | Relational database for persistent data storage |
| **MySQL Connector/J** | JDBC driver (`com.mysql.cj.jdbc.Driver`) |
| **OOP (DAO Pattern)** | `StudentDAO` for database operations, `Student` as model |
| **Java Scanner** | Console-based user input |

---

## 🏗️ Project Structure

```
StudentManagementSystem/
└── src/
    ├── Main.java          # Entry point with menu-driven interface
    ├── Student.java       # Student model class (ID, Name, Age, Course, Email)
    ├── StudentDAO.java    # Data Access Object – all CRUD database operations
    └── DBConnection.java  # MySQL JDBC connection manager
```

---

## 🗄️ Database Setup

1. Install **MySQL Server 8.0+**.
2. Create the database and table:

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100),
    email VARCHAR(100)
);
```

3. Update credentials in `DBConnection.java`:

```java
private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
private static final String USERNAME = "root";
private static final String PASSWORD = "your_password";
```

4. Add the **MySQL Connector/J** `.jar` to your project's classpath.

---

## ▶️ How to Run

1. Set up the MySQL database as described above.
2. Open the project in **IntelliJ IDEA** or any Java IDE.
3. Add the MySQL JDBC driver to the project classpath.
4. Run the `Main` class.
5. Use the menu options (1–6) to manage student records.

---

## 📋 Sample Output

```
====================================
   STUDENT MANAGEMENT SYSTEM
====================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
====================================
Enter your choice: 1
Enter Student ID: 1
Enter Name: Vineet Rajput
Enter Age: 21
Enter Course: B.Tech CSE
Enter Email: vineet@example.com
✅ Database Connected Successfully!
✅ Student Added Successfully!
```
