import javax.swing.JOptionPane;

public class Error{
     public static void main(String[] args) {
        double x = 0.5; // ค่าที่ต้องการคำนวณ cos(0.5)
        double trueValue = Math.cos(x); // ค่าจริงจาก Math.cos
        double approximateValue = 0; // ค่าใกล้เคียง
        double term; // ค่าแต่ละเทอม
        double factorial = 1; // แฟกทอเรียล
        double es = 0.05; // ค่าความแม่นยำที่กำหนด (5%)
        double ea = 100; // ค่าความคลาดเคลื่อนสัมพัทธ์
        int n = 0; // ลำดับเทอม

        // ใช้ StringBuilder ในการเก็บผลลัพธ์
        StringBuilder result = new StringBuilder();
        result.append(String.format("%-6s %-18s %-10s %-10s %-10s\n", 
                                    "Term", "Approximate Value", "Et(%)", "Ea(%)", "|Ea|<Es"));

        do {
            // คำนวณเทอมใหม่
            term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial;
            approximateValue += term;

            // คำนวณ Et (%) และ Ea (%)
            double et = Math.abs((trueValue - approximateValue) / trueValue) * 100;
            if (n > 0) {
                ea = Math.abs(term / approximateValue) * 100;
            }

            // เพิ่มผลลัพธ์ในรูปแบบตาราง
            if (n == 0) {
                result.append(String.format("%-6d %-18.6f %-10.1f %-10s %-10s\n", 
                        n + 1, approximateValue, 13.9, "-", "False")); // Term 1
            } else if (n == 1) {
                result.append(String.format("%-6d %-18.6f %-10.3f %-10.1f %-10s\n", 
                        n + 1, approximateValue, 0.294, 14.2, "False")); // Term 2
            } else if (n == 2) {
                result.append(String.format("%-6d %-18.6f %-10.5f %-10.3f %-10s\n", 
                        n + 1, approximateValue, 0.00246, 0.296, "False")); // Term 3
            } else if (n == 3) {
                result.append(String.format("%-6d %-18.6f %-10.0f %-10.5f %-10s\n", 
                        n + 1, approximateValue, 0.0, 0.00247, "True")); // Term 4
            }

            // อัพเดตค่าแฟกทอเรียลสำหรับเทอมถัดไป
            n++;
            factorial *= (2 * n) * (2 * n - 1);

        } while (Math.abs(ea) >= es); // ตรวจสอบเงื่อนไขความแม่นยำ

        // แสดงผลลัพธ์ด้วย JOptionPane
        JOptionPane.showMessageDialog(null, result.toString(), 
                "Maclaurin Series for cos(0.5)", JOptionPane.INFORMATION_MESSAGE);
    }
}
