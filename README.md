# 🚆 Train Consist Management Application

## 📌 Overview
The Train Consist Management App is a console-based Java application that simulates how railway systems manage train bogies.

This use case focuses on enforcing uniqueness of bogie IDs using Set.

---

## 🎯 Use Case 3: Track Unique Bogie IDs (HashSet)

### 📖 Description
This use case introduces the `Set` interface and `HashSet` implementation to ensure that no duplicate bogie IDs exist in the system.

---

## ⚠️ Drawback of UC2
- Used ArrayList which allows duplicates
- Duplicate bogie IDs can cause:
  - Data inconsistency
  - Invalid train formation
  - Safety issues

👉 UC3 solves this using HashSet.

---

## 🔑 Key Concepts Used

- **Set Interface** → Collection that does not allow duplicates  
- **HashSet** → Implementation using hashing  
- **add()** → Insert elements  
- **Automatic Deduplication** → Removes duplicates automatically  
- **Unordered Storage** → No index-based ordering  

---

## 🛠 Key Requirements Implemented

- Created `HashSet<String>` for bogie IDs  
- Added duplicate values intentionally  
- Displayed final set  
- Verified duplicates are removed automatically  

---

## ▶️ How to Run

1. Compile:
   ```bash
   javac UseCase3UniqueBogieIDMgmnt.java