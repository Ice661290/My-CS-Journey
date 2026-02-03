/******************************************************************************
**Lab Assignment 7**
จงเขียนโปรแกรมเพื่อคำนวณหาค่า BMI โดยรับค่าน้ำหนัก (กก.) และส่วนสูง(ซม.) และแสดงผลลัพธ์จาก
การคำนวณ โดยใช้สูตร BMI = น้ำหนัก(กก.)/ส่วนสูง^2(ม.)
EX:
 Enter Weight: 65
 Enter height: 180
 
 BMI = 20.06

*******************************************************************************/

#include <stdio.h>

int main() {
    float weight, height_cm, height_m, bmi;

    //Input
    printf("***********************************************\n");
    printf("*                                             *\n");
    printf("*                BMI Calculator               *\n");
    printf("*                                             *\n");
    printf("***********************************************\n");
    printf("Enter Weight (kg): ");
    scanf("%f", &weight);
    printf("Enter Height (cm): ");
    scanf("%f", &height_cm);

    //Process
    height_m = height_cm / 100.0; // แปลงเป็นเมตร
    bmi = weight / (height_m * height_m);

    //Output
    printf("Your BMI is %.2f\n", bmi);

    return 0;
}