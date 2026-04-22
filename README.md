# 🚆 Train Consist Management Application

## 📌 Overview
The Train Consist Management App simulates how railway systems manage train bogies.

This use case focuses on filtering bogies using Java Stream API.

---

## 🎯 Use Case 8: Filter Bogies Using Streams

### 📖 Description
This use case demonstrates how to filter bogies based on capacity using a declarative programming approach.

---

## ⚠️ Drawback of UC7
- Sorting organizes data but does not filter it
- Requires loops for selection
- Code becomes verbose

👉 UC8 solves this using Stream API.

---

## 🔑 Key Concepts Used

- **Stream API** → Functional data processing  
- **stream()** → Convert list to stream  
- **filter()** → Apply condition  
- **Lambda Expression** → Define logic  
- **collect()** → Convert back to list  
- **Declarative Style** → Focus on WHAT, not HOW  

---

## 🛠 Key Requirements Implemented

- Reused Bogie class  
- Created `List<Bogie>`  
- Applied:
  ```java
  filter(b -> b.getCapacity() > 60)