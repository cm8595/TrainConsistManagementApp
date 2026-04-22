# 🚆 Train Consist Management Application

## 📌 Overview
The Train Consist Management App simulates how railway systems manage train bogies.

This use case focuses on maintaining the correct physical order of bogies using LinkedList.

---

## 🎯 Use Case 4: Maintain Ordered Train Consist (LinkedList)

### 📖 Description
This use case demonstrates how LinkedList helps maintain the physical sequence of train bogies and allows efficient insertion and deletion.

---

## ⚠️ Drawback of UC3
- HashSet ensures uniqueness but:
  - Does NOT maintain order
  - Produces unpredictable arrangement
- Train formation requires strict sequence

👉 UC4 solves this using LinkedList.

---

## 🔑 Key Concepts Used

- **LinkedList** → Doubly linked list implementation  
- **Node Structure** → Each element linked to previous and next  
- **addFirst() / addLast()** → Insert at ends  
- **add(index, element)** → Insert at specific position  
- **removeFirst() / removeLast()** → Remove from ends  
- **Order Preservation** → Maintains sequence  

---

## 🛠 Key Requirements Implemented

- Created `LinkedList<String>` for train consist  
- Added bogies:
  - Engine
  - Sleeper
  - AC
  - Cargo
  - Guard  
- Inserted "Pantry Car" at position 2  
- Removed first and last bogies  
- Displayed final train consist  

---

## ▶️ How to Run

1. Compile:
   ```bash
   javac UseCase4OrderedConsistMgmnt.java