/******************************************************************************

**Lab Assignment 25**
เขียนโปรแกรมคำนวนผลรวม 1 ถึง N โดยใช้ do...while

*******************************************************************************/

#include <stdio.h>

int main() {
    int n;
    int i = 1;
    int sum = 0;

    printf("Enter N: ");
    scanf("%d", &n);

    do {
        sum += i;
        i++;
    } while (i <= n);

    printf("Sum 1 to %d is %d\n", n, sum);
    return 0;
}