#ifndef TRAVERSAL_H
#define TRAVERSAL_H

struct Node
{
    char data;
    struct Node *left;
    struct Node *right;
};

void inorder(struct Node *root);
void preorder(struct Node *root);
void postorder(struct Node *root);

#endif
