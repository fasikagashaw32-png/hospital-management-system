# Hospital Management System

## Project Description
The Hospital Management System is a simple Java mini-project developed using Object-Oriented Programming (OOP) concepts. The system manages hospital information by storing and displaying details of doctors and patients.

This project demonstrates important Java inheritance and OOP principles such as encapsulation, constructors, inheritance, method overriding, polymorphism, `this`, `super`, `final`, and method hiding.

---

## Objectives
- Manage doctor and patient information
- Demonstrate Java OOP concepts
- Practice inheritance and polymorphism
- Understand method overriding and constructors

---

## OOP Concepts Used

### 1. Encapsulation
Private/protected variables are used with getters and setters.

### 2. Constructors
Constructors initialize object data when objects are created.

### 3. Inheritance (`extends`)
`Doctor` and `Patient` inherit from the `Person` class.

### 4. Single Inheritance
Each subclass inherits from one superclass.

Example:
```java
class Doctor extends Person
5. Hierarchical Inheritance

Multiple subclasses inherit from one parent class.

Person
 ├── Doctor
 └── Patient
6. Method Overriding

The displayInfo() method is overridden in child classes.

7. Polymorphism

Objects of subclasses are referenced using the parent class.

Example:

Person p1 = new Doctor(...);
Person p2 = new Patient(...);
8. this Keyword

Used to refer to current object variables.

Example:

this.name = name;
9. super Keyword

Used to call parent constructor and methods.

Example:

super(name, age);
10. final Method

Prevents overriding of methods.

11. Method Hiding

Static methods are hidden in subclasses.

Project Structure
Hospital Management System
│── src
│   ├── Person.java
│   ├── Doctor.java
│   ├── Patient.java
│   └── Main.java
Classes Used
Person Class

Base class that contains:

Name
Age
Getters and Setters
displayInfo()
Doctor Class

Derived class containing:

Specialization
Salary
Patient Class

Derived class containing:

Disease
Room Number
Main Class

Creates objects and runs the system.

Sample Output
Doctor Information:
Name: Dr. John
Age: 45
Specialization: Cardiologist
Salary: $80000.0

Patient Information:
Name: Mike
Age: 25
Disease: Fever
Room Number: 12

Hospital Rule: Respect all patients.

General Hospital
Specialized Hospital
Patient Care Hospital
Technologies Used
Java
---
## Author

Your Name: Fasika Gashaw
