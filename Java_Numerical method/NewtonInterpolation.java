import java.text.DecimalFormat;

public class NewtonInterpolation {
    
    public static void main(String[] args) {
        // ข้อมูลที่กำหนด
        double[] x = {1.0, 1.3, 1.6, 1.9, 2.2};
        double[] f = {0.7651977, 0.6200860, 0.4554022, 0.2818186, 0.1103623};
        int n = x.length;
        
        // สร้างตารางผลต่างแบ่งย่อย
        double[][] ddTable = new double[n][n];
        
        // กำหนดค่าฟังก์ชัน f(x) เป็นคอลัมน์แรก
        for (int i = 0; i < n; i++) {
            ddTable[i][0] = f[i];
        }
        
        // คำนวณผลต่างแบ่งย่อย
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                ddTable[i][j] = (ddTable[i + 1][j - 1] - ddTable[i][j - 1]) / (x[i + j] - x[i]);
            }
        }
        
        // แสดงตารางผลต่างแบ่งย่อย
        System.out.println("X         f(x)            1^st DD         2^nd DD       3^rd DD       4^th DD:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.1f",  x[i]);
            for (int j = 0; j < n - i; j++) {
                System.out.printf("%-15.7f", ddTable[i][j]);
            }
            System.out.println();
        }
        
        // คำนวณค่า P4(1.5)
        double xVal = 1.5;
        double result = ddTable[0][0];
        double term = 1.0;
        
        for (int j = 1; j < n; j++) {
            term *= (xVal - x[j - 1]);
            result += ddTable[0][j] * term;
        }
        
        // แสดงผลลัพธ์
        DecimalFormat df = new DecimalFormat("0.0000000");
        System.out.println("\nP4(" + xVal + ") = " + df.format(result) + "\n");
    }
}
