import java.util.Scanner;

public class MinMaxAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of numbers: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please, enter a valid amount of numbers");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        System.out.println("Enter all numbers separated by a space:");

        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
            min = Math.min(min, numero);
            max = Math.max(max, numero);
            sum += numero;
        }

        double average = (double) sum / n;

        System.out.printf(min + " " + max + " " + average);

        scanner.close();
    }
}
