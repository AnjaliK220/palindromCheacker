#  Palindrome Checker (Console + GUI)

A versatile and highly robust Java application developed as part of the Java Development Internship. This project features a unique **Hybrid Dual-Architecture** that combines a continuous command-line framework and a Graphical User Interface (GUI) into a single unified application.

---

## 🚀 Key Architectural Features

* **Dual Boot-Up Choice:** Upon execution, the system dynamically prompts the user in the terminal to select their preferred operational mode (Console or GUI).
* **Intelligent Data Cleaning:** Automatically strips out spaces, punctuation marks, commas, and special symbols using Regex (`[^a-zA-Z0-9]`) before verification.
* **Case-Insensitive Normalization:** Converts all input streams to lowercase to ensure absolute accuracy regardless of mixed capitalization.
* **Continuous Console Interface (Mode 1):** Implements an infinite `while(true)` control loop allowing users to test infinite words sequentially without restarts until entering the termination phrase.
* **Premium Swing GUI Canvas (Mode 2):** Launches a sleek, modern dark-themed interactive window utilizing layout coordinates, responsive inputs, and dynamic color-coded feedback alerts.

---

## 🛠️ Tech Stack & Methods Used

* **Language:** Java (JDK 8+)
* **GUI Framework:** Java Swing (`javax.swing.*`) & Abstract Window Toolkit (`java.awt.*`)
* **Core Mechanics:**
  * `Scanner(System.in)` - Synchronous stream choice and data parsing.
  * `StringBuilder.reverse()` - Efficient in-place string flipping.
  * `String.replaceAll()` - Regex filtering engine for punctuation stripping.
  * `ActionListener` - Event capture hooks for UI touch actions.

---

## 🕹️ Project Modules Explained

### 1. Mode 1: Continuous Loop Console Mode
Runs natively inside your code terminal. It continuously listens for input strings without resetting.
* **Exit Trigger:** Simply type `exit` to break the active loop thread safely.

### 2. Mode 2: Graphical User Interface (GUI) Mode
Spawns a standalone desktop canvas window anchored perfectly in the screen center.
* **Green State:** Triggers a success message if the string is structurally a palindrome.
* **Red State:** Triggers an error message if the reverse sequence fails to match.
* **Yellow State:** Dynamically checks for null or blank whitespace entries.

---

## 📝 Verification Examples Handled

* `"Madam"` ➡️ **Valid Palindrome** (Case-normalisation handles uppercase 'M')
* `"nayan nayan"` ➡️ **Valid Palindrome** (Space filtering keeps string uniform)
* `"A man, a plan, a canal: Panama"` ➡️ **Valid Palindrome** (Filters out commas and colons flawlessly)
