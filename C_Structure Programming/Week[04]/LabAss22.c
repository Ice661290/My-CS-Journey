/******************************************************************************

**Lab Assignment 22**
เขียนโปรแกรมคำนวนผลรวม 1 ถึง N โดยใช้ while

*******************************************************************************/

#include <stdio.h>

int main() {
    int n;
    int i = 1;
    int sum = 0;

    printf("Enter N: ");
    scanf("%d", &n);

    while (i <= n) {
        sum += i;
        i++;
    }

    printf("Sum 1 to %d is %d\n", n, sum);
    return 0;
}