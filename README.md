# 🚆 Train Consist Management App – UC8 (Stream Filtering)

## 📌 Overview

The **Train Consist Management App** is a console-based Java project that simulates how railway systems manage train bogies.

This use case (**UC8**) demonstrates how to filter passenger bogies based on seating capacity using the **Java Stream API**.

---

## 🎯 Use Case 8: Filter Passenger Bogies Using Streams

### 📖 Description

In this use case, bogies are filtered based on a capacity threshold using a **declarative programming approach**.

Instead of using loops, we use:

```java
filter(b -> b.getCapacity() > threshold)
```

---

## ⚠️ Drawback of UC7

* Sorting organizes data but does not filter it
* Requires manual loops for selection
* Code becomes verbose and harder to maintain

👉 UC8 solves this using **Stream API**

---

## 🔑 Key Concepts Used

* **Stream API** → Functional data processing
* **stream()** → Converts list into stream
* **filter()** → Applies condition
* **Lambda Expressions** → Defines logic concisely
* **collect()** → Converts stream back to list
* **Declarative Programming** → Focus on *what* not *how*

---

## 🛠 Implementation Details

### Classes Created

* `UseCase8TrainConsisntMgmt` → Main logic
* `Bogie` → Custom class with name & capacity
* `UseCase8TrainConsistMgmtTest` → JUnit test class

---

## 📁 Project Structure

```
src/
 ├── main/
 │    ├── UseCase8TrainConsisntMgmt.java
 │    └── Bogie.java
 │
 └── test/
      └── UseCase8TrainConsistMgmtTest.java
```

---

## ▶️ How to Run (VS Code)

### ✅ Run Main Program

1. Open `UseCase8TrainConsisntMgmt.java`
2. Click **Run ▶**

---

### 🧪 Run Test Cases

1. Open `UseCase8TrainConsistMgmtTest.java`
2. Click **Run Test ▶**

👉 Requires:

* Extension Pack for Java
* Java Test Runner

---

## 📌 Sample Output

```
=== UC8: Stream Filtering ===

Filtered (>60):
Sleeper (72)
Luxury Coach (80)
```

---

## 🧪 Test Cases Covered

* Capacity > threshold
* Capacity = threshold
* Capacity < threshold
* Multiple matching bogies
* No matching bogies
* All bogies matching
* Empty list handling
* Original list remains unchanged

---

## 📈 Learning Outcomes

* Understand Stream API
* Apply filtering using lambda expressions
* Write clean and readable code
* Avoid traditional loops
* Learn functional programming concepts

---

## 👨‍💻 Author

**Chaitanya Bhargav**

---

## 🔥 Viva Key Point

> “Streams allow declarative filtering, making the code more readable and maintainable while keeping the original collection unchanged.”
