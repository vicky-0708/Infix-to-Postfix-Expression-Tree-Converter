#include <stdio.h>
#include "io.h"

void getInfix(char infix[])
{
    printf("Enter Infix Expression: ");
    scanf("%s", infix);
}

void displayPostfix(char postfix[])
{
    printf("Postfix Expression: %s\n", postfix);
}
