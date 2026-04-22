# 🚆 Train Consist Management Application

## 📌 Overview
The Train Consist Management App simulates how railway systems manage train bogies.

This use case focuses on maintaining both:
✔ Order of bogies  
✔ Uniqueness of bogies  

using LinkedHashSet.

---

## 🎯 Use Case 5: Preserve Insertion Order (LinkedHashSet)

### 📖 Description
This use case demonstrates how LinkedHashSet ensures that:
- Bogies are stored without duplication
- Original insertion order is preserved

---

## ⚠️ Drawback of UC4
- LinkedList maintains order but:
  - Allows duplicates
  - No constraint enforcement
- Does not prevent invalid repeated bogies

👉 UC5 solves this using LinkedHashSet.

---

## 🔑 Key Concepts Used

- **LinkedHashSet** → Maintains order + uniqueness  
- **Set Interface** → No duplicate elements  
- **add()** → Insert bogies  
- **Automatic Deduplication** → Prevents duplicates  
- **Ordered Iteration** → Maintains insertion sequence  

---

## 🛠 Key Requirements Implemented

- Created `LinkedHashSet<String>` for train formation  
- Added bogies:
  - Engine
  - Sleeper
  - Cargo
  - Guard  
- Attempted duplicate insertion (Sleeper)  
- Displayed final formation  
- Verified duplicates are removed  

---

## ▶️ How to Run

1. Compile:
   ```bash
   javac UseCase5OrderedUniqueFormation.java