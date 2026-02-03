import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class GaussSeidel {
    public static void main(String[] args) {
        // Initial values
        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        
        // Previous values for error calculation
        double x1Prev, x2Prev, x3Prev;
        
        // Error threshold
        double errorThreshold = 0.001 / 100; // 0.001%
        
        // Maximum number of iterations as a safety measure
        int maxIterations = 100;
        
        // Current iteration count
        int iteration = 0;
        
        // Maximum relative error in current iteration
        double maxError;
        
        StringBuilder result = new StringBuilder();
        result.append("Gauss-Seidel Iteration Method\n\n");
        result.append("Iteration 0: x₁ = 0.000, x₂ = 0.000, x₃ = 0.000\n");
        
        do {
            // Save previous values
            x1Prev = x1;
            x2Prev = x2;
            x3Prev = x3;
            
            // Gauss-Seidel formulas (note we're using the updated values immediately)
            x1 = (1 + x2 - x3) / 3;
            x2 = (-3 * x1 - 2 * x3) / 6;
            x3 = (4 - 3 * x1 - 3 * x2) / 7;
            
            // Calculate relative approximate errors
            double error1 = Math.abs((x1 - x1Prev) / x1);
            double error2 = Math.abs((x2 - x2Prev) / x2);
            double error3 = Math.abs((x3 - x3Prev) / x3);
            
            // Find maximum error
            maxError = Math.max(error1, Math.max(error2, error3));
            
            // Increment iteration counter
            iteration++;
            
            // Format the output with three decimal places
            DecimalFormat df = new DecimalFormat("0.000");
            result.append("Iteration ").append(iteration).append(": ");
            result.append("x₁ = ").append(df.format(x1)).append(", ");
            result.append("x₂ = ").append(df.format(x2)).append(", ");
            result.append("x₃ = ").append(df.format(x3)).append("\n");
            
        } while (maxError > errorThreshold && iteration < maxIterations);
        
        // Format final results for output in dialog box
        StringBuilder finalOutput = new StringBuilder();
        finalOutput.append("Output:\n");
        finalOutput.append("Iteration ").append(iteration).append(": \n");;
        finalOutput.append("X₁ = ").append(new DecimalFormat("0.###").format(x1)).append("\n");
        finalOutput.append("X₂ = ").append(new DecimalFormat("0.###").format(x2)).append("\n");
        finalOutput.append("X₃ = ").append(new DecimalFormat("0.###").format(x3)).append("\n");
        
        // Show detailed iterations in console
        System.out.println(result.toString());
        
        // Show final result in JOptionPane
        JOptionPane.showMessageDialog(null, finalOutput.toString(), 
                "Gauss-Seidel Solution", JOptionPane.INFORMATION_MESSAGE);
    }
}