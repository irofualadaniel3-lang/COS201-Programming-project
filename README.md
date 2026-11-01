# COS 201 — Computer Programming I

This repository holds my Java practical work for COS 201 Computer Programming I, one folder per week.

## Student Information

- Name: Irofuala Daniel
- Matriculation Number: 25/17793
- Programme: Computer Science
- Course: COS 201 — Computer Programming I

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

I typed, compiled and ran my first Java program, then added more output to it: the course code and title, my programme of study, three reasons programming is important in Computer Science and my learning goal for the course.

### File

- `week01/FirstProgram.java`

### How to Run

Open a terminal in the `week01` folder and type:

- `javac FirstProgram.java`
- `java FirstProgram`

### Skills Practised

- Writing a class with a `main` method
- Printing text to the screen with `System.out.println()`
- Compiling with `javac` and running the program with `java`
- Uploading my work to GitHub with Git

Activities A, B and C (the IPO model, algorithms, pseudocode and flowcharts) were done on paper, as the notes instruct, so they are not in this repository.

## Week 2: Development Environment and First Java Program

### Objective

To install and set up the Java development environment, write a simple Java program, compile and run it, and submit the source code on GitHub.

### Files

- `week02/HelloWorld.java`: the HelloWorld practical, changed to show my name, matric number, course, programme, topic and goal.
- `week02/StudentProfile.java`: prints my student profile, using `print()` for each label and `println()` for each value.
- `week02/PrintExample.java`: the `print()` and `println()` practice exercise. The output I predicted before running it is in the comment at the top of the file.
- `week02/ErrorExample.java`: the "find and fix the error" exercise. The line from the notes had no semicolon at the end, which gave the compiler error `';' expected`. This is the corrected version.

### How to Run

1. Open a terminal in the `week02` folder.
2. Compile the program, for example: `javac HelloWorld.java`
3. Run it: `java HelloWorld`

`StudentProfile`, `PrintExample` and `ErrorExample` are compiled and run in the same way, using their own names.

### Learning Outcome

This week I learnt how to compile a program with `javac` and run it with `java`, that `print()` stays on the same line while `println()` moves to a new line, how to add comments to my code, how to read a compiler error message and fix the mistake, and how to push my files to GitHub.

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using Scanner.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Asks for two numbers and prints the result of addition, subtraction, multiplication, division and remainder (`+`, `-`, `*`, `/` and `%`). If the second number is 0, it prints "not possible" for division and remainder instead of dividing by zero.
2. `week03/AverageCalculator.java`
   - Asks for a student's name and three scores, then prints the scores, the total and the average. For the extension exercise, it stores whether all three scores are between 0 and 100 in a `boolean` variable, and shows an error message instead of an average if any score is out of range.
3. `week03/ItemCost.java`
   - Asks for an item name, the quantity bought and the price of one unit, then prints a bill showing the total cost in Naira (for example `2,400.00 Naira`). It rejects a quantity of 0 or less and a negative price.

### How to Run

Open a terminal in the `week03` folder.

Simple calculator:

- `javac SimpleCalculator.java`
- `java SimpleCalculator`

Average calculator:

- `javac AverageCalculator.java`
- `java AverageCalculator`

Item cost:

- `javac ItemCost.java`
- `java ItemCost`

### Testing

I worked out each answer by hand first, then ran the program and checked that its output matched. I used whole numbers, decimals, negative numbers, boundary values and invalid inputs.

| Program | Input | Expected result |
| --- | --- | --- |
| SimpleCalculator | 24 and 7 | 31.00, 17.00, 168.00, division 3.43, remainder 3.00 |
| SimpleCalculator | 5.5 and 2 | 7.50, 3.50, 11.00, division 2.75, remainder 1.50 |
| SimpleCalculator | -6 and 4 | -2.00, -10.00, -24.00, division -1.50, remainder -2.00 |
| SimpleCalculator | 9 and 0 | Addition, subtraction and multiplication shown; division and remainder "not possible" |
| AverageCalculator | 62, 79, 85 | Total 226.00, Average 75.33 |
| AverageCalculator | 100, 100, 0 (boundary values) | Total 200.00, Average 66.67 |
| AverageCalculator | -1, 50, 50 | Error message, no average |
| AverageCalculator | 70, 60, 120 | Error message, no average |
| ItemCost | Indomie noodles, quantity 8, unit price 300 | Total Cost 2,400.00 Naira |
| ItemCost | USB flash drive, quantity 3, unit price 4999.99 | Total Cost 14,999.97 Naira |
| ItemCost | Pen, quantity 0, unit price 100 | Error message, no total |

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub

### Learning Outcome

This week I learnt how to pick the right data type for each value (`int` for a quantity, `double` for prices and scores, `String` for names, and `boolean` for a yes/no check), how to read keyboard input with `Scanner`, how to write expressions with the arithmetic operators including `%`, how to use `if` and `else` to stop invalid input or division by zero, how to format numbers with `printf()`, and why I should test a program with different kinds of input before submitting it.
