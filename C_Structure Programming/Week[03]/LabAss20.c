/******************************************************************************

**Lab Assignment 20**
Palindrome

*******************************************************************************/

#include <stdio.h>

int main() {
    int n, original, reversed = 0, remainder;

    printf("Enter an integer: ");
    scanf("%d", &n);

    original = n; // เก็บค่าเดิมไว้เทียบตอนท้าย

    // ใช้ for loop เพื่อกลับด้านตัวเลข
    // เงื่อนไข: ทำไปเรื่อยๆ ตราบใดที่ n ยังไม่เป็น 0 (n != 0)
    // รอบถัดไป: ลดค่า n ลงโดยการหาร 10 (n /= 10)
    for ( ; n != 0; n /= 10) {
        remainder = n % 10;           // ดึงเลขท้ายสุดมา
        reversed = reversed * 10 + remainder; // เอาเลขท้ายไปต่อในตัวแปร reversed
    }

    // ตรวจสอบว่าค่าที่กลับด้าน เท่ากับ ค่าเดิมหรือไม่
    if (original == reversed) {
        printf("%d is a palindrome.\n", original);
    } else {
        printf("%d is not a palindrome.\n", original);
    }

    return 0;
}