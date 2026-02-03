/******************************************************************************

**Lab Assignment 31**
เขียนโปรแกรมเครื่องคิดเลข โดยใช้Function prototypeทั้ง4แบบให้ครบมของแต่ละอาร์เรย์

*******************************************************************************/

#include <stdio.h>

/* --- 1. ประกาศ Function Prototypes (ส่วนหัวฟังก์ชัน) --- */

void showWelcome();                                // แบบที่ 1: ไม่มีค่าตอบกลับ (void) และ ไม่มีพารามิเตอร์ (void)
char getOperator();                                // แบบที่ 2: มีค่าตอบกลับ (char) และ ไม่มีพารามิเตอร์ (void)
float calculate(float num1, float num2, char op);  // แบบที่ 3: มีค่าตอบกลับ (float) และ มีพารามิเตอร์ (รับค่ามาคำนวณ)
void showResult(float res);                        // แบบที่ 4: ไม่มีค่าตอบกลับ (void) และ มีพารามิเตอร์ (รับค่าไปแสดงผล)


/* --- 2. Main Function --- (จำเป็นต้องมีเพราะเป็นตัวรันหลัก)*/
int main() {
    float n1, n2, result;
    char oper;
    
    // เรียกใช้แบบที่ 1: แสดงข้อความต้อนรับ
    showWelcome();  

    // รับค่าตัวเลข (เขียนใน main เพื่อความง่าย)
    printf("Enter Number 1: ");
    scanf("%f", &n1);
    printf("Enter Number 2: ");
    scanf("%f", &n2);

    // เรียกใช้แบบที่ 2: รับค่าเครื่องหมาย แล้วเก็บใส่ตัวแปร oper
    oper = getOperator();

    // เรียกใช้แบบที่ 3: ส่งค่าไปคำนวณ แล้วเก็บผลลัพธ์ใส่ตัวแปร result
    // (หมายเหตุ: ในฟังก์ชัน calculate มีการดักจับหารด้วย 0 ไว้เบื้องต้น)
    if (oper == '/' && n2 == 0) {
        printf("Error: Cannot divide by Zero!\n");
    } else {
        result = calculate(n1, n2, oper);
        
        // เรียกใช้แบบที่ 4: ส่งผลลัพธ์ไปแสดงผล
        showResult(result);
    }

    return 0;
}

/* --- 3. Function Definitions (ส่วนเขียนการทำงาน) --- */

// แบบที่ 1: No Return, No Argument
void showWelcome() {
    printf("********************************\n");
    printf("* My Calculator Program   *\n");
    printf("********************************\n");
}

// แบบที่ 2: With Return, No Argument
char getOperator() {
    char op;
    printf("Select Operator (+, -, *, /): ");
    scanf(" %c", &op); // มีเว้นวรรคหน้า %c เพื่อข้าม newline
    return op; // ส่งค่า op กลับไปให้ main
}

// แบบที่ 3: With Return, With Argument
float calculate(float num1, float num2, char op) {
    float answer = 0.0;
    switch(op) {
        case '+': answer = num1 + num2; break;
        case '-': answer = num1 - num2; break;
        case '*': answer = num1 * num2; break;
        case '/': answer = num1 / num2; break;
        default:  answer = 0.0; break;
    }
    return answer; // ส่งค่า answer กลับไป
}

// แบบที่ 4: No Return, With Argument
void showResult(float res) {
    printf("--------------------------------\n");
    printf("Result is: %.2f\n", res);
    printf("--------------------------------\n");
}