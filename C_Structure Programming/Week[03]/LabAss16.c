/******************************************************************************
**Lab Assignment 16**
เขียนโปรแกรมตัดเกรดโดยใช้คำสั่ง switch case
โดยกำหนดเกณฑ์ให้ดังนี้
A 80-100
B 70-79
C 60-69
D 50-59
F 0-49

*******************************************************************************/

#include <stdio.h>

int main() {
    int score;
    
    printf("-----------------------------------------------\n");
    printf("|                                             |\n");
    printf("|               Grading Program               |\n");
    printf("|                                             |\n");
    printf("-----------------------------------------------\n");
    printf("Enter Score (0-100): ");
    scanf("%d", &score);

    if(score < 0 || score > 100) {
        printf("Invalid score!\n");
    } else {
        // ใช้เทคนิคหาร 10 เพื่อแยกช่วงคะแนน
        switch (score / 10) {
            case 10: 
            case 9:  //(ถ้ามีเกรด A+ ก็แก้ตรงนี้ได้ แต่โจทย์ให้รวมเป็น A)
            case 8:  
                printf("Grade: A\n");
                break;
            case 7:  
                printf("Grade: B\n");
                break;
            case 6:  
                printf("Grade: C\n");
                break;
            case 5:  
                printf("Grade: D\n");
                break;
            default: 
                printf("Grade: F\n");
                break;
        }
    }

    return 0;
}