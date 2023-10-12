import java.util.Scanner;

public class IterationProcess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please, enter a value for N that's equal or bigger than 1");
        } else {
            while (n < 100) {
                if (n % 2 == 0) {
                    n += 3;
                } else {
                    n *= 2;
                }
            }

            System.out.println(n);
        }

        scanner.close();
    }
}
