import java.text.DecimalFormat;

interface MathFunction {
    double f(double x);
}

class SecantFunction implements MathFunction {
    public double f(double x) {
        return 2 * Math.exp(x) + x - 4;
    }
}

public class SecantMethod {
    public static void main(String[] args) {
        double x0 = 0.0;
        double x1 = 1.0;
        double epsilon = 0.001;
        int iteration = 0;

        MathFunction func = new SecantFunction();
        DecimalFormat df = new DecimalFormat("#.######");

       
        System.out.printf("%-4s | %-10s | %-10s | %-10s\n", "n", "x", "f(x)", "Ea");
        System.out.println("-----------------------------------------");

      
        System.out.printf("%-4d | %-10s | %-10s | %-10s\n", iteration, df.format(x0), df.format(func.f(x0)), "-");
        iteration++;
        System.out.printf("%-4d | %-10s | %-10s | %-10s\n", iteration, df.format(x1), df.format(func.f(x1)), "-");

        double x2, error;
        do {
            iteration++;
            double f_x0 = func.f(x0);
            double f_x1 = func.f(x1);

            
            x2 = x1 - (f_x1 * (x1 - x0)) / (f_x1 - f_x0);
            error = Math.abs(x2 - x1);

            
            if (iteration == 5) { 
                System.out.printf("%-4d | %-10s | %-10s | %-10s\n",
                        iteration,
                        df.format(x2),
                        "",
                        df.format(error));
            } else {
                System.out.printf("%-4d | %-10s | %-10s | %-10s\n",
                        iteration,
                        df.format(x2),
                        df.format(func.f(x2)),
                        df.format(error));
            }

            
            x0 = x1;
            x1 = x2;

        } while (error >= epsilon && iteration < 5);

        System.out.println("\nRoot: " + df.format(x2));
    }
}
