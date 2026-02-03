/******************************************************************************

**Lab Assignment 26**
เขียนโปรแกรมคำนวนผลรวม M ถึง N โดยใช้ do...while

*******************************************************************************/

#include <stdio.h>

int main() {
    int m, n;
    int sum = 0;

    printf("Enter M (Start): ");
    scanf("%d", &m);
    printf("Enter N (End): ");
    scanf("%d", &n);
    
    if (m > n) {
        printf("Error: Start value (M) must be less than End value (N).\n");
    } else {
    int i = m;

    do {
        sum += i;
        i++;
    } while (i <= n);

    printf("Sum %d to %d is %d\n", m, n, sum);
    return 0;
}
}