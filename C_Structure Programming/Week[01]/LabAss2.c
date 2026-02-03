/******************************************************************************
**Lab Assignment 2**
จงเขียนโปรแกรม เพื่อคำนวณหาปริมาตรของรูปทรงกระบอก Volume = Area x H โดยมีข้อมูลเข้า
(Input) จากคีย์บอร์ด คือ ค่าของรัศมีของวงกลม (r: Radius) ที่เป็นฐานของรูปทรงกระบอก และค่าความ
สูงของรูปทรงกระบอก (h: Height) ตามลำดับ เมื่อกำหนดให้พื้นที่ฐาน คือ พื้นที่ของวงกลม (Area) =
πr^2 พร้อมพิมพ์ผลลัพธ์
วิธีการคำนวณ ปริมาตร =(π =1.314) *r*r*h

*******************************************************************************/
#include <stdio.h>

int main() {
    float radius, height, volume;
    const float PI = 1.314; // ถ้าเป็นค่ามาตรฐาน =  3.14159

    //Input
    printf("***********************************************\n");
    printf("*                                             *\n");
    printf("*        Volume of cylinder Calculator        *\n");
    printf("*                                             *\n");
    printf("***********************************************\n");
    printf("Enter Radius: ");
    scanf("%f", &radius);
    printf("Enter Height: ");
    scanf("%f", &height);

    // Process 
    volume = PI * radius * radius * height;

    //Output
    printf("Volume of Cylinder = %.2f\n", volume);

    return 0;
}
