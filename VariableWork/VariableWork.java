import java.util.Scanner;

public class VariableWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();

        if (R >= 1 && R <= 20) {
            double result1 = R + 5;
            double result2 = Math.pow(result1, 2);
            double result3 = result2 / (R / 3);
            double result4 = Math.pow(result3, 3);

            System.out.println(R);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
        }

        scanner.close();
    }
}