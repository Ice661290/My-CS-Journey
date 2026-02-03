/******************************************************************************

**Lab Assignment 27**
เขียนโปรแกรมสูตรคูณ ให้รับค่าตัวเลขและแสดงผลเป็นสูตรคูณ
เช่น 
Enter Number : 5
Output : 
5x1 = 5
5 x 2 = 10
5 x 3 = 15
.....
5 x 12 = 60

*******************************************************************************/

#include <stdio.h>

int main() {
    int num,number,numbers, i;

    printf("Enter Number: ");
    scanf("%d", &num);

    printf("\n--- Using FOR Loop ---\n");
    for (i = 1; i <= 12; i++) {
        printf("%d x %d = %d\n", num, i, num * i);
    }
    
    printf("\nEnter Number: ");
    scanf("%d", &number); 
    
    printf("\n--- Using WHILE Loop ---\n");
    i = 1; // รีเซ็ตค่า i ใหม่
    while (i <= 12) {
        printf("%d x %d = %d\n", number, i, number * i);
        i++;
    }
    
    printf("\nEnter Number: ");
    scanf("%d", &numbers);
    
    printf("\n--- Using DO...WHILE Loop ---\n");
    i = 1; // รีเซ็ตค่า i ใหม่
    do {
        printf("%d x %d = %d\n", numbers, i, numbers * i);
        i++;
    } while (i <= 12);

    return 0;
}