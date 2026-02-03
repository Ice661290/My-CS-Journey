/******************************************************************************
**Lab Assignment 8**
เขียนโปรแกรมเพื่อตรวจสอบตัวเลขที่รับเข้ามาว่าเป็นเลขคู่ หรือเลขคี่

*******************************************************************************/

#include <stdio.h>

int main() {
    int number;

    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|                Is Even or Odd               |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter number: ");
    scanf("%d", &number);

    if (number % 2 == 0) {
        printf("%d is Even number\n", number);
    } else {
        printf("%d is Odd number\n", number);
    }
    return 0;
}