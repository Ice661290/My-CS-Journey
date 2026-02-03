import javax.swing.JOptionPane;

public class GaussianElimination {
    public static double[] gaussianElimination(double[][] A, double[] b) {
        int n = b.length;
        double[][] Ab = new double[n][n + 1];
        
        // สร้างเมทริกซ์แบบขยาย (Augmented Matrix)
        for (int i = 0; i < n; i++) {
            System.arraycopy(A[i], 0, Ab[i], 0, n);
            Ab[i][n] = b[i];
        }
        
        // Forward elimination
        for (int i = 0; i < n; i++) {
            // Pivoting (เลือกค่าหลักที่ใหญ่ที่สุด)
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(Ab[k][i]) > Math.abs(Ab[maxRow][i])) {
                    maxRow = k;
                }
            }
            double[] temp = Ab[i];
            Ab[i] = Ab[maxRow];
            Ab[maxRow] = temp;
            
            // ทำให้ค่าต่ำกว่าตำแหน่งหลักเป็น 0
            for (int j = i + 1; j < n; j++) {
                double factor = Ab[j][i] / Ab[i][i];
                for (int k = i; k <= n; k++) {
                    Ab[j][k] -= factor * Ab[i][k];
                }
            }
        }
        
        // Back substitution
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += Ab[i][j] * x[j];
            }
            x[i] = (Ab[i][n] - sum) / Ab[i][i];
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        double[][] A = {
            {2, -1, -3},
            {-1, -3, -2},
            {3, -1, -3}
        };
        double[] b = {-1, 12, 0};
        
        double[] solution = gaussianElimination(A, b);
        String message = String.format("Solution:\n x1 = %.6f\n x2 = %.6f\n x3 = %.6f", solution[0], solution[1], solution[2]);
        JOptionPane.showMessageDialog(null, message, "Gaussian Elimination Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
