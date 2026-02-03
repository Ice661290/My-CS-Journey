import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Least_squareRegressionl {
    public static void main(String[] args) {
        
        double[] x = {0, 0.25, 0.5, 0.75, 1};
        double[] y = {1, 1.2840, 1.6487, 2.1170, 2.7183};


        int n = x.length;
        
        
        double sumX = 0, sumY = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0, sumXY = 0, sumX2Y = 0;
        
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumX2 += x[i] * x[i];
            sumX3 += x[i] * x[i] * x[i];
            sumX4 += x[i] * x[i] * x[i] * x[i];
            sumXY += x[i] * y[i];
            sumX2Y += x[i] * x[i] * y[i];
        }
        
        
        
        double[][] coeffMatrix = {
            {n, sumX, sumX2},
            {sumX, sumX2, sumX3},
            {sumX2, sumX3, sumX4}
        };
        
        double[] constants = {sumY, sumXY, sumX2Y};
        
        
        double[] coefficients = gaussianElimination(coeffMatrix, constants);
        
        
        double a0 = coefficients[0];
        double a1 = coefficients[1];
        double a2 = coefficients[2];
        
        DecimalFormat df = new DecimalFormat("0.000000");
        
        
        
        StringBuilder resultBuilder = new StringBuilder();
        

        resultBuilder.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
        
        resultBuilder.append(String.format("%-5s         %-7s       %-7s      %-7s      %-7s      %-7s       %-7s       %-7s      %-7s        %-7s\n", 
                          "x",      "y",   "xy",   "x^2",   "x^2y",   "x^3",   "x^4",   "P(x)",   "y-P(x)",             "(y-P(x))^2"));
        resultBuilder.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
        
        double sumError2 = 0;
        
        
        for (int i = 0; i < n; i++) {
            double predY = a0 + a1 * x[i] + a2 * x[i] * x[i]; 
            double error = y[i] - predY;
            double error2 = error * error;
            sumError2 += error2;
            
            resultBuilder.append(String.format("%.2f    %.4f    %.4f    %.4f      %.4f      %.4f      %.4f    %.6f    %.6f        %.6f\n", 
                             x[i], y[i], x[i]*y[i], x[i]*x[i], x[i]*x[i]*y[i], 
                             x[i]*x[i]*x[i], x[i]*x[i]*x[i]*x[i], 
                             predY, error, error2));
        }
        
        resultBuilder.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
        

        resultBuilder.append("Least-Square regression equation: y = ")
                   .append(df.format(a0)).append(" + ")
                   .append(df.format(a1)).append("x + ")
                   .append(df.format(a2)).append("x^2\n\n");
        resultBuilder.append("Sum of squared errors: ").append(df.format(sumError2));
        
        
        JOptionPane.showMessageDialog(null, resultBuilder.toString(), 
                                     "Least-Square Regression Results", 
                                     JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public static double[] gaussianElimination(double[][] A, double[] b) {
        int n = b.length;
        
        
        double[][] augMatrix = new double[n][n+1];
        for (int i = 0; i < n; i++) {
            System.arraycopy(A[i], 0, augMatrix[i], 0, n);
            augMatrix[i][n] = b[i];
        }
        
        
        for (int k = 0; k < n; k++) {
            
            int maxRow = k;
            for (int i = k + 1; i < n; i++) {
                if (Math.abs(augMatrix[i][k]) > Math.abs(augMatrix[maxRow][k])) {
                    maxRow = i;
                }
            }
            
            
            double[] temp = augMatrix[k];
            augMatrix[k] = augMatrix[maxRow];
            augMatrix[maxRow] = temp;
            
            
            for (int i = k + 1; i < n; i++) {
                double factor = augMatrix[i][k] / augMatrix[k][k];
                for (int j = k; j <= n; j++) {
                    augMatrix[i][j] -= factor * augMatrix[k][j];
                }
            }
        }
        
        
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += augMatrix[i][j] * x[j];
            }
            x[i] = (augMatrix[i][n] - sum) / augMatrix[i][i];
        }
        
        return x;
    }
}