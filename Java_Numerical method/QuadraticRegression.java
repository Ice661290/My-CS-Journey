import javax.swing.JOptionPane;

public class QuadraticRegression {
    public static void main(String[] args) {
        double[] x = {0, 0.25, 0.5, 0.75, 1};
        double[] y = {1, 12840, 16487, 21170, 2.7183};
        
        int n = x.length;
        double sumX = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0;
        double sumY = 0, sumXY = 0, sumX2Y = 0;
        
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumX2 += Math.pow(x[i], 2);
            sumX3 += Math.pow(x[i], 3);
            sumX4 += Math.pow(x[i], 4);
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2Y += Math.pow(x[i], 2) * y[i];
        }
        
        double[][] A = {
            {n, sumX, sumX2},
            {sumX, sumX2, sumX3},
            {sumX2, sumX3, sumX4}
        };
        
        double[] B = {sumY, sumXY, sumX2Y};
        
        double[] coefficients = solveSystem(A, B);
        
        String equation = "Quadratic Regression Equation: y = " + coefficients[2] + "x^2 + " + coefficients[1] + "x + " + coefficients[0];
        JOptionPane.showMessageDialog(null, equation, "Regression Result", JOptionPane.INFORMATION_MESSAGE);
        
        StringBuilder table = new StringBuilder("Table of values:\n");
        table.append("x\t y\t x^2\t x^3\t x^4\t P(x)\t |y-P(x)|\t |y-P(x)|^2\n");
        for (int i = 0; i < n; i++) {
            double Px = coefficients[2] * Math.pow(x[i], 2) + coefficients[1] * x[i] + coefficients[0];
            double diff = Math.abs(y[i] - Px);
            double diffSquared = Math.pow(diff, 2);
            table.append(x[i]).append("\t ").append(y[i]).append("\t ").append(Math.pow(x[i], 2)).append("\t ")
                 .append(Math.pow(x[i], 3)).append("\t ").append(Math.pow(x[i], 4)).append("\t ")
                 .append(Px).append("\t ").append(diff).append("\t ").append(diffSquared).append("\n");
        }
        JOptionPane.showMessageDialog(null, table.toString(), "Table of Values", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static double[] solveSystem(double[][] A, double[] B) {
        int n = B.length;
        for (int p = 0; p < n; p++) {
            int max = p;
            for (int i = p + 1; i < n; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }
            double[] temp = A[p]; A[p] = A[max]; A[max] = temp;
            double t = B[p]; B[p] = B[max]; B[max] = t;
            
            for (int i = p + 1; i < n; i++) {
                double alpha = A[i][p] / A[p][p];
                B[i] -= alpha * B[p];
                for (int j = p; j < n; j++) {
                    A[i][j] -= alpha * A[p][j];
                }
            }
        }
        
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (B[i] - sum) / A[i][i];
        }
        return x;
    }
}