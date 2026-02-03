/******************************************************************************

**Lab Assignment 38**
เขียนโปรแกรมเพื่อรับค่า Username และ Password

โดยหาก Username = “admin” และ Password = 1234 ให้แสดงข้อความว่า “Welcome my Admin”

หากไม่ถูกต้องให้แสดงข้อความว่า “Invalid Login” ถ้าใส่ผิดเกิน 3 ครั้ง ให้พิมพ์ข้อความว่า Good Bye Next Time 

*******************************************************************************/

#include <stdio.h>
#include <string.h> // จำเป็นต้องใช้สำหรับฟังก์ชัน strcmp

int main() {
    char username[50];
    int password;
    int count = 0;      // ตัวนับจำนวนครั้งที่ใส่ผิด
    int isLogin = 0;    // ตัวแปรเช็คสถานะ (0=ยังเข้าไม่ได้, 1=เข้าได้แล้ว)

    // วนลูปตราบใดที่ยัง login ไม่สำเร็จ และ จำนวนครั้งที่ผิดยังไม่ครบ 3
    while (count < 3) {
        printf("-----------------------\n");
        //printf("Attempt %d of 3\n", count + 1); // แสดงรอบที่พยายาม
        
        // 1. รับค่า Input
        printf("Enter Username: ");
        scanf("%s", username);
        printf("Enter Password: ");
        scanf("%d", &password);

        // 2. ตรวจสอบเงื่อนไข
        // strcmp(a, b) == 0 คือข้อความเหมือนกัน
        if (strcmp(username, "admin") == 0 && password == 1234) {
            printf("\nWelcome my Admin\n");
            isLogin = 1; // เปลี่ยนสถานะเป็นเข้าสู่ระบบสำเร็จ
            break;       // สั่งหยุดการวนลูปทันที
        } else {
            printf("Invalid Login\n");
            count++;     // บวกจำนวนครั้งที่ผิดเพิ่ม 1
        }
    }

    // 3. ตรวจสอบหลังจากจบลูป
    // ถ้าวนจนครบ 3 รอบแล้วยัง login ไม่ได้ (isLogin ยังเป็น 0)
    if (isLogin == 0) {
        printf("\nGood Bye Next Time\n");
    }

    return 0;
}