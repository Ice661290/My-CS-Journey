/******************************************************************************

**Lab Assignment 37**
Fibonacci
คอนเซปต์: Fibonacci (Recursive)
          สูตร: Fib(n) = Fib(n-1) + Fib(n-2)     
          จุดหยุด (Base Case): ถ้า n = 0 หรือ 1 ให้ตอบ 1
*******************************************************************************/

#include <stdio.h>

// ฟังก์ชันเรียกตัวเองเพื่อหาค่า Fibonacci ลำดับที่ n
int fibonacci(int n) {
    // Base Case
    if (n == 0) return 0;
    if (n == 1) return 1;

    // Recursive Step
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n, i;

    printf("Enter number of terms for Fibonacci: ");
    scanf("%d", &n);

    printf("Fibonacci Series: ");
    // วนลูปเพื่อแสดงค่า Fibonacci ทีละตัว
    for (i = 0; i < n; i++) {
        printf("%d ", fibonacci(i));
    }
    printf("\n");

    return 0;
}