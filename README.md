# COMP2013-Object-Oriented-Programming
Java Library Management System (MVC &amp; Observer Pattern) for Monash FIT9131 Credit Transfer Application





# Library Management System (Java MVC)

A comprehensive library borrowing management system developed using **Java Swing** and the **MVC (Model-View-Controller)** architecture. The system incorporates the **Observer design pattern** to achieve real-time synchronization between the data model and multiple view interfaces. It supports both Graphical User Interface (GUI) and Command Line Interface (CLI) interaction modes[cite: 3, 6, 14, 18, 19, 23].

---

## 🌟 Project Overview

- **Dual Interaction Modes**:
  - **GUI**: Built with Java Swing, offering multi-window operations and real-time interactive visualization[cite: 3, 14].
  - **CLI**: A console-based, menu-driven interface suitable for lightweight testing and terminal-based workflows[cite: 6].
- **Hierarchical User Role Management**:
  - **Borrower**: Represents users who borrow books from the library (tracked as positive book counts)[cite: 5].
  - **Lender**: Represents users who supply/lend books to the library (tracked as negative book counts to indicate resource contributions)[cite: 17].
- **Data Visualization**: Features a custom-rendered line chart (`HistoryPanel`) using `Graphics2D` to dynamically track historical borrowing trends over time[cite: 4, 21].
- **Robust Exception Handling**: Implements custom exception handling for unknown users (`UnknownUserException`) and invalid borrowing/lending operations (`NotALenderException`)[cite: 1, 5, 8, 12, 20].
- **Practical Application of Design Patterns**:
  - **MVC**: Decouples presentation logic from core business rules for maintainable and scalable code[cite: 1, 7, 8, 9, 10, 14, 18].
  - **Observer Pattern**: Utilizes the `ModelListener` interface to automatically notify and update registered views upon model state changes[cite: 14, 18, 19, 23].

---

## 🛠️ Project Structure (MVC)

The overall directory structure and module breakdown are as follows:

```text
├── Model
│   ├── Library.java              # Core model managing user list, history records, and event notifications[cite: 18]
│   ├── User.java                 # Abstract base class for users[cite: 13]
│   ├── IUser.java                # Interface defining user behavior[cite: 16]
│   ├── Borrower.java             # Concrete class for borrowers[cite: 5]
│   ├── Lender.java               # Concrete class for lenders[cite: 17]
│   ├── ModelListener.java        # Observer pattern interface[cite: 19]
│   ├── UnknownUserException.java # Custom exception for missing users[cite: 12]
│   └── NotALenderException.java  # Custom exception for invalid lending logic[cite: 20]
│
├── Controller
│   ├── Controller.java           # Base controller class[cite: 7]
│   ├── ControllerSimple.java     # Basic test controller[cite: 2]
│   ├── ControllerCreate.java     # Controller for user creation[cite: 8]
│   ├── ControllerGetBook.java    # Controller for querying book counts[cite: 9]
│   ├── ControllerMoreBook.java   # Controller for modifying book counts[cite: 1]
│   └── ControllerHistory.java    # Controller for history tracking[cite: 10]
│
├── View
│   ├── View.java                 # Abstract base class for GUI windows[cite: 14]
│   ├── ViewSimple.java           # Real-time display window for total borrowed books[cite: 23]
│   ├── ViewCreate.java           # Window for creating users[cite: 15]
│   ├── ViewGetBook.java          # Window for querying user books[cite: 24]
│   ├── ViewMoreBook.java         # Window for adjusting book counts[cite: 22]
│   ├── ViewHistory.java          # Window for rendering the history trend chart[cite: 21]
│   └── HistoryPanel.java         # Custom panel component for line chart rendering[cite: 4]
│
└── Entry & Test
    ├── GUI.java                  # Main entry point for the GUI application[cite: 3]
    ├── CLI.java                  # Main entry point for the CLI application[cite: 6]
    └── Test.java                 # Main entry point for unit testing[cite: 11]
