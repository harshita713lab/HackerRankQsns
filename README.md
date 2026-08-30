# 🚀 HackerRank Solutions & Core Java / DSA Concepts

Welcome to the **HackerRank Solutions & Core Java Repository**! This repository contains a curated collection of Java solutions for HackerRank problem-solving challenges along with fundamental Object-Oriented Programming (OOP) and Java language features.

---

## 📌 Table of Contents
1. [Repository Overview](#-repository-overview)
2. [Core Java & OOP Features Covered](#-core-java--oop-features-covered)
3. [HackerRank Coding Problems & Solutions](#-hackerrank-coding-problems--solutions)
4. [File Structure](#-file-structure)
5. [How to Compile and Run](#-how-to-compile-and-run)

---

## 💡 Repository Overview

This project serves as a comprehensive reference guide for:
* **Object-Oriented Programming (OOP)** principles in Java (Encapsulation, Inheritance, Polymorphism).
* **Core Java constructs** such as Anonymous Inner Classes, Static Initializer Blocks, Exception Handling, and Data Type Ranges.
* **HackerRank Problem Solving** solutions tackling mathematical series generation, I/O handling, type conversions, and date manipulation.

---

## 🧠 Core Java & OOP Features Covered

### 1. Encapsulation & Constructors
* **File:** [`Encapsulation.java`](./Encapsulation.java)
* **Concepts:** Data Hiding using `private` access modifiers, Getter and Setter methods, and Constructor Overloading (default vs. parameterized constructors).
* **Key Feature:** Protects internal object state (`age`, `name`, `FatherName`) while exposing controlled access through public getter and setter methods.

### 2. Single & Multi-Level Inheritance
* **Files:** [`Calc.java`](./Calc.java) -> [`Inheritance2.java`](./Inheritance2.java) -> [`MultiLevelInheritance.java`](./MultiLevelInheritance.java) -> [`Demo.java`](./Demo.java)
* **Concepts:** Code reusability via class inheritance (`extends`), hierarchy, and method extension across multi-tiered classes.
* **Hierarchy Structure:**
  * **Base Class:** `Calc` — basic addition (`add`) and subtraction (`sub`).
  * **Derived Class Level 1:** `Inheritance2` — extends `Calc` with multiplication (`mul`) and division (`divide`).
  * **Derived Class Level 2:** `MultiLevelInheritance` — extends `Inheritance2` with exponentiation (`power`).
  * **Runner Class:** `Demo` — instantiates `MultiLevelInheritance` to invoke methods from all levels of the inheritance chain.

### 3. Anonymous Inner Classes
* **File:** [`Anonymous.java`](./Anonymous.java)
* **Concepts:** Interface implementation without declaring dedicated named classes.
* **Key Feature:** Instantiates the `Greeting` interface on the fly to provide custom implementations of `sayHello()` for multiple instances (`english`, `hindi`).

### 4. Static Initializer Block
* **File:** [`Solution4.java`](./Solution4.java)
* **Concepts:** Static blocks execute before the `main` method when the class is loaded.
* **Key Feature:** Used for initializing static variables (`B`, `H`) and executing pre-validation rules to verify breadth and height are strictly positive values.

---

## 🏆 HackerRank Coding Problems & Solutions

| Problem File | Problem Name / Topic | Description & Logic | Key Features / Techniques |
| :--- | :--- | :--- | :--- |
| [`Solution.java`](./Solution.java) | **Java Loops II** | Generates a mathematical series based on formula: $(a + 2^0 \cdot b), (a + 2^0 \cdot b + 2^1 \cdot b), \dots, (a + \sum_{j=0}^{n-1} 2^j \cdot b)$. | Nested loops, `Math.pow()`, formatted print output. |
| [`Solution2.java`](./Solution2.java) | **Java Datatypes** | Determines which primitive data types (`byte`, `short`, `int`, `long`) can fit a given numerical input. | Range validation using `Byte.MIN_VALUE`, `Long.MAX_VALUE`, and `try-catch` handling for data overflow. |
| [`Solution3.java`](./Solution3.java) | **Java End-of-File (EOF)** | Reads unknown number of lines from standard input until EOF is reached and prints line-numbered output. | `Scanner.hasNext()`, `Scanner.nextLine()`, dynamic line numbering. |
| [`Solution4.java`](./Solution4.java) | **Java Static Initializer Block** | Calculates the area of a parallelogram after validating positive dimensions inside a static initialization block. | Static block initialization, exception handling, pre-main validation. |
| [`Solution5.java`](./Solution5.java) | **Java Int to String** | Converts an integer `n` into its String representation and checks validity. | Type casting via `String.valueOf(n)`, exception safety. |
| [`Solution6.java`](./Solution6.java) | **Java Date and Time** | Determines the day of the week (e.g., MONDAY, WEDNESDAY) for a given date `(YYYY, MM, DD)`. | `java.util.Calendar`, `Calendar.getInstance()`, `cal.getDisplayName()`, `Locale.US`. |

---

## 📁 File Structure

```text
HackerRankQsns/
│
├── Anonymous.java              # Anonymous inner class example
├── Calc.java                   # Base calculator class for inheritance
├── Demo.java                   # Main driver class for testing multi-level inheritance
├── Encapsulation.java          # Encapsulation, getters/setters, constructors
├── Inheritance2.java           # Level 1 subclass extending Calc
├── MultiLevelInheritance.java  # Level 2 subclass extending Inheritance2
├── Solution.java               # HackerRank: Java Loops II (Series Generation)
├── Solution2.java              # HackerRank: Java Datatypes (Range Check)
├── Solution3.java              # HackerRank: Java End-of-file (EOF Scanner)
├── Solution4.java              # HackerRank: Java Static Initializer Block
├── Solution5.java              # HackerRank: Java Int to String
├── Solution6.java              # HackerRank: Java Date and Time
└── README.md                   # Repository documentation
```

---

## ⚙️ How to Compile and Run

Make sure you have **JDK 8 or higher** installed on your system.

### 1. Compiling a File
Open your terminal or command prompt inside the project folder and run:
```bash
javac Solution.java
```

### 2. Running a Compiled Class
Execute the class file using the `java` command:
```bash
java Solution
```

### 3. Running OOP Demos (e.g. Inheritance Demo)
Compile all related inheritance files together:
```bash
javac Calc.java Inheritance2.java MultiLevelInheritance.java Demo.java
java Demo
```

---

## 🌟 Summary of Learned Concepts
- **Data Hiding & Protection:** Using `private` fields and public accessors.
- **Code Reuse:** Building scalable class hierarchies with inheritance.
- **Dynamic Input Processing:** Handling EOF, series expansion, and date conversions using standard Java libraries.
- **Robustness:** Utilizing `try-catch` blocks and static pre-validations to prevent runtime crashes.
