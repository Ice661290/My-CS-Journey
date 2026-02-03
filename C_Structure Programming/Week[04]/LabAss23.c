/******************************************************************************

**Lab Assignment 23**
เขียนโปรแกรมคำนวนผลรวม M ถึง N โดยใช้ while

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
    int i = m; // เริ่มต้นที่ m

    while (i <= n) {
        sum += i;
        i++;
    }

    printf("Sum %d to %d is %d\n", m, n, sum);
    return 0;
}
}