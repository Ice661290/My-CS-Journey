/******************************************************************************
**Lab Assignment 11**
เขียนโปรแกรมเพื่อคำนวณส่วนลดของการซื้อสินค้าโดยกำหนดให้รับราคาสินค้าที่ซื้อ และ
กำหนดเกณฑ์ส่วนลดดังตารางรือกำไร

------------------------------------------
| จำนวนเงิน | ส่วนลด |
                 
   0-999       0%

 1000-3999     3%

 4000-6999     5%

 7000-9999     7%

 10000 ขึ้นไป   10% 

*******************************************************************************/

#include <stdio.h>

int main() {
    float price, discount, net_price;
    
    printf(" _____________________________________________\n");
    printf("|                                             |\n");
    printf("|           Discount Calculator               |\n");
    printf("|                                             |\n");
    printf(" _____________________________________________\n");
    printf("Enter Price: ");
    scanf("%f", &price);

    if (price >= 10000) {
        discount = price * 0.10;
    } else if (price >= 7000) {
        discount = price * 0.07;
    } else if (price >= 4000) {
        discount = price * 0.05;
    } else if (price >= 1000) {
        discount = price * 0.03;
    } else {
        discount = 0;
    }

    net_price = price - discount;
    printf("Price: %.2f\n", price);
    printf("Discount: %.2f\n", discount);
    printf("Net Price: %.2f\n", net_price);

    return 0;
}