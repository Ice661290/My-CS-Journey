/******************************************************************************
**Lab Assignment 10**
เขียนโปรแกรมคำนวณกำไรขาดทุนจากการขายทอง โดยกำหนดให้รับข้อมูลราคาซื้อ
และราคาขายทองจากนั้นทำการประมวลผลเพื่อแสดงว่าเท่าทุน ขาดทุน หรือกำไร

*******************************************************************************/

#include <stdio.h>

int main() {
    int buy, sale;
    
    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|      Profit & Loss Calculator               |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter Buy Price: ");
    scanf("%d", &buy);
    printf("Enter Sale Price: ");
    scanf("%d", &sale);

    if (sale > buy) {
        printf("Profit = %d\n", sale - buy);
    } else if (sale < buy) {
        printf("Loss = %d\n", buy - sale);
    } else {
        printf("Break even\n");
    }
    return 0;
}