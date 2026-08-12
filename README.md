# COMP2013-Object-Oriented-Programming
Java Library Management System (MVC &amp; Observer Pattern) for Monash FIT9131 Credit Transfer Application





# Library Management System (Java MVC)

A comprehensive library borrowing management system developed using **Java Swing** and the **MVC (Model-View-Controller)** architecture. The system incorporates the **Observer design pattern** to achieve real-time synchronization between the data model and multiple view interfaces. It supports both Graphical User Interface (GUI) and Command Line Interface (CLI) interaction modes.

---

## 🌟 Project Overview

- **Dual Interaction Modes**:
  - **GUI**: Built with Java Swing, offering multi-window operations and real-time interactive visualization.
  - **CLI**: A console-based, menu-driven interface suitable for lightweight testing and terminal-based workflows.
- **Hierarchical User Role Management**:
  - **Borrower**: Represents users who borrow books from the library (tracked as positive book counts).
  - **Lender**: Represents users who supply/lend books to the library (tracked as negative book counts to indicate resource contributions).
- **Data Visualization**: Features a custom-rendered line chart (`HistoryPanel`) using `Graphics2D` to dynamically track historical borrowing trends over time.
- **Robust Exception Handling**: Implements custom exception handling for unknown users (`UnknownUserException`) and invalid borrowing/lending operations (`NotALenderException`).
- **Practical Application of Design Patterns**:
  - **MVC**: Decouples presentation logic from core business rules for maintainable and scalable code.
  - **Observer Pattern**: Utilizes the `ModelListener` interface to automatically notify and update registered views upon model state changes.

---

## 🛠️ Project Structure (MVC)

The overall directory structure and module breakdown are as follows:

```text
├── Model
│   ├── Library.java              # Core model managing user list, history records, and event notifications
│   ├── User.java                 # Abstract base class for users
│   ├── IUser.java                # Interface defining user behavior
│   ├── Borrower.java             # Concrete class for borrowers
│   ├── Lender.java               # Concrete class for lenders
│   ├── ModelListener.java        # Observer pattern interface
│   ├── UnknownUserException.java # Custom exception for missing users
│   └── NotALenderException.java  # Custom exception for invalid lending logic
│
├── Controller
│   ├── Controller.java           # Base controller class
│   ├── ControllerSimple.java     # Basic test controller
│   ├── ControllerCreate.java     # Controller for user creation
│   ├── ControllerGetBook.java    # Controller for querying book counts
│   ├── ControllerMoreBook.java   # Controller for modifying book counts
│   └── ControllerHistory.java    # Controller for history tracking
│
├── View
│   ├── View.java                 # Abstract base class for GUI windows
│   ├── ViewSimple.java           # Real-time display window for total borrowed books
│   ├── ViewCreate.java           # Window for creating users
│   ├── ViewGetBook.java          # Window for querying user books
│   ├── ViewMoreBook.java         # Window for adjusting book counts
│   ├── ViewHistory.java          # Window for rendering the history trend chart
│   └── HistoryPanel.java         # Custom panel component for line chart rendering
│
└── Entry & Test
    ├── GUI.java                  # Main entry point for the GUI application
    ├── CLI.java                  # Main entry point for the CLI application
    └── Test.java                 # Main entry point for unit testing
