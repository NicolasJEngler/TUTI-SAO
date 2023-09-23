// Solve for the following equation: (x + x(y + z^2))/((x + pi)(y + pi))
import java.lang.Math;
import java.util.Scanner;

public class EquationSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double pi = Math.PI;
        double result = (x + (x * (y + Math.pow(z, 2)))) / ((x + pi) * (y + pi));

        System.out.println(result);

        scanner.close();
    }
}