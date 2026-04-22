# Infix to Postfix Expression Tree Converter

## Project Description
In mathematics, expressions are usually written in infix form like A + B * C. But computers find it easier to evaluate expressions in postfix form.

In this project, we convert an infix expression into postfix using a stack. After that, we build an expression tree from the postfix expression using a binary tree.

To make the project more user-friendly, we also implemented a simple GUI using Java Swing.

This project mainly helps in understanding how stack and tree data structures are used in expression processing.

---

## Problem Statement
Infix expressions are easy for humans to understand but not efficient for computers to process directly. So, the goal of this project is to convert infix expressions into postfix form and then represent them using an expression tree.

---

## Data Structures Used

Stack  
Used for infix to postfix conversion  

Binary Tree  
Used for building the expression tree  

---

## Features
- Takes infix expression as input through GUI  
- Converts infix to postfix  
- Builds expression tree  
- Displays:
  - Inorder traversal  
  - Preorder traversal  
  - Postorder traversal  
- Simple GUI using Java Swing  

---

## Project Modules
- InfixToPostfix.java → Handles infix to postfix conversion  
- ExpressionTree.java → Builds expression tree  
- Traversal.java → Performs tree traversals  
- Main.java → GUI and integration  

---

## How It Works
1. User enters infix expression  
2. Expression is converted to postfix  
3. Expression tree is created  
4. Traversals are performed  
5. Output is displayed on GUI  

---

## Sample Input
(A+B)*C

## Sample Output
Postfix: AB+C*  

Inorder: A + B * C  
Preorder: * + A B C  
Postorder: A B + C *  

---

## Team Members
Vicky Giri – 1012411233  
Shivraj Ingale – 1012411236  
Atharva Kudale – 1012512018  
Shalem Arsud – 1012512026  

---

## Task Distribution
Vicky Giri – Tree traversal algorithms (inorder, preorder, postorder) and documentation  

Shivraj Ingale – Infix to postfix conversion using stack  

Atharva Kudale – Expression tree construction  

Shalem Arsud – Java Swing GUI and integration of all modules  

---

## Development Timeline

Week 1  
Topic selection  
Planning and repository setup  

Week 2  
Code implementation  
Testing and debugging  
Integration of modules  

Week 3  
Final cleanup  
Demo preparation  
Viva preparation  

---

## Future Scope
- Support multi-digit inputs  
- Add expression evaluation  
- Improve GUI design  
- Better error handling  

---
