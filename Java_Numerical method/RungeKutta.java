import javax.swing.JOptionPane;

public class RungeKutta {
    
    // สมการเชิงอนุพันธ์ y' = f(x,y) = 4e^(0.8x) - 0.5y
    public static double f(double x, double y) {
        return 4 * Math.exp(0.8 * x) - 0.5 * y;
    }
    
    // วิธีรุงเง-คุตตา อันดับ 4
    public static double rungeKutta4(double x0, double y0, double h, double xTarget) {
        double y = y0;
        double x = x0;
        
        // แสดงข้อความเริ่มต้น
        String title = "Runge-Kutta Method of Order 4";
        JOptionPane.showMessageDialog(null, 
            "Calculation using the Fourth-Order Runge-Kutta Method\n" +
            "----------------------------------\n" +
            String.format("Start: x = %.6f, y = %.6f", x, y),
            title, JOptionPane.INFORMATION_MESSAGE);
        
        int step = 0;
        
        while (x < xTarget) {
            step++;
            
            // คำนวณค่า k1, k2, k3, k4
            double k1 = h * f(x, y);
            double k2 = h * f(x + 0.5 * h, y + 0.5 * k1);
            double k3 = h * f(x + 0.5 * h, y + 0.5 * k2);
            double k4 = h * f(x + h, y + k3);
            
            // คำนวณค่า y ใหม่
            double yNew = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            
            // สร้างข้อความสำหรับแสดงในแต่ละขั้นตอน
            StringBuilder stepInfo = new StringBuilder();
            stepInfo.append(String.format("Step %d:\n\n", step));
            stepInfo.append(String.format("x = %.6f\n\n", x));
            stepInfo.append(String.format("k1 = h × f(x, y) = %.6f × f(%.6f, %.6f) = %.6f\n\n", h, x, y, k1));
            stepInfo.append(String.format("k2 = h × f(x + h/2, y + k1/2) = %.6f × f(%.6f, %.6f) = %.6f\n\n", 
                        h, x + 0.5 * h, y + 0.5 * k1, k2));
            stepInfo.append(String.format("k3 = h × f(x + h/2, y + k2/2) = %.6f × f(%.6f, %.6f) = %.6f\n\n", 
                        h, x + 0.5 * h, y + 0.5 * k2, k3));
            stepInfo.append(String.format("k4 = h × f(x + h, y + k3) = %.6f × f(%.6f, %.6f) = %.6f\n\n", 
                        h, x + h, y + k3, k4));
            stepInfo.append(String.format("New y = y + (k1 + 2k2 + 2k3 + k4)/6 = %.6f + (%.6f + 2×%.6f + 2×%.6f + %.6f)/6 = %.6f", 
                        y, k1, k2, k3, k4, yNew));
            
            // แสดงข้อความของแต่ละขั้นตอน
            JOptionPane.showMessageDialog(null, stepInfo.toString(), 
                title + " - Step " + step, JOptionPane.INFORMATION_MESSAGE);
            
            // อัพเดตค่า x และ y
            x += h;
            y = yNew;
        }
        
        // แสดงผลลัพธ์สุดท้าย
        String finalMessage = String.format("Final Result: y(%.6f) = %.6f", x, y);
        JOptionPane.showMessageDialog(null, finalMessage, 
            title + " - Final Result", JOptionPane.INFORMATION_MESSAGE);
        
        return y;
    }
    
    public static void main(String[] args) {
        double x0 = 0.0;     // ค่าเริ่มต้นของ x
        double y0 = 2.0;     // ค่าเริ่มต้นของ y
        double h = 0.1;      // ขนาดของช่วงการคำนวณ
        double xTarget = 0.5; // ต้องการหาค่า y ที่ x = 0.5
        
        // เรียกใช้วิธีรุงเง-คุตตา
        rungeKutta4(x0, y0, h, xTarget);
    }
}