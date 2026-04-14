#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include "tree.h"

#define MAX 100

struct Node* stack[MAX];
int top = -1;

void push(struct Node* node)
{
    stack[++top] = node;
}

struct Node* pop()
{
    if(top == -1)
    {
        printf("Stack underflow\n");
        return NULL;
    }
    return stack[top--];
}

struct Node* createNode(char data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));

    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

struct Node* buildExpressionTree(char postfix[])
{
    int i = 0;

    while(postfix[i] != '\0')
    {
        if(isalnum(postfix[i]))
        {
            push(createNode(postfix[i]));
        }
        else
        {
            struct Node* right = pop();
            struct Node* left = pop();

            if(left == NULL || right == NULL)
            {
                printf("Invalid postfix expression\n");
                return NULL;
            }

            struct Node* newNode = createNode(postfix[i]);
            newNode->left = left;
            newNode->right = right;

            push(newNode);
        }

        i++;
    }

    return pop();
}
