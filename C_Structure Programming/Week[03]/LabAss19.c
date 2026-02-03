/******************************************************************************

**Lab Assignment 19**
เขียนโปรแกรมเพื่อคำนวณผลรวมของตัวเลขตั้งแต่ M ถึง N โดยใช้คำสั่ง for

*******************************************************************************/

#include <stdio.h>

int main() {
    int m, n, i;
    int sum = 0;

    printf("Enter M (Start): ");
    scanf("%d", &m);
    printf("Enter N (End): ");
    scanf("%d", &n);

    // เช็คกรณีผู้ใช้ใส่ค่าสลับกัน (เช่น M มากกว่า N)
    if (m > n) {
        printf("Error: Start value (M) must be less than End value (N).\n");
    } else {
        // วนลูปเริ่มที่ m ไปจบที่ n
        for (i = m; i <= n; i++) {
            sum += i;
        }
        printf("Sum from %d to %d is %d\n", m, n, sum);
    }

    return 0;
}