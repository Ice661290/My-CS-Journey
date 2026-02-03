/******************************************************************************
**Lab Assignment 4**
จงเขียนโปรแกรม เพื่อคำนวณคะแนนรวมของผลสอบวิชา C Programming จากคะแนน Mid-term,
คะแนน Final, และคะแนน Homework เป็นข้อมูลเข้า (Input) จากคีย์บอร์ด และแสดงผลลัพธ์จากการ
คำนวณ เมื่อ
คะแนนรวม (Total) = Mid-term (40%) + Final (50%) + HW (10%)

*******************************************************************************/

#include <stdio.h>

int main() {
    float mid, final_score, hw, total;

    //Input
    printf("***********************************************\n");
    printf("*                                             *\n");
    printf("*         Total Score Calculator              *\n");
    printf("*                                             *\n");
    printf("***********************************************\n");
    printf("Enter Mid-term Score: ");
    scanf("%f", &mid);
    printf("Enter Final Score: ");
    scanf("%f", &final_score);
    printf("Enter Homework Score: ");
    scanf("%f", &hw);

    // Process
    total = (mid * 0.40) + (final_score * 0.50) + (hw * 0.10);

    //Output
    printf("Total Score = %.2f\n", total);

    return 0;
}
