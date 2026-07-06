# 📊 Task 2: Student Grade Calculator

A Java console application that evaluates a student's academic performance by calculating total marks, percentage, and assigning a letter grade — built using **Object-Oriented Programming** principles.

---

## 📖 About the Project

This project simulates a student result generation system. The user enters their name, roll number, and marks for 5 subjects. The application then calculates the total, percentage, and assigns the appropriate grade. Inspired by real-world academic result systems, it demonstrates the use of abstract classes and inheritance in Java.

---

## ✨ Key Features

- **Student Info Input** – Accepts student name and roll number.
- **Multi-Subject Marks Entry** – Collects marks for 5 subjects (out of 100 each).
- **Total & Percentage Calculation** – Computes total marks (out of 500) and average percentage.
- **Grade Assignment** – Automatically assigns a letter grade based on percentage:
  | Percentage  | Grade |
  |------------|-------|
  | 90% and above | A+  |
  | 80% – 89%  | A    |
  | 70% – 79%  | B    |
  | 60% – 69%  | C    |
  | 50% – 59%  | D    |
  | Below 50%  | F    |
- **Pass/Fail Result Display** – Shows final pass or fail status.
- **Formatted Output** – Presents results in a clean, readable format.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| **Java** | Core programming language |
| **OOP (Abstract Classes & Inheritance)** | `Person` abstract class extended by `Student` class |
| **Java Scanner** | Console-based user input |
| **java.util** | Utility classes |

---

## 🏗️ Project Structure

```
StudentGradeCalc/
└── src/
    └── StudGradeCalc.java   # Contains Person (abstract), Student, and Main class
```

---

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA** or any Java IDE.
2. Run the `StudGradeCalc` class.
3. Enter the student's name, roll number, and marks for 5 subjects when prompted.
4. View the calculated result with grade and pass/fail status.

---

## 📋 Sample Output

```
Enter Student Name: Vineet
Enter Roll No.: 101
Enter Marks of 5 Subjects:
Subject 1: 85
Subject 2: 90
Subject 3: 78
Subject 4: 92
Subject 5: 88

====== Student Result ======
Name: Vineet
Roll No.: 101
Total: 433/500
Percentage : 86.60%
Grade: A
Result: Pass
```
