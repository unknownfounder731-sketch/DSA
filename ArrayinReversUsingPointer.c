// print array in reverse using pointer Input: arr={10,20,30,40,50} using pointer print the array in reverse order so that output: 50 40 30 20 10

#include <stdio.h>
int main() {
    cout << "Enter the nmber of element in array: ";
    int n;
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    int n = sizeof(arr) / sizeof(arr[0]);
    int *ptr = arr + n - 1; // Point to the last element of the array
    printf("Array in reverse order: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", *ptr);
        ptr--;
    }
    printf("\n");
    return 0;
}