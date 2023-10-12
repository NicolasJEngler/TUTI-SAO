import java.util.Scanner;

public class PeriodicSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for N (0 ≤ N ≤ 10^9): ");
        int n = scanner.nextInt();

        if (n < 0 || n > Math.pow(10, 9)) {
            System.out.println("Please, enter a value for N in the allowed range");
        } else {
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                int termino = (i % 3 == 0) ? 3 : i % 3;

                suma += termino;
            }

            System.out.println(suma);
        }

        scanner.close();
    }
}
