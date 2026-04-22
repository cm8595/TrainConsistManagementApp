# 🚆 UC12: Safety Compliance Check (Streams)

## 📌 Description
This use case validates safety rules for goods bogies using Stream API.

---

## 🎯 Goal
Ensure cylindrical bogies carry only petroleum.

---

## 🔑 Key Concepts

- Stream API
- allMatch()
- Lambda expressions
- Conditional logic

---

## 🛠 Rule Implemented

Cylindrical bogie → only Petroleum allowed

```java
!type.equals("Cylindrical") || cargo.equals("Petroleum")