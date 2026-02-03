/******************************************************************************

**Lab Assignment 30**
เขียนโปรแกรมเพื่อทำการรับค่าตัวเลขทีละตัว และทำการตรวจสอบว่าค่าดังกล่าวเป็นเลขคู่หรือเลขคี่
หากเป็นเลขคู่ให้นำค่าไปใส่ใน อาร์เรย์ Even หากเป็นเลขคี่ให้นำไปใส่ใน อาร์เรย์ Odd และหาค่าผลรวมของแต่ละอาร์เรย์

*******************************************************************************/

#include <stdio.h>

int main() {
    int evenArr[100], oddArr[100]; // สร้างอาร์เรย์ 2 ตัว
    int evenCount = 0, oddCount = 0; // ตัวนับจำนวนสมาชิกในแต่ละอาร์เรย์
    int evenSum = 0, oddSum = 0;     // ผลรวมของแต่ละอาร์เรย์
    int n, i, num;

    printf("Enter amount of numbers: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("Enter number %d: ", i + 1);
        scanf("%d", &num);

        // ตรวจสอบเลขคู่/คี่
        if (num % 2 == 0) {
            // กรณีเลขคู่: เก็บใส่ evenArr
            evenArr[evenCount] = num;
            evenSum += num;     // บวกผลรวมทันที
            evenCount++;        // ขยับ index ของ array คู่
        } else {
            // กรณีเลขคี่: เก็บใส่ oddArr
            oddArr[oddCount] = num;
            oddSum += num;      // บวกผลรวมทันที
            oddCount++;         // ขยับ index ของ array คี่
        }
    }

    // แสดงผล Array คู่
    printf("\n--- Even Array ---\n");
    printf("Data: ");
    for (i = 0; i < evenCount; i++) {
        printf("%d ", evenArr[i]);
    }
    printf("\nSum of Even: %d\n", evenSum);

    // แสดงผล Array คี่
    printf("\n--- Odd Array ---\n");
    printf("Data: ");
    for (i = 0; i < oddCount; i++) {
        printf("%d ", oddArr[i]);
    }
    printf("\nSum of Odd: %d\n", oddSum);

    return 0;
}