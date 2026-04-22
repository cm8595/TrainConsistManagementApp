# 🚆 UC10: Total Seat Calculation using Stream reduce()

## 📌 Description
This use case demonstrates how to calculate total seating capacity of train bogies using Stream API reduce().

---

## 🎯 Goal
Aggregate all bogie capacities into a single value.

---

## 🔑 Key Concepts

- map() → extract capacity  
- reduce() → aggregate values  
- Integer::sum → method reference  
- Stream pipeline  

---

## 🛠 Logic

```java
bogies.stream()
      .map(b -> b.getCapacity())
      .reduce(0, Integer::sum);