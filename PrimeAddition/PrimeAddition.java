import java.util.Scanner;

public class PrimeAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (!isPrime(n)) {
            int[] primes = findSumPrimes(n);
            System.out.println(primes[0] + " " + primes[1]);
        } else {
            System.out.println(n + " 0");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] findSumPrimes(int n) {
        int[] primes = new int[2];
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                primes[0] = Math.max(i, n - i);
                primes[1] = Math.min(i, n - i);
                break;
            }
        }
        return primes;
    }
}
