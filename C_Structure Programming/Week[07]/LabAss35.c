/******************************************************************************

**Lab Assignment 35**
Swap (Pass by Reference)

*******************************************************************************/

#include <stdio.h>

// ฟังก์ชันรับค่าเป็น Pointer (Address)
void swap(int *x, int *y) {
    int temp;
    // ใช้ * เพื่อเข้าถึงค่าข้อมูล ณ ตำแหน่งนั้น
    temp = *x;
    *x = *y;
    *y = temp;
    printf("[Inside Function] Swapped successfully.\n");
}

int main() {
    int a, b;

    printf("Enter number A: ");
    scanf("%d", &a);
    printf("Enter number B: ");
    scanf("%d", &b);

    printf("\n--- Before Swap ---\n");
    printf("A = %d, B = %d\n", a, b);

    // เรียกใช้ฟังก์ชันโดยใส่ & เพื่อส่งตำแหน่งที่อยู่ (Address)
    swap(&a, &b);

    printf("\n--- After Swap (In Main) ---\n");
    printf("A = %d, B = %d\n", a, b);
    printf("(Values CHANGED because it is Pass by Reference)\n");

    return 0;
}