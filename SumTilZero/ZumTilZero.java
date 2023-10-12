import java.util.Scanner;

public class SumTilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        while (true) {
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println(sum);

        scanner.close();
    }
}
