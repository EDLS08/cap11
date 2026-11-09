# Student Management System

A simple Java console application for storing, organizing, ranking, and searching students using the Collections Framework.

## Project overview

Each student has three attributes:

- Name
- Grade
- Registration number

The application starts with ten sample students and demonstrates different ways to organize and retrieve this data.

## Collections and concepts

| Structure | Purpose |
|---|---|
| `HashMap<Integer, Aluno>` | Stores students using their registration numbers as keys |
| `TreeMap<Integer, Aluno>` | Displays students ordered by registration number |
| `TreeSet<String>` | Stores unique names in alphabetical order |
| `ArrayList<Aluno>` | Creates a list that can be sorted by grade |
| `Comparator` | Sorts students from the highest grade to the lowest |

The project also uses generics, constructors, encapsulation, enhanced for loops, `Map.Entry`, method references, and map lookup with `get()`.

## Project structure

```text
cap11/
├── src/
│   ├── Aluno.java
│   └── Main.java
├── .gitignore
├── README.md
└── README-pt-br.md
```

## Requirements

- Java Development Kit (JDK) 8 or later

## How to run

From the project root directory:

```bash
javac -d out src/*.java
java -cp out Main
```

The program displays the students by registration number, lists names alphabetically, prints a grade ranking, and asks for a registration number to search.

## Learning objective

The main goal is to understand that each collection has a different purpose and that multiple structures can be combined to solve different data organization and lookup problems.
