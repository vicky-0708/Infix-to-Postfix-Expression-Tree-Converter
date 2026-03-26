# Infix to Postfix Expression Tree Converter

## Project Description
In mathematics, expressions are usually written in infix form such as `A + B * C`. However, computers find it easier to evaluate expressions written in postfix form.

In this project, we convert an infix expression into a postfix expression using a stack. After that, we construct an expression tree from the postfix expression using a binary tree.

This project helps us understand how data structures are used in expression processing and evaluation.

---

## Problem Statement
Mathematical expressions written in infix form are easy for humans to understand, but computers require a more structured representation for efficient processing and evaluation. This project converts an infix expression into postfix form and then builds an expression tree to represent the expression using binary tree concepts.

---

## Data Structures Used
### 1. Stack
Used for converting infix expressions to postfix expressions.

### 2. Binary Tree
Used to construct the expression tree from the postfix expression.

---

## Expected Features
- Accept an infix expression from the user
- Convert the infix expression to postfix form
- Build an expression tree from the postfix expression
- Display tree traversals such as:
  - Inorder
  - Preorder
  - Postorder

---

## Project Modules
- **stack.c / stack.h** → Infix to postfix conversion using stack
- **tree.c / tree.h** → Expression tree construction
- **traversal.c / traversal.h** → Tree traversals
- **io.c / io.h** → Input and output handling
- **main.c** → Integration of all modules

---

## Core Operations
- Input handling
- Operator precedence checking
- Infix to postfix conversion
- Expression tree construction
- Tree traversal display

---

## Algorithm Plan

### Infix to Postfix Conversion
1. Scan the infix expression from left to right
2. If operand, add it to postfix
3. If operator, handle precedence using stack
4. If parentheses appear, process accordingly
5. Output the postfix expression

### Expression Tree Construction
1. Read postfix expression
2. If operand, create a node and push it into stack
3. If operator, pop two nodes and create a new operator node
4. Attach the popped nodes as children
5. Push the new node back into stack
6. Final node becomes the root of the expression tree

### Tree Traversals
- Inorder Traversal
- Preorder Traversal
- Postorder Traversal

---

## Team Members
- **VICKY GIRI** – 1012411233
- **SHIVRAJ INGALE** – 1012411236
- **ATHARVA KUDALE** – 1012512018
- **SHALEM ARSUD** – 1012512026

---

## Task Distribution
- **VICKY GIRI** – Binary tree traversal implementation and documentation
- **SHIVRAJ INGALE** – Infix to postfix conversion using stack
- **ATHARVA KUDALE** – Expression tree construction
- **SHALEM ARSUD** – Input/Output handling and repository management

---

## Development Timeline

### Week 1
- Topic selection
- Proposal preparation
- Repository creation
- Basic planning

### Week 2
- Code implementation
- Testing and debugging
- Integration of modules

### Week 3
- Final code cleanup
- Demo preparation
- Viva preparation

---

## Future Scope
- Add support for multi-digit operands
- Add expression evaluation
- Add graphical tree visualization
- Improve error handling for invalid expressions
