/******************************************************************************
**Lab Assignment 15**
เขียนโปรแกรมเพื่อคำนวณค่าบริการจัดส่งสินค้า ของบริษัท HCU Express โดยกำหนดให้โปรแกรมทำการรับค่า
น้ำหนักของสินค้า (Weight) และขนาดของกล่องบรรจุ (Size) และคำนวณราคาค่าจัดส่งตามเงื่อนไขต่อไปนี้ พร้อม
แสดงผลลัพธ์ดังตัวอย่าง

----------------------------------------------------------------------------------------------
|    Box     |    น้ำหนัก(Weight)    |     ขนาดกล่องบรรจุ(Size)   |   ราคาค่าจัดส่ง(Service Charge)  |        

         S             ไม่เกิน 5                                 ไม่เกิน 60                                              70

      M             ไม่เกิน 10                   ไม่เกิน 90                       90       

      L             ไม่เกิน 15                   ไม่เกิน 120                      170

      XL            ไม่เกิน 20                   ไม่เกิน 150                      250


Ex 1:
Enter Weight(kg.) : 5

Enter Size (cm.) : 50

Service Charge : 70

Ex 2:

Enter Weight(kg.) : 8

Enter Size (cm.) : 100

Service Charge : 170

*******************************************************************************/

#include <stdio.h>

int main() {
    float weight, size;
    int price = 0;

    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|     HCU Express Service Price Calculator    |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter Weight(kg.): ");
    scanf("%f", &weight);
    printf("Enter Size (cm.): ");
    scanf("%f", &size);

    // ตรวจสอบเงื่อนไขจากเล็กไปใหญ่ ต้องผ่านเงื่อนไข "ทั้งคู่" ถึงจะได้ราคานั้น
    // แต่ถ้าอย่างใดอย่างหนึ่งเกิน ต้องขยับไปราคาถัดไป
    // วิธีที่ง่ายคือ เช็คจาก S -> XL

    if (weight <= 5 && size <= 60) {
        price = 70;
    } else if (weight <= 10 && size <= 90) {
        price = 90;
    } else if (weight <= 15 && size <= 120) {
        price = 170;
    } else if (weight <= 20 && size <= 150) {
        price = 250;
    } else {
        // กรณีเกิน XL (โจทย์ไม่ได้ระบุ แต่ควรมีดักไว้)
        printf("Over limit cannot ship\n");
        return 0; 
    }

    printf("Service Charge : %d\n", price);

    return 0;
}