/******************************************************************************
**Lab Assignment 12**
เขียนโปรแกรมเครื่องคิดเลขเพื่อคำนวณการบวก การลบ การคูณ การหาร การหารเอาเศษ
โดยกำหนดให้รับค่าตัวเลข 2 จำนวน และทำการเลือกตัวดำเนินการ (Operator) ที่
ต้องการได้แก่ +, -, *, /, % พร้อมแสดงผลลัพธ์ที่ได้ออกทางหน้าจอ

*******************************************************************************/

#include <stdio.h>

int main() {
    int num1, num2;
    char op;

    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|                Calculator                   |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter Operator (+, -, *, /, %%): ");
    scanf(" %c", &op); // มีเว้นวรรคหน้า %c เพื่อข้าม newline
    printf("Enter num1: ");
    scanf("%d", &num1);
    printf("Enter num2: ");
    scanf("%d", &num2);

    switch (op) {
        case '+': printf("Result: %d\n", num1 + num2); break;
        case '-': printf("Result: %d\n", num1 - num2); break;
        case '*': printf("Result: %d\n", num1 * num2); break;
        case '/':
            if(num2 != 0) 
              printf("Result: %d\n", num1 / num2);
            else 
              printf("Error: Divide by Zero\n");
            break;
        case '%':
             if(num2 != 0) 
               printf("Result: %d\n", num1 % num2);
             else 
               printf("Error: Divide by Zero\n");
             break;
        default: printf("Invalid Operator\n");
    }
    return 0;
}