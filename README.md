# Hospital Management System

## Project Description
The **Hospital Management System** is a simple Java mini-project developed using **Object-Oriented Programming (OOP)** concepts. The system manages hospital information by storing and displaying details of doctors and patients.

This project demonstrates important Java concepts such as **encapsulation, constructors, inheritance, method overriding, polymorphism, `this`, `super`, `final`, and method hiding**.

---

## Objectives
- Manage doctor and patient information
- Demonstrate Java OOP concepts
- Practice inheritance and polymorphism
- Understand method overriding and constructors

---

## OOP Concepts Used

### 1. Encapsulation
Variables are protected/private and accessed using **getters and setters**.

### 2. Constructors
Constructors are used to initialize object data.

### 3. Inheritance (`extends`)
`Doctor` and `Patient` inherit from the `Person` class.

Example:
```java
public class Doctor extends Person
```

### 4. Single Inheritance
Each subclass inherits from one superclass.

### 5. Hierarchical Inheritance

```text
Person
 ├── Doctor
 └── Patient
```

### 6. Method Overriding
The `displayInfo()` method is overridden in child classes.

Example:
```java
@Override
public void displayInfo() {
    System.out.println("Doctor Information");
}
```

### 7. Polymorphism
Objects of subclasses are referenced using the parent class.

Example:
```java
Person p1 = new Doctor(
        "Dr. John",
        45,
        "Cardiologist",
        80000
);

Person p2 = new Patient(
        "Mike",
        25,
        "Fever",
        12
);
```

### 8. `this` Keyword
Used to refer to the current object.

Example:
```java
this.name = name;
```

### 9. `super` Keyword
Used to call parent constructors and methods.

Example:
```java
super(name, age);
```

### 10. `final` Method
Prevents overriding of important methods.

Example:
```java
public final void hospitalRules() {
    System.out.println("Respect all patients.");
}
```

### 11. Method Hiding (Static Methods)

Example:
```java
public static void hospitalType() {
    System.out.println("Specialized Hospital");
}
```

---

## Project Structure

```text
Hospital Management System
│── src
│   ├── Person.java
│   ├── Doctor.java
│   ├── Patient.java
│   └── Main.java
```

---

## Classes Used

### Person Class
Base class containing:
- Name
- Age
- Getters and Setters
- `displayInfo()`

### Doctor Class
Derived class containing:
- Specialization
- Salary

### Patient Class
Derived class containing:
- Disease
- Room Number

### Main Class
Creates objects and runs the system.

---

## Sample Output

```text
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
```

---

## Technologies Used
- Java
- IntelliJ IDEA

---

## Author
**Name:** Fasika Gashaw
