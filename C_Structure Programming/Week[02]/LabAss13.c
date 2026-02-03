/******************************************************************************
**Lab Assignment 13**
จงเขียนโปรแกรมเพื่อคำนวณหาค่า BMI โดยรับค่าน้ำหนัก (กก.) และส่วนสูง(ซม.) และแสดงผลลัพธ์จาก
การคำนวณ โดยใช้สูตร BMI = น้ำหนัก(กก.)/ส่วนสูง^2(ม.)

--------------------------------------------------------------
|    BMI kǥ/m^2        |      อยู่ในเกณฑ์      |   ภาวะเสี่ยงต่อโรค  |        

   น้อยกว่า 18.50             น้ำหนักน้อย / ผอม       มากกว่าคนปกติ

 ระหว่าง 18.50 - 22.90         ปกติ (สุขภาพดี)          เท่าคนปกติ                        

 ระหว่าง 23 - 24.90           ท้วม / โรคอ้วนระดับ 1      อันตรายระดับ 1

 ระหว่าง 25 - 29.90           อ้วน / โรคอ้วนระดับ 2      อันตรายระดับ 2

       มากกว่า 30           อ้วนมาก / โรคอ้วนระดับ 3    อันตรายระดับ 3

*******************************************************************************/

#include <stdio.h>

int main() {
    float weight, height_cm, height_m, bmi;
    
    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|               BMI Calculator                |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter Weight (kg): ");
    scanf("%f", &weight);
    printf("Enter Height (cm): ");
    scanf("%f", &height_cm);

    height_m = height_cm / 100.0;
    bmi = weight / (height_m * height_m);

    printf("BMI = %.2f\n", bmi);

    if (bmi < 18.50) {
        printf("Result: Underweight\n");
    } else if (bmi <= 22.90) {
        printf("Result: Normal\n");
    } else if (bmi <= 24.90) {
        printf("Result: Obese Level 1\n");
    } else if (bmi <= 29.90) {
        printf("Result: Obese Level 2\n");
    } else {
        printf("Result: Obese Level 3\n");
    }
    return 0;
}