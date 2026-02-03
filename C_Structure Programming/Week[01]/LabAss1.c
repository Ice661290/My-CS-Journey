/******************************************************************************
**LAB ASSIGNMENT 1**
จงเขียนโปรแกรม เพื่อคำนวณหาพื้นที่ของสามเหลี่ยม Area = 1/2 x ฐาน x สูง โดยมีข้อมูลเข้า (Input)
จากคีย์บอร์ด คือ ค่าของฐานของสามเหลี่ยม (b: Base) และค่าความสูงของสามเหลี่ยม (h: Height)
พร้อมพิมพ์ผลลัพธ์

*******************************************************************************/
#include <stdio.h>

int main() {
    float base, height, area;

    // รับค่า Input
    printf("*********************************************\n");
    printf("*                                           *\n");
    printf("*        Area of Triangle Calculator        *\n");
    printf("*                                           *\n");
    printf("*********************************************\n");
    printf("Enter Base: ");
    scanf("%f", &base);
    printf("Enter Height: ");
    scanf("%f", &height);

    // Process คำนวณ
    area = 0.5 * base * height;

    // แสดงผล Output
    printf("Area of Triangle = %.2f\n", area);

    return 0;
}