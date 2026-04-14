#ifndef TREE_H
#define TREE_H

struct Node
{
    char data;
    struct Node *left;
    struct Node *right;
};

struct Node* createNode(char data);
struct Node* buildExpressionTree(char postfix[]);

#endif
