/******************************************************************************

**Lab Assignment 28**
เขียนโปรแกรมเพื่อทำการรับค่าคะแนนสอบกลางภาคและแสดงผลคะแนนทั้งหมด โดยใช้Array

*******************************************************************************/

#include <stdio.h>

int main() {
    int scores[100]; // ประกาศอาร์เรย์เก็บได้สูงสุด 100 คน
    int n, i;

    // 1. รับจำนวนข้อมูล
    printf("Enter number of students: ");
    scanf("%d", &n);

    // 2. วนลูปรับค่าคะแนนเก็บลง Array
    for (i = 0; i < n; i++) {
        printf("Enter score for student %d: ", i + 1);
        scanf("%d", &scores[i]);
    }

    printf("\n--- Display Scores ---\n");

    // 3. วนลูปแสดงผลค่าใน Array
    for (i = 0; i < n; i++) {
        printf("Student %d score: %d\n", i + 1, scores[i]);
    }

    return 0;
}