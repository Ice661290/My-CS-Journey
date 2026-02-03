import javax.swing.JOptionPane;

public class CompositeTrapezoidalRule {
    public static void main(String[] args) {
        // Define the integration limits
        double a = 0;             // Lower limit
        double b = 3*Math.PI/8;   // Upper limit (3π/8)
        int n = 8;                // Number of subdivisions
        
        // Calculate the width of each subinterval
        double h = (b - a) / n;
        
        // Calculate the sum of the function values at the interior points
        double sum = 0;
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += Math.tan(x);
        }
        
        // Apply the Composite Trapezoidal rule formula
        // ∫f(x)dx ≈ (h/2) * [f(a) + 2*sum + f(b)]
        double result = (h / 2) * (Math.tan(a) + 2 * sum + Math.tan(b));
        
        double re = Math.tan(a);
        double rel = Math.tan(b);
        
        // The exact value for integral of tan(x) from 0 to 3π/8
        //double exactValue = -Math.log(Math.cos(3*Math.PI/8));
        //double absoluteError = Math.abs(result - exactValue);
        
        // Prepare the output message
        StringBuilder message = new StringBuilder();
        message.append("Approximation of ∫tan(x)dx from 0 to 3π/8 using Composite Trapezoidal Rule:\n");
        message.append("Number of subdivisions (n): " + n + "\n");
        message.append("f(a): " + re + "\n");
        message.append("f(b): " + rel + "\n");
        message.append("Sum of f(xj): " + sum + "\n");
        message.append("Result: " + result + "\n");
        //message.append("Exact value (for comparison): " + exactValue + "\n");
        //message.append("Absolute error: " + absoluteError);
        
        // Display the results using JOptionPane
        JOptionPane.showMessageDialog(null, message.toString(), 
                                     "Composite Trapezoidal Rule Results", 
                                     JOptionPane.INFORMATION_MESSAGE);
    }
}