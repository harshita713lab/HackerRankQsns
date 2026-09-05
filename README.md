# 🚀 HackerRank Solutions & Core Java Concepts

Welcome to the **HackerRank Solutions & Core Java Repository**! This repository contains a curated collection of Java solutions for HackerRank problem-solving challenges along with fundamental Object-Oriented Programming (OOP) and Core Java concepts. All files and directories have been structured and named descriptively according to their respective topics.

---

## 📌 Table of Contents
1. [Repository Overview](#-repository-overview)
2. [Core Java & OOP Features Covered](#-core-java--oop-features-covered)
3. [HackerRank Coding Problems & Solutions](#-hackerrank-coding-problems--solutions)
4. [File Structure](#-file-structure)
5. [How to Compile and Run](#-how-to-compile-and-run)
6. [Summary of Learned Concepts](#-summary-of-learned-concepts)

---

## 💡 Repository Overview

This project serves as a comprehensive reference guide for:
* **Object-Oriented Programming (OOP)** principles in Java (Encapsulation, Inheritance, Polymorphism, Access Modifiers).
* **Core Java constructs** such as Anonymous Inner Classes, Static Initializer Blocks, Exception Handling, `super` & `this` keywords, and Data Type Ranges.
* **HackerRank Problem Solving** solutions tackling mathematical series generation, I/O handling, type conversions, and date manipulation.

---

## 🧠 Core Java & OOP Features Covered

### 1. Access Modifiers (`AccessModifiers/`)
* **Files:** 
  * [`ProtectedAccessModifier.java`](./AccessModifiers/ProtectedAccessModifier.java)
  * [`AccessModifierDemo.java`](./AccessModifiers/AccessModifierDemo.java)
* **Concepts:** Package-level and protected access modifiers (`protected`), restricting visibility while allowing access within the package or subclasses.

### 2. Anonymous Inner Classes (`AnonymousInnerClass/`)
* **File:** [`AnonymousInnerClassDemo.java`](./AnonymousInnerClass/AnonymousInnerClassDemo.java)
* **Concepts:** Interface implementation without declaring dedicated named classes.
* **Key Feature:** Instantiates the `Greeting` interface on the fly to provide custom implementations of `sayHello()` for multiple instances (`english`, `hindi`).

### 3. Encapsulation & Constructors (`Encapsulation/`)
* **File:** [`EncapsulationDemo.java`](./Encapsulation/EncapsulationDemo.java)
* **Concepts:** Data Hiding using `private` access modifiers, Getter and Setter methods, and Constructor Overloading (default vs. parameterized constructors).
* **Key Feature:** Protects internal object state (`age`, `name`, `FatherName`) while exposing controlled access through public getter and setter methods.

### 4. Inheritance Chain (`Inheritance/`)
* **Files:** [`BasicCalculator.java`](./Inheritance/BasicCalculator.java) ➔ [`AdvancedCalculator.java`](./Inheritance/AdvancedCalculator.java) ➔ [`ScientificCalculator.java`](./Inheritance/ScientificCalculator.java) ➔ [`InheritanceDemo.java`](./Inheritance/InheritanceDemo.java)
* **Concepts:** Single & Multi-Level Inheritance (`extends`), method inheritance across class hierarchies.
* **Hierarchy Structure:**
  * **Base Class:** `BasicCalculator` — basic addition (`add`) and subtraction (`sub`).
  * **Derived Class Level 1:** `AdvancedCalculator` — extends `BasicCalculator` with multiplication (`mul`) and division (`divide`).
  * **Derived Class Level 2:** `ScientificCalculator` — extends `AdvancedCalculator` with exponentiation (`power`).
  * **Runner Class:** `InheritanceDemo` — instantiates `ScientificCalculator` to invoke methods across the entire chain.

### 5. Method Overriding (`MethodOverriding/`)
* **File:** [`MethodOverridingDemo.java`](./MethodOverriding/MethodOverridingDemo.java)
* **Concepts:** Polymorphism via runtime method overriding.
* **Key Feature:** Subclass `B` overrides method `add(n1, n2)` inherited from superclass `A` to alter default addition logic.

### 6. Super and This Keywords (`SuperAndThisKeywords/`)
* **File:** [`SuperAndThisDemo.java`](./SuperAndThisKeywords/SuperAndThisDemo.java)
* **Concepts:** Constructor chaining using `super()` (invoking parent constructor) and `this()` (invoking current class overloaded constructor).

---

## 🏆 HackerRank Coding Problems & Solutions (`HackerRankSolutions/`)

| Problem File | Problem Name / Topic | Description & Logic | Key Features / Techniques |
| :--- | :--- | :--- | :--- |
| [`JavaLoopsII.java`](./HackerRankSolutions/JavaLoopsII.java) | **Java Loops II** | Generates a mathematical series based on formula: $(a + 2^0 \cdot b), (a + 2^0 \cdot b + 2^1 \cdot b), \dots, (a + \sum_{j=0}^{n-1} 2^j \cdot b)$. | Nested loops, `Math.pow()`, formatted print output. |
| [`JavaDatatypes.java`](./HackerRankSolutions/JavaDatatypes.java) | **Java Datatypes** | Determines which primitive data types (`byte`, `short`, `int`, `long`) can fit a given numerical input. | Range validation using `Byte.MIN_VALUE`, `Long.MAX_VALUE`, and `try-catch` handling for data overflow. |
| [`JavaEndOfFile.java`](./HackerRankSolutions/JavaEndOfFile.java) | **Java End-of-File (EOF)** | Reads unknown number of lines from standard input until EOF is reached and prints line-numbered output. | `Scanner.hasNext()`, `Scanner.nextLine()`, dynamic line numbering. |
| [`JavaStaticInitializerBlock.java`](./HackerRankSolutions/JavaStaticInitializerBlock.java) | **Java Static Initializer Block** | Calculates the area of a parallelogram after validating positive dimensions inside a static initialization block. | Static block initialization, exception handling, pre-main validation. |
| [`JavaIntToString.java`](./HackerRankSolutions/JavaIntToString.java) | **Java Int to String** | Converts an integer `n` into its String representation and checks validity. | Type casting via `String.valueOf(n)`, exception safety. |
| [`JavaDateAndTime.java`](./HackerRankSolutions/JavaDateAndTime.java) | **Java Date and Time** | Determines the day of the week (e.g., MONDAY, WEDNESDAY) for a given date `(YYYY, MM, DD)`. | `java.util.Calendar`, `Calendar.getInstance()`, `cal.getDisplayName()`, `Locale.US`. |

---

## 📁 File Structure

```text
HackerRankQsns/
│
├── AccessModifiers/
│   ├── AccessModifierDemo.java          # Main driver accessing protected members
│   └── ProtectedAccessModifier.java     # Class declaring protected fields
│
├── AnonymousInnerClass/
│   └── AnonymousInnerClassDemo.java     # Interface implementation using anonymous inner class
│
├── Encapsulation/
│   └── EncapsulationDemo.java           # Private fields, getters/setters, constructor overloading
│
├── HackerRankSolutions/
│   ├── JavaDateAndTime.java             # Day of week calculation via Calendar
│   ├── JavaDatatypes.java               # Primitive data type range checking
│   ├── JavaEndOfFile.java               # EOF Scanner with line numbering
│   ├── JavaIntToString.java             # Int to String conversion validation
│   ├── JavaLoopsII.java                 # Mathematical series generation loop
│   └── JavaStaticInitializerBlock.java  # Pre-main static block validation
│
├── Inheritance/
│   ├── AdvancedCalculator.java          # Level 1 subclass (mul, divide)
│   ├── BasicCalculator.java             # Base class (add, sub)
│   ├── InheritanceDemo.java             # Main driver class testing multi-level chain
│   └── ScientificCalculator.java        # Level 2 subclass (power)
│
├── MethodOverriding/
│   └── MethodOverridingDemo.java        # Subclass method overriding base implementation
│
├── SuperAndThisKeywords/
│   └── SuperAndThisDemo.java            # Super() and this() constructor chaining
│
└── README.md                            # Comprehensive repository documentation
```

---

## ⚙️ How to Compile and Run

Make sure you have **JDK 8 or higher** installed on your system. Run all commands from the root directory `HackerRankQsns`.

### 1. HackerRank Solutions
```bash
# Example: Java Loops II
javac HackerRankSolutions/JavaLoopsII.java
java HackerRankSolutions.JavaLoopsII

# Example: Java Date and Time
javac HackerRankSolutions/JavaDateAndTime.java
java HackerRankSolutions.JavaDateAndTime
```

### 2. Access Modifiers Demo
```bash
javac AccessModifiers/*.java
java AccessModifiers.AccessModifierDemo
```

### 3. Inheritance Demo
```bash
javac Inheritance/*.java
java Inheritance.InheritanceDemo
```

### 4. Encapsulation Demo
```bash
javac Encapsulation/EncapsulationDemo.java
java Encapsulation.EncapsulationDemo
```

### 5. Anonymous Inner Class & Method Overriding
```bash
javac AnonymousInnerClass/AnonymousInnerClassDemo.java
java AnonymousInnerClass.AnonymousInnerClassDemo

javac MethodOverriding/MethodOverridingDemo.java
java MethodOverriding.MethodOverridingDemo
```

---

## 🌟 Summary of Learned Concepts
- **Data Hiding & Protection:** Using `private` fields, getter/setter methods, and `protected` access specifiers.
- **Code Reuse & Polymorphism:** Building scalable class hierarchies with inheritance (`extends`) and overriding methods.
- **Constructor Chaining:** Mastering `super()` and `this()` for proper object lifecycle management.
- **Dynamic Input Processing:** Handling EOF, series expansion, and date conversions using Java standard libraries.
- **Robustness:** Utilizing `try-catch` blocks and static pre-validations to prevent runtime crashes.
