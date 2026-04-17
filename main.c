#include <stdio.h>
#include "stack.h"
#include "tree.h"
#include "traversal.h"

int main()
{
    char infix[100];
    char postfix[100];

    // take infix expression from user
    printf("Enter Infix Expression: ");
    scanf("%s", infix);

    // convert infix to postfix using stack module
    infixToPostfix(infix, postfix);
    printf("\nPostfix Expression: %s\n", postfix);

    // build expression tree from postfix
    struct Node* root = buildExpressionTree(postfix);

    // print traversals of the tree
    printf("\nInorder Traversal: ");
    inorder(root);

    printf("\nPreorder Traversal: ");
    preorder(root);

    printf("\nPostorder Traversal: ");
    postorder(root);

    printf("\n");

    return 0;
}
