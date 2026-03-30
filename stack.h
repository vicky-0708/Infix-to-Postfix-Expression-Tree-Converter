#ifndef STACK_H
#define STACK_H

#define MAX 100

void push(char x);
char pop();
char peek();
int precedence(char x);
void infixToPostfix(char infix[], char postfix[]);

#endif
