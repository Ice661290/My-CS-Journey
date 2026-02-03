/******************************************************************************
**Lab Assignment 5**
จงเขียนโปรแกรมเพื่อทำการแปลงค่าองศาฟาเรนไฮต์เป็นองศาเซลเซียส โดยรับค่าองศาฟาเรนไฮต์และ
แสดงผลลัพธ์จากการคำนวณ โดยใช้สูตร C = (F-32)/1.8
Ex:
 Enter Fahrenheit(°F): 120
 Temperature in Celsius(°C) = 48.89

*******************************************************************************/

#include <stdio.h>

int main() {
    float f, c;

    //Input
    printf("***********************************************\n");
    printf("*                                             *\n");
    printf("*        Convert F° to C° Calculator          *\n");
    printf("*                                             *\n");
    printf("***********************************************\n");
    printf("Enter Fahrenheit(°F): ");
    scanf("%f", &f);

    // Process
    c = (f - 32) / 1.8;

    //Output
    printf("Temperature in Celsius(°C) = %.2f°C\n", c);

    return 0;
}