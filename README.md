<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:050505,50:4C1D95,100:000000&height=230&section=header&text=LIBRARY%20MANAGEMENT%20SYSTEM&fontSize=38&fontColor=ffffff&fontAlignY=35&animation=twinkling&desc=JAVA%20OOP%20%7C%20BOOKS%20%7C%20MANAGEMENT&descAlignY=58&descSize=17" width="100%"/>

<br>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=21&duration=2300&pause=700&color=A855F7&center=true&vCenter=true&width=750&lines=WELCOME+TO+THE+DIGITAL+LIBRARY+%F0%9F%93%9A;ADD+%7C+SEARCH+%7C+ISSUE+%7C+RETURN;MANAGE+YOUR+BOOKS+LIKE+A+PRO;JAVA+OOP+IN+ACTION+%F0%9F%94%A5" />

<br>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-4C1D95?style=for-the-badge)
![Console](https://img.shields.io/badge/Type-Console%20Application-black?style=for-the-badge)

</div>

---

# 📚 ABOUT THE PROJECT

**Library Management System** is a Java console application built using **Object-Oriented Programming**.

It allows users to manage books and track whether each book is currently available or issued.

```text id="2r8f8f"
             📚 LIBRARY
                 │
      ┌──────────┼──────────┐
      ▼          ▼          ▼
    ➕ ADD     🔍 SEARCH    📋 VIEW
                 │
          ┌──────┴──────┐
          ▼             ▼
       📖 ISSUE      ↩️ RETURN
```

---

# ⚡ FEATURES

```text id="ly5g8h"
📚 Add Book
📋 View All Books
🔍 Search Book by ID
📖 Issue Book
↩️ Return Book
🟢 Available Status
🔴 Issued Status
🖥️ Menu-Based Interface
```

---

# 🧠 OOP CONCEPTS

| Concept       | Usage                |
| ------------- | -------------------- |
| Class         | `Book`               |
| Object        | Book objects         |
| Constructor   | Initialize book data |
| Encapsulation | Private variables    |
| Methods       | Book operations      |
| ArrayList     | Store books          |
| Boolean       | Track issued status  |

### Object Architecture

```text id="g4f9jp"
              Book
               │
       ┌───────┴───────┐
       ▼               ▼
   Book Object     Book Object
       │               │
       └───────┬───────┘
               ▼
        ArrayList<Book>
               │
               ▼
     Library Management
```

---

# 🔄 BOOK STATUS SYSTEM

```text id="5xv4n2"
        📚 BOOK
          │
          ▼
   ┌───────────────┐
   │   AVAILABLE   │
   │      🟢       │
   └───────┬───────┘
           │
           │ Issue
           ▼
   ┌───────────────┐
   │    ISSUED     │
   │      🔴       │
   └───────┬───────┘
           │
           │ Return
           ▼
   ┌───────────────┐
   │   AVAILABLE   │
   │      🟢       │
   └───────────────┘
```

---

# 🖥️ SAMPLE OUTPUT

```text id="k7kqz0"
=================================
      LIBRARY MANAGEMENT SYSTEM
=================================
1. Add Book
2. View All Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit
=================================

Enter your choice: 1

Enter Book ID: 101
Enter Book Title: Java Programming
Enter Author Name: James Gosling

✅ Book added successfully!
```

### Issue Book

```text id="7h8q3z"
Enter your choice: 4

Enter Book ID to issue: 101

📖 Book issued successfully!
```

### Book Status

```text id="6k2b0n"
--------------------------------
Book ID : 101
Title   : Java Programming
Author  : James Gosling
Status  : 🔴 Issued
--------------------------------
```

---

# 🚀 HOW TO RUN

### Clone

```bash id="j8y3mt"
git clone https://github.com/YOUR-USERNAME/Library-Management-System.git
```

### Compile

```bash id="n9q4gk"
javac Book.java LibraryManagementSystem.java
```

### Run

```bash id="w5v7fa"
java LibraryManagementSystem
```

---

# 📂 PROJECT STRUCTURE

```text id="r5m1xz"
Library-Management-System/
│
├── Book.java
├── LibraryManagementSystem.java
└── README.md
```

---

# 🔮 FUTURE UPDATES

```text id="5t0k4p"
[✓] Add Book
[✓] View Books
[✓] Search Book
[✓] Issue Book
[✓] Return Book
[✓] Availability Status
[✓] OOP Structure

[ ] Add Members
[ ] Member Management
[ ] Issue History
[ ] Due Dates
[ ] Fine Calculation
[ ] File Storage
[ ] Database Integration
[ ] GUI Version
```

---

<div align="center">

## ⚡ CODE • READ • BUILD • REPEAT ⚡

<br>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:000000,50:4C1D95,100:050505&height=130&section=footer&animation=twinkling" width="100%"/>

**Built with ☕ Java & 📚 OOP**

</div>
