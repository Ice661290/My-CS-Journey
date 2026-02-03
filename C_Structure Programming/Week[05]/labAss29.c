/******************************************************************************

**Lab Assignment 29**
เขียนโปรแกรมเพื่อทำการคำนวณหาค่าผลรวม ค่าต่ำสุด สูงสุด และค่าเฉลี่ยของคะแนนทั้งหมด

*******************************************************************************/

#include <stdio.h>

int main() {
    int scores[100];
    int n, i;
    int sum = 0, max, min;
    float avg;

    printf("Enter number of students: ");
    scanf("%d", &n);

    // รับค่าข้อมูล
    for (i = 0; i < n; i++) {
        printf("Enter score %d: ", i + 1);
        scanf("%d", &scores[i]);
    }

    // เริ่มต้นกระบวนการคำนวณ
    // กำหนดค่าเริ่มต้นให้ max และ min เป็นค่าของตัวแรกใน array
    max = scores[0];
    min = scores[0];
    sum = 0;

    for (i = 0; i < n; i++) {
        // หาผลรวม
        sum = sum + scores[i];

        // หาค่าสูงสุด (ถ้าตัวปัจจุบัน มากกว่า max ให้เปลี่ยนค่า max)
        if (scores[i] > max) {
            max = scores[i];
        }

        // หาค่าต่ำสุด (ถ้าตัวปัจจุบัน น้อยกว่า min ให้เปลี่ยนค่า min)
        if (scores[i] < min) {
            min = scores[i];
        }
    }

    // คำนวณค่าเฉลี่ย (ต้องแปลง sum เป็น float ก่อนหารเพื่อให้ได้ทศนิยม)
    avg = (float)sum / n;

    // แสดงผล
    printf("\n--- Result ---\n");
    printf("Total Sum  : %d\n", sum);
    printf("Maximum    : %d\n", max);
    printf("Minimum    : %d\n", min);
    printf("Average    : %.2f\n", avg);

    return 0;
}