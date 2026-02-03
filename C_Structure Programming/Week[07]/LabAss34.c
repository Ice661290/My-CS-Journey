/******************************************************************************

**Lab Assignment 34**
Swap (Pass by Value)

*******************************************************************************/

#include <stdio.h>

// ฟังก์ชันรับค่า int ธรรมดา (Value)
void swap(int x, int y) {
    int temp;
    temp = x;
    x = y;
    y = temp;
    printf("[Inside Function] x = %d, y = %d\n", x, y);
}

int main() {
    int a, b;

    printf("Enter number A: ");
    scanf("%d", &a);
    printf("Enter number B: ");
    scanf("%d", &b);

    printf("\n--- Before Swap ---\n");
    printf("A = %d, B = %d\n", a, b);

    // เรียกใช้ฟังก์ชัน (ส่งค่า copy ไป)
    swap(a, b);

    printf("\n--- After Swap (In Main) ---\n");
    printf("A = %d, B = %d\n", a, b);
    printf("(Values did NOT change because it is Pass by Value)\n");

    return 0;
}