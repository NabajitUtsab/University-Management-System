# 🎓 University Management System (Java)

A simple **object-oriented Java console application** that demonstrates how a university can manage **students and faculty members** using core OOP concepts such as **inheritance, abstraction, interfaces, polymorphism, and collections**.

---

## 🧠 Project Overview

This project models a basic university system where:
- Students and faculty are treated as people
- Each person has a unique ID
- Students and faculty share common attributes
- Faculty members can be assigned courses
- Polymorphism is used to handle different person types dynamically

---

## 🏗️ OOP Concepts Used

- **Inheritance** → `Student` and `Faculty` extend `Person`
- **Abstraction** → `Person` is an abstract class
- **Interface** → `Identifiable` ensures unique ID generation
- **Polymorphism** → `Person` reference holding `Student` and `Faculty`
- **Encapsulation** → Private fields with getters/setters
- **Collections** → `ArrayList<Person>`

---

## 📦 Class Structure

### 🔹 `Identifiable` (Interface)
- Declares `getId()` method
- Ensures all entities have a unique identifier

---

### 🔹 `Person` (Abstract Class)
- Implements `Identifiable`
- Common properties:
  - `id`
  - `name`
  - `email`
- Automatically generates a unique ID using `UUID`

---

### 🔹 `Student` (Subclass of Person)
- Additional properties:
  - `major`
  - `creditsCompleted`
- Overrides `toString()` to display full student details

---

### 🔹 `Faculty` (Subclass of Person)
- Additional properties:
  - `department`
  - `salary`
- Can be assigned courses using `assignCourse()`

---

### 🔹 `Course`
- Represents a university course
- Properties:
  - `courseCode`
  - `courseTitle`
  - `maxStudents`

---

### 🔹 `UniversityManagement` (Main Class)
- Entry point of the application
- Creates students and faculty
- Stores them in an `ArrayList<Person>`
- Uses `instanceof` to perform role-specific actions

---

## ▶️ How the Program Works

1. Create student and faculty objects
2. Store them in a single list of type `Person`
3. Loop through the list:
   - Print ID and name for everyone
   - Show full details for students
   - Assign courses to faculty members

---

## 💻 Sample Output

ID : a1b Name : Abul Kalam

Student details :
Id = a1b
Name = Abul Kalam
Email = abulkalam@gmail.com

Major = Computer Science
Credits Completed = 60

ID : c3d Name : Abdul Jabbar

Student details :
Id = c3d
Name = Abdul Jabbar
Email = CoolDudeAbdul@gmail.com

Major = History
Credits Completed = 30

ID : e7f Name : Sohel Khan
Sohel Khan is assigned to Object-Oriented Design


---

## 🏃 How to Run

1. Clone the repository:
 git clone https://github.com/NabajitUtsab/University-Management-System.git

2. Navigate to the project folder:
cd university-management-system

3. Compile all Java files:
javac *.java

4.Run the program:
java UniversityManagement


📁 Project Structure
📦 UniversityManagementSystem
 ┣ 📜 Identifiable.java
 ┣ 📜 Person.java
 ┣ 📜 Student.java
 ┣ 📜 Faculty.java
 ┣ 📜 Course.java
 ┗ 📜 UniversityManagement.java

   
  


