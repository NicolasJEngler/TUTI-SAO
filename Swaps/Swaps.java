import java.util.Scanner;

public class MinSwaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (!(A > 0 && A < 1000000)) {
            A = scanner.nextInt();
        }
        
        int B = scanner.nextInt();
        if (!(B > 0 && B < 1000000)) {
            B = scanner.nextInt();
        }

        int C = scanner.nextInt();
        if (!(C > 0 && C < 1000000)) {
            C = scanner.nextInt();
        }

        int[] arr = { A, B, C };

        int swaps = minSwaps(arr);
        System.out.println(swaps);

        scanner.close();
    }

    public static int minSwaps(int[] arr) {
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return swaps;
    }
}