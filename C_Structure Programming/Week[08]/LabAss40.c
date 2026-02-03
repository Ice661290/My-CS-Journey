/******************************************************************************

**Lab Assignment 40**
เขียนโปรแกรมจัดการเงินเดือนของพนักงานโดยกำหนดให้ใช้Functionตามนี้
-> void main(){}

-> int menu(){}

-> int input (struct *){}

-> int output (struct *){}

Extra ****-> int Lisearch(int key,struct *){} //key ให้ค้นหาเงินเดือน 
และใช้การเรียกเมนูเพื่อทำการใช้งาน

*******************************************************************************/

#include <stdio.h>
#include <string.h>

// ประกาศ Struct ตามความเหมาะสมของโจทย์
struct Employee {
    char name[50];
    int salary;
};

// --- Function Prototypes ---
int menu();
// จำเป็นต้องส่ง int *n เข้าไปใน input เพื่ออัปเดตจำนวนข้อมูล
int input(struct Employee *emp, int *n); 
// จำเป็นต้องส่ง int n เข้าไปใน output/search เพื่อให้รู้ขอบเขตข้อมูล
int output(struct Employee *emp, int n); 
int Lisearch(int key, struct Employee *emp, int n);

// -> void main(){}
void main() {
    struct Employee employees[100]; // สร้าง Array ของ Struct ไว้รอรับค่า
    int count = 0; // ตัวแปรนับจำนวนข้อมูลที่มีอยู่จริง
    int choice;
    int searchKey; // ตัวแปรสำหรับรับค่าเงินเดือนที่จะค้นหา

    do {
        choice = menu(); // เรียกเมนู

        switch (choice) {
            case 1:
                // เรียก Input และส่ง address ของ count ไปอัปเดต
                input(employees, &count);
                break;
            case 2:
                output(employees, count);
                break;
            case 3:
                if (count == 0) {
                    printf("\nNo data to search!\n");
                } else {
                    printf("\nEnter Salary to search: ");
                    scanf("%d", &searchKey);
                    // เรียก Lisearch ค้นหาเงินเดือน
                    Lisearch(searchKey, employees, count);
                }
                break;
            case 0:
                printf("Exit program.\n");
                break;
            default:
                printf("Invalid choice!\n");
        }

    } while (choice != 0);
}

// -> int menu(){}
int menu() {
    int ch;
    printf("\n=== Employee Management System ===\n");
    printf("1. Input Data\n");
    printf("2. Output Data\n");
    printf("3. Search by Salary (Linear Search)\n");
    printf("0. Exit\n");
    printf("Select menu: ");
    scanf("%d", &ch);
    return ch;
}

// -> int input (struct *){} 
// (ปรับแก้เป็นรับ pointer ของ count เพื่อให้นับจำนวนคนได้ถูกต้อง)
int input(struct Employee *emp, int *n) {
    int num, i;
    printf("\nHow many employees to add?: ");
    scanf("%d", &num);

    // วนลูปรับค่า โดยเริ่มต่อจากตำแหน่งเดิม (*n)
    for (i = 0; i < num; i++) {
        printf("--- Employee %d ---\n", *n + 1);
        printf("Name: ");
        scanf("%s", emp[*n].name);
        printf("Salary: ");
        scanf("%d", &emp[*n].salary);
        
        (*n)++; // เพิ่มจำนวนนับข้อมูลรวม
    }
    return 0;
}

// -> int output (struct *){}
int output(struct Employee *emp, int n) {
    if (n == 0) {
        printf("\nNo data available.\n");
        return 0;
    }

    printf("\n--- Employee List ---\n");
    printf("%-5s %-20s %-10s\n", "No.", "Name", "Salary");
    printf("------------------------------------\n");
    for (int i = 0; i < n; i++) {
        printf("%-5d %-20s %-10d\n", i + 1, emp[i].name, emp[i].salary);
    }
    return 1;
}

// Extra ****-> int Lisearch(int key,struct *){}
// ค้นหาด้วย key (เงินเดือน) แบบ Linear Search
int Lisearch(int key, struct Employee *emp, int n) {
    int found = 0;
    printf("\n--- Search Result (Salary: %d) ---\n", key);
    
    for (int i = 0; i < n; i++) {
        if (emp[i].salary == key) {
            printf("Found! Name: %s, Salary: %d (at index %d)\n", emp[i].name, emp[i].salary, i);
            found = 1;
        }
    }

    if (!found) {
        printf("Data not found.\n");
        return -1; // ไม่เจอ
    }
    return 1; // เจอ
}