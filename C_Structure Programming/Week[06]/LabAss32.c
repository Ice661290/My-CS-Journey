/******************************************************************************

**Lab Assignment 32**
เขียนโปรแกรมBinary Search & Sort Algorithm

*******************************************************************************/

#include <stdio.h>

// ประกาศฟังก์ชัน Prototype
void inputData(int arr[], int *n);    //Pointer = * (ไว้ใช้ส่งตำแหน่งของตัวแปรเอาเข้าไปFunction)
void showData(int arr[], int n);
void bubbleSort(int arr[], int n);
void selectionSort(int arr[], int n);
void binarySearch(int arr[], int n);

int main() {
    int data[100]; // อาร์เรย์สำหรับเก็บข้อมูล (สูงสุด 100 ตัว)
    int n = 0;     // ตัวแปรเก็บจำนวนข้อมูลปัจจุบัน
    int choice;

    do {
        // แสดงเมนูตามรูปภาพ
        printf("\n");
        printf("***Select Menu       ***\n");
        printf("***1. Input          ***\n");
        printf("***2. Show           ***\n");
        printf("***3. BubbleSort     ***\n");
        printf("***4. SelectionSort  ***\n");
        printf("***5. Binary Search  ***\n");
        printf("***0. Exit           ***\n");
        printf("************************\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                inputData(data, &n);
                break;
            case 2:
                showData(data, n);
                break;
            case 3:
                bubbleSort(data, n);
                printf("Bubble Sort Complete!\n");
                showData(data, n); // แสดงผลทันทีหลังเรียงเสร็จ
                break;
            case 4:
                selectionSort(data, n);
                printf("Selection Sort Complete!\n");
                showData(data, n); // แสดงผลทันทีหลังเรียงเสร็จ
                break;
            case 5:
                // หมายเหตุ: Binary Search ข้อมูลต้องเรียงลำดับก่อนเสมอ
                binarySearch(data, n);
                break;
            case 0:
                printf("Exiting program...\n");
                break;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    } while (choice != 0);

    return 0;
}

// 1. ฟังก์ชันรับข้อมูล
void inputData(int arr[], int *n) {
    printf("Enter number of elements: ");
    scanf("%d", n);
    
    for (int i = 0; i < *n; i++) {
        printf("Enter number %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
}

// 2. ฟังก์ชันแสดงข้อมูล
void showData(int arr[], int n) {
    if (n == 0) {
        printf("No data to show.\n");
        return;
    }
    printf("Data: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// 3. ฟังก์ชันเรียงลำดับแบบ Bubble Sort
void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            // ถ้าตัวหน้ามากกว่าตัวหลัง ให้สลับที่
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// 4. ฟังก์ชันเรียงลำดับแบบ Selection Sort
void selectionSort(int arr[], int n) {
    int i, j, min_idx, temp;
    for (i = 0; i < n - 1; i++) {
        min_idx = i;
        // หาค่าที่น้อยที่สุดในส่วนที่เหลือ
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx])
                min_idx = j;
        }
        // สลับค่าที่น้อยที่สุดมาไว้ตำแหน่งปัจจุบัน
        temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
}

// 5. ฟังก์ชันค้นหาแบบ Binary Search
void binarySearch(int arr[], int n) {
    int target, low, high, mid;
    int found = 0; // 0 = ไม่เจอ, 1 = เจอ
    
    // แจ้งเตือน user ก่อน เพราะ Binary Search ต้องใช้ข้อมูลที่เรียงแล้วเท่านั้น
    printf("Note: Data must be sorted before Binary Search.\n");
    printf("Enter number to search: ");
    scanf("%d", &target);
    
    low = 0;
    high = n - 1;
    
    while (low <= high) {
        mid = (low + high) / 2;
        
        if (arr[mid] == target) {
            printf("Found %d at index %d\n", target, mid);
            found = 1;
            break;
        } else if (target > arr[mid]) {
            low = mid + 1; // ตัดฝั่งซ้ายทิ้ง
        } else {
            high = mid - 1; // ตัดฝั่งขวาทิ้ง
        }
    }
    
    if (!found) {
        printf("Number %d not found.\n", target);
    }
}