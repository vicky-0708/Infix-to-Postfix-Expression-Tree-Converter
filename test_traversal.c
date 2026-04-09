#include <stdio.h>
#include <stdlib.h>
#include "traversal.h"

struct Node* createNode(char data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

int main()
{
    struct Node *root = createNode('*');
    root->left = createNode('+');
    root->right = createNode('C');

    root->left->left = createNode('A');
    root->left->right = createNode('B');

    printf("Inorder: ");
    inorder(root);

    printf("\nPreorder: ");
    preorder(root);

    printf("\nPostorder: ");
    postorder(root);

    return 0;
}
