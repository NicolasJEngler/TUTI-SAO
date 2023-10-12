import java.util.Scanner;

public class AsterisksRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        if (N < 1 || N > 100 || M < 1 || M > 100) {
            System.out.println("Values for N and M should be in range 1-100");
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
