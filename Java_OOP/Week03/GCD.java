import javax.swing.JOptionPane;

class GCD
{

  public static void main(String[] args)
   {
       JOptionPane.showMessageDialog(null,"GCD1 = " + gcd1(5,10)+ "\nGCD2 = " + gcd2(5,10));
   } 

// วิธีที่ 1: Brute Force (วนลูปตรวจสอบทุกตัวเลข)
public static int gcd1 (int m, int n){
  int last = Math.min(m,n);
  int gcd=1; // ควรเริ่มที่ 1 เสมอ (ห.ร.ม. ต่ำสุดคือ 1)
  int i=1;

  while (i<=last) {
     if(m % i == 0 && n % i==0){
       gcd=i;
     }
      i++;
}
return gcd;
}

// วิธีที่ 2: Euclidean Algorithm (ยูคลิด) 
// // วิธีนี้ทำงานโดยการหาเศษเหลือซ้ำๆ จนกว่าเศษจะเป็น 0 ซึ่งเร็วกว่ามาก
    public static int gcd2(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd2(n, m % n);
    }
}