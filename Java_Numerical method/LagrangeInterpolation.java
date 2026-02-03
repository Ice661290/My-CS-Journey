import javax.swing.JOptionPane;

public class LagrangeInterpolation {
    public static void main(String[] args) {
        // กำหนดค่าของ x และ y
        double[] x = {0, 1, 3, 4, 7};
        double[] y = {1, 3, 49, 129, 813};
        
        // รับค่า Input X จากผู้ใช้
        String input = JOptionPane.showInputDialog("Input X:");
        double xValue = Double.parseDouble(input);
        
        // คำนวณค่า f(x) ด้วย Lagrange Interpolation
        double result = lagrangeInterpolation(x, y, xValue);
        
        // แสดงผลลัพธ์
        JOptionPane.showMessageDialog(null, "Output f4(" + xValue + ") is " + result);
    }
    
    public static double lagrangeInterpolation(double[] x, double[] y, double xValue) {
        double result = 0.0;
        int n = x.length;
        
        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    term *= (xValue - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        
        return result;
    }
}
