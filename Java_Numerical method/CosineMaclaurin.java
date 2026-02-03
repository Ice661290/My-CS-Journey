import javax.swing.JOptionPane;

public class CosineMaclaurin {
    public static void main(String[] args) {
        double x = 0.5; 
        double trueValue = Math.cos(x); 
        double approximateValue = 0; 
        double term; 
        double factorial = 1; 
        double es = 0.05; 
        double ea = 100; 
        int n = 0; 

        StringBuilder result = new StringBuilder(); 
        result.append(String.format("%-5s %-20s %-10s %-10s %-10s\n", 
                                    "Term", "Approximate Value", "Et(%)", "Ea(%)", "|Ea| < Es"));

        do {
            
            term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial;
            approximateValue += term;

            
            double et = Math.abs((trueValue - approximateValue) / trueValue) * 100;
            if (n > 0) {
                ea = Math.abs(term / approximateValue) * 100;
            }

            
            result.append(String.format("  %-5d     %-20.6f       %-10.2f   %-10.2f   %-10s\n",
                    n + 1, approximateValue, et, (n == 0 ? 0 : ea), (ea < es ? "True" : "False")));

            
            n++;
            factorial *= (2 * n) * (2 * n - 1);

        } while (Math.abs(ea) >= es); 

        
        JOptionPane.showMessageDialog(null, result.toString(), "Maclaurin Series for cos(0.5)", JOptionPane.INFORMATION_MESSAGE);
    }
}
