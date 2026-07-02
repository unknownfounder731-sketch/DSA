// input: arr={10,20,30,40,50} using pointer find the maximum number in the array so that output: maximum=50

#include <stdio.h>

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int *ptr = arr;
    int max = *ptr;

    for (int i = 1; i < n; i++) {
        if (*(ptr + i) > max) {
            max = *(ptr + i);
        }
    }

    printf("Maximum number in the array is: %d\n", max);
    return 0;
}