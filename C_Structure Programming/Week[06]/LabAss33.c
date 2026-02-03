/******************************************************************************

**Lab Assignment 33**
เขียนโปรแกรมรับและคำนวณคะแนนโดยต้องทำเป็นmenuและใช้structure(structs)

*******************************************************************************/

#include <stdio.h>
#include <string.h>

// 1. ประกาศโครงสร้างข้อมูล (Structure)
typedef struct {
    char name[50];  // เก็บชื่อ
    int score;      // เก็บคะแนน
} Student;

// ประกาศ Function Prototype
void inputData(Student st[], int *count);
void showData(Student st[], int count);
void analyzeData(Student st[], int count);

int main() {
    Student students[100]; // อาร์เรย์ของ Structure เก็บได้สูงสุด 100 คน
    int count = 0;         // ตัวแปรนับจำนวนนักเรียนปัจจุบัน
    int choice;

    do {
        // แสดงเมนู
        printf("\n=============================\n");
        printf("       STUDENT SCORE SYSTEM    \n");
        printf("=============================\n");
        printf("1. Input Scores\n");
        printf("2. Show All Scores\n");
        printf("3. Analyze (Max, Min, Avg)\n");
        printf("0. Exit\n");
        printf("=============================\n");
        printf("Select Menu: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                inputData(students, &count); // ส่ง address ของ count ไปเพื่ออัปเดตค่า
                break;
            case 2:
                showData(students, count);
                break;
            case 3:
                analyzeData(students, count);
                break;
            case 0:
                printf("Exiting Program...\n");
                break;
            default:
                printf("Invalid Choice!\n");
        }
    } while (choice != 0);

    return 0;
}

// ฟังก์ชันรับข้อมูล
void inputData(Student st[], int *count) {
    int n, i;
    printf("\n--- Input Data ---\n");
    printf("How many students to add? : ");
    scanf("%d", &n);

    // วนลูปรับค่าตามจำนวนที่ระบุ
    // ใช้ *count เพื่อต่อท้ายข้อมูลเดิมที่มีอยู่ (ถ้ามี)
    for (i = 0; i < n; i++) {
        printf("Student %d Name: ", *count + 1);
        scanf("%s", st[*count].name); // รับชื่อ (ไม่เว้นวรรค)
        
        printf("Student %d Score: ", *count + 1);
        scanf("%d", &st[*count].score); // สังเกตการเข้าถึง struct ใช้จุด (.)

        (*count)++; // เพิ่มจำนวนนักเรียนรวม
    }
    printf("Data saved successfully!\n");
}

// ฟังก์ชันแสดงผล
void showData(Student st[], int count) {
    printf("\n--- Student List ---\n");
    if (count == 0) {
        printf("No data found.\n");
        return;
    }

    printf("%-5s %-20s %-10s\n", "No.", "Name", "Score");
    printf("------------------------------------\n");
    for (int i = 0; i < count; i++) {
        // st[i].name คือเข้าถึงตัวแปร name ของคนลำดับที่ i
        printf("%-5d %-20s %-10d\n", i + 1, st[i].name, st[i].score);
    }
}

// ฟังก์ชันวิเคราะห์ข้อมูล (Sum, Max, Min, Avg)
void analyzeData(Student st[], int count) {
    if (count == 0) {
        printf("\nNo data to analyze.\n");
        return;
    }

    int max = st[0].score;
    int min = st[0].score;
    int sum = 0;
    char maxName[50], minName[50]; // เก็บชื่อคนเก่งสุด/อ่อนสุด

    // กำหนดชื่อเริ่มต้น
    strcpy(maxName, st[0].name);
    strcpy(minName, st[0].name);

    for (int i = 0; i < count; i++) {
        sum += st[i].score;

        // หาค่ามากสุด
        if (st[i].score > max) {
            max = st[i].score;
            strcpy(maxName, st[i].name); // จำชื่อคนเก่งสุดไว้
        }

        // หาค่าน้อยสุด
        if (st[i].score < min) {
            min = st[i].score;
            strcpy(minName, st[i].name); // จำชื่อคนได้น้อยสุดไว้
        }
    }

    float avg = (float)sum / count;

    printf("\n--- Analysis Result ---\n");
    printf("Total Students : %d\n", count);
    printf("Average Score  : %.2f\n", avg);
    printf("Max Score      : %d (by %s)\n", max, maxName);
    printf("Min Score      : %d (by %s)\n", min, minName);
}