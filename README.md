# Quantum Book Store 📚

This project is a Java-based online bookstore system built as part of the **Fawry Internship Challenge**.  
It demonstrates the use of clean code principles and SOLID object-oriented design.

---

## 💡 Features

- Add different types of books to inventory:
  - `PaperBook`: shipped to address and has stock.
  - `EBook`: sent via email and has file type.
  - `ShowcaseBook`: not for sale (view only).
- Buy books by ISBN and quantity:
  - Validates purchase by type.
  - Deducts quantity for physical books.
  - Sends via `ShippingService` or `MailService`.
- Remove outdated books based on age.

---

## 🛠️ Technologies

- Java 17+
- OOP Design (SOLID Principles)
- No frameworks – clean and extensible core

---

## 📂 Structure

```
src/
├── interfaces/         # Common service and request interfaces
├── model/              # Book models: PaperBook, EBook, ShowcaseBook
├── request/            # Purchase request types
├── service/            # Inventory, Purchase logic, and mock services
└── Main.java           # Entry point with full test cases
```

---

## ✅ Example Test Case

```java
purchaseService.buyBook("ISBN1", 1, new PaperBookPurchaseRequest("Cairo, Egypt"));
purchaseService.buyBook("ISBN2", 1, new EBookPurchaseRequest("user@example.com"));
```

---

## 📌 SOLID Principles Used

- **Single Responsibility**: each class has one reason to change.
- **Open/Closed**: new book types can be added without modifying existing code.
- **Liskov Substitution**: all books inherit from a common abstract base.
- **Interface Segregation**: specific request types per book.
- **Dependency Inversion**: logic depends on abstractions.

---

## 👤 Author

- **Amira Ashour** – Java Developer, aspiring software engineer 💻
