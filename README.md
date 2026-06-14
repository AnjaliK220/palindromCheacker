# 🔄 Java Development Internship - Task : Palindrome Checker

Welcome to my Java internship project repository! This repository contains two different implementations of a **Palindrome Checker** application to demonstrate both **Command-Line Interface (CLI)** logic and **Graphical User Interface (GUI)** application design.

A Palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (e.g., *radar*, *madam*, *121*).

---

## 📁 Repository Structure & Files

This repository contains two main Java files:

1. **Console / Terminal Mode (`SimplePalindrome.java`)**
   - A standard text-based program that runs entirely inside the terminal.
   - Takes text or number inputs from the user using the `Scanner` class and checks if it's a palindrome.

2. **Desktop App / GUI Mode (`GuiPalindrome.java`)**
   - An interactive desktop application window built using **Java Swing**.
   - Features a text input field, a clickable "Check" button, and an instant visual result display (e.g., "It is a Palindrome!").

---

## ✨ Features Implemented

- **Case Insensitivity:** The logic automatically ignores upper/lower case differences (e.g., treating "Madam" as a valid palindrome).
- **Dual Formats:** Supports checking both words (Strings) and numbers.
- **Interactive UI:** Smooth button clicks and clean layout structure for the desktop version.

---

## 🛠️ Technologies Used

- **Language:** Java (JDK 8 or higher)
- **Frameworks:** Java Swing & AWT (for the GUI Desktop Window)
- **Development Tool:** Visual Studio Code (VS Code)

---

## 🚀 How to Run the Files

### 1. Running the Console (Terminal) Version
Open your VS Code terminal and type these commands:
```bash
javac SimplePalindrome.java
java SimplePalindrome
