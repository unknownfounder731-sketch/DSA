// input: a=10, b=20 using pointer swap both number so that output: a=20, b=10

#include <stdio.h>

int main() {
    printf("Enter two numbers: ");
    int a, b;
    scanf("%d %d", &a, &b);

    int *p1 = &a, *p2 = &b;

    printf("Before swapping: a = %d, b = %d\n", a, b);

    int temp = *p1;
    *p1 = *p2;
    *p2 = temp;

    printf("After swapping: a = %d, b = %d\n", a, b);

    return 0;
}