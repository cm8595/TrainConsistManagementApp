# 🚆 Train Consist Management Application

## 📌 Overview
The Train Consist Management App simulates how railway systems manage train bogies and their operational attributes.

This use case focuses on mapping bogies to their seating or load capacity using HashMap.

---

## 🎯 Use Case 6: Map Bogie to Capacity (HashMap)

### 📖 Description
This use case introduces key–value mapping where each bogie is associated with its capacity.

---

## ⚠️ Drawback of UC5
- Only stored bogie names
- No additional attributes
- Cannot perform validation or analysis

👉 UC6 solves this using HashMap.

---

## 🔑 Key Concepts Used

- **HashMap** → Key–value data structure  
- **Map Interface** → Associates keys with values  
- **put()** → Insert mapping  
- **entrySet()** → Iterate over entries  
- **Fast Lookup** → Retrieve values in constant time  

---

## 🛠 Key Requirements Implemented

- Created `HashMap<String, Integer>`  
- Added bogie-capacity mappings:
  - Sleeper → 72  
  - AC Chair → 54  
  - First Class → 24  
- Iterated using `entrySet()`  
- Displayed all bogies with capacity  

---

## ▶️ How to Run

1. Compile:
   ```bash
   javac UseCase6BogieCapacityMapping.java