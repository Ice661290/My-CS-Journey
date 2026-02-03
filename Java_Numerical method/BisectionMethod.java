import java.text.DecimalFormat;

interface MathFunction {
    double f(double x);
}

class CubicFunction implements MathFunction {
    public double f(double x) {
        return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
    }
}

public class BisectionMethod {

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double epsilon = 0.0005;

        
        System.out.printf("%-4s %-10s %-10s %-10s %-10s %-10s\n", "n", "a", "b", "x", "f(x)", "|xn-xn-1|");

        MathFunction func = new CubicFunction();
        double prevX = 0.0;
        double currentX = 0.0;
        int iteration = 0;

        DecimalFormat df = new DecimalFormat("#.######");

        while ((b - a) >= epsilon && iteration < 5) {
            iteration++;
            currentX = (a + b) / 2.0;
            double fCurrent = func.f(currentX);
            double fA = func.f(a);

            
            System.out.printf("%-4d %-10s %-10s %-10s %-10s %-10s\n",
                    iteration,
                    df.format(a),
                    df.format(b),
                    df.format(currentX),
                    df.format(fCurrent),
                    (iteration == 1) ? "-" : df.format(Math.abs(currentX - prevX))
            );

            
            if (fA * fCurrent < 0) {
                b = currentX;
            } else {
                a = currentX;
            }

            prevX = currentX;
        }

        
        System.out.println("\nRoot (after 5 iterations): " + df.format(currentX));
    }
}
