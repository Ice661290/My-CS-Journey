/******************************************************************************
**Lab Assignment 14**
เขียนโปรแกรมเพื่อรับค่า Username และ Password
โดยหาก Username = "admin" และ Password = 1234 ให้แสดงข้อความว่า "Welcome my Admin"
หากไม่ถูกต้องให้แสดงข้อความว่า "Invalid Login"

*******************************************************************************/

#include <stdio.h>
#include <string.h> // จำเป็นสำหรับการใช้ strcmp

int main() {
    char username[50];
    int password;

    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|               Login System                  |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter Username: ");
    scanf("%s", username);
    printf("Enter Password: ");
    scanf("%d", &password);

    // strcmp ใช้เปรียบเทียบข้อความ ถ้าเหมือนกันจะได้ค่า 0
    if (strcmp(username, "admin") == 0 && password == 1234) {
        printf("Welcome my Admin\n");
    } else {
        printf("Invalid Login\n");
    }

    return 0;
}