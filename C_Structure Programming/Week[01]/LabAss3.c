/******************************************************************************
**Lab Assignment 3**
จงเขียนโปรแกรม เพื่อรับค่าของเวลา ณ ปัจจุบัน คือ ชั่วโมง (Hour), นาที (Min), และวินาที (Sec) เป็น
ข้อมูลเข้า (Input) จากคีย์บอร์ด และพิมพ์ค่าของเวลานั้น ในรูปแบบ hh:mm:ss ตัวอย่างเช่น

ENTER current Hour = 10

ENTER current Min = 45

ENTER current Sec = 5

Current time is 10:45:05

*******************************************************************************/

#include <stdio.h>

int main() {
    int hour, min, sec;

    //Input
    printf("***********************************************\n");
    printf("*                                             *\n");
    printf("*                   Timer                     *\n");
    printf("*                                             *\n");
    printf("***********************************************\n");
    printf("ENTER current Hour = ");
    scanf("%d", &hour);
    printf("ENTER current Min = ");
    scanf("%d", &min);
    printf("ENTER current Sec = ");
    scanf("%d", &sec);

    // Process & Output (ใช้ %02d เพื่อเติมเลข 0 ข้างหน้าถ้ามีหลักเดียว)
    printf("Current time is %02d:%02d:%02d\n", hour, min, sec);

    return 0;
}
