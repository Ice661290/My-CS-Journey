/******************************************************************************

**Lab Assignment 36**
Factorial
คอนเซปต์: Recursive Function คือฟังก์ชันที่เรียกใช้ตัวเองสูตร
          Factorial: n! = n*(n-1)!
          จุดหยุด (Base Case): ถ้า n = 0 หรือ 1 ให้ตอบ 1
*******************************************************************************/

#include <stdio.h>

// ฟังก์ชันเรียกตัวเองเพื่อหา Factorial
int factorial(int n) {
    // Base Case: จุดหยุด
    if (n <= 1) {
        return 1;
    } 
    // Recursive Step: เรียกตัวเองโดยลดค่า n ลง
    else {
        return n * factorial(n - 1);
    }
}

int main() {
    int num, result;

    printf("Enter number for Factorial: ");
    scanf("%d", &num);

    if (num < 0) {
        printf("Factorial needs positive number.\n");
    } else {
        result = factorial(num);
        printf("Factorial of %d is %d\n", num, result);
    }

    return 0;
}