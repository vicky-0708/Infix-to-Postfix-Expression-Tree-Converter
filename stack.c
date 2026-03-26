#include <stdio.h>
#include <ctype.h>
#include "stack.h"

char stack[MAX];
int top = -1;

void push(char x) {
    stack[++top] = x;
}

char pop() {
    if (top == -1)
        return -1;
    return stack[top--];
}

char peek() {
    return stack[top];
}

int precedence(char x) {
    if (x == '+' || x == '-') return 1;
    if (x == '*' || x == '/') return 2;
    return 0;
}

void infixToPostfix(char infix[], char postfix[]) {
    int i = 0, k = 0;
    char x;

    while (infix[i] != '\0') {
        if (isalnum(infix[i])) {
            postfix[k++] = infix[i];
        }
        else if (infix[i] == '(') {
            push(infix[i]);
        }
        else if (infix[i] == ')') {
            while ((x = pop()) != '(')
                postfix[k++] = x;
        }
        else {
            while (top != -1 && precedence(peek()) >= precedence(infix[i])) {
                postfix[k++] = pop();
            }
            push(infix[i]);
        }
        i++;
    }

    while (top != -1) {
        postfix[k++] = pop();
    }

    postfix[k] = '\0';
}