# OOPProgramming_Lab1_KanePaulMari
Activity made for Sir Jamie Eduardo Rosal.

## Class responsibilities: 
MathematicalOperations ( Base Class ) - This acts as the foundation of the library, responsible for storing the operands and numbers required for computation.
ArithmeticOperations - Focuses on basic math calculations.
GeometryOperations - Handles computations such as Area of a circle and perimeter of rectangle.
NumberAnalysis - Responsible for number theory logic, such as determining if a number is prime, and calculating a factorial.
OOP_KP ( Driver Class ) - This is the main class and the test cases can be tested in this class.

## Inheritance Structure
This design utilizes a Hierarchy Inheritance, which improves organization. Instead of each child class declaring its own variables, they "inherit" the operands and numbers from the parent class. This allows the child classes to focus solely on the operations.

## Application of Ecapsulation
Encapsulation was applied to protect the integrity of the data and to prevent direct data modification. All attributes are declared as "private". Access is granted only through publc getter and setter methods.
