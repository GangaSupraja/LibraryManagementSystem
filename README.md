Library Management System
=================================
A mini Java project to manage books and users in a library using Object-Oriented Programming principles. This version uses **interfaces** to promote abstraction and modularity.

Feature
----------

- Add and list books
- Register and list users
- Issue and return books
- Track book issue status

Technologies Use
-------------------
- Java (JDK 8+)
- Eclipse IDE (or any Java IDE)

Project Structure
---------------------------
LibraryManagement/
│
├── Book.java // Book class (with fields, getters/setters)
├── User.java // User class (with borrow/return methods)
├── LibraryOperations.java // Interface for library operations
├── Library.java // Implements LibraryOperations
└── Main.java // Entry point, CLI menu


Interface Explanation
----------------------------
LibraryOperations` is a Java interface that defines the methods any library system must implement


