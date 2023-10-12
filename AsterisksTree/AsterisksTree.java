import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Please, enter a value in the allowed range");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}
