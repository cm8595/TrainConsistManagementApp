# 🚆 Train Consist Management Application

## 📌 Overview
The Train Consist Management App simulates how railway systems manage train bogies and their attributes.

This use case focuses on sorting bogies based on capacity using Comparator.

---

## 🎯 Use Case 7: Sort Bogies by Capacity (Comparator)

### 📖 Description
This use case introduces custom sorting of bogies using Comparator, enabling better planning and analysis.

---

## ⚠️ Drawback of UC6
- Data stored but not organized
- No ranking of bogies
- Difficult to compare capacities

👉 UC7 solves this using Comparator.

---

## 🔑 Key Concepts Used

- **Comparator** → Custom sorting logic  
- **Custom Class (Bogie)** → Object with name & capacity  
- **List** → Stores bogie objects  
- **sort()** → Applies sorting  
- **Lambda / Method Reference** → Clean comparison logic  

---

## 🛠 Key Requirements Implemented

- Created `Bogie` class with name & capacity  
- Stored bogies in `List<Bogie>`  
- Added:
  - Sleeper → 72  
  - AC Chair → 56  
  - First Class → 24  
- Sorted using `Comparator.comparingInt()`  
- Displayed sorted results  

---

## ▶️ How to Run

1. Compile:
   ```bash
   javac UseCase7SortBogiesByCapacity.java