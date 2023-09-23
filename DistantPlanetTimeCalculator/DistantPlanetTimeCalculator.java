import java.util.Scanner;

public class DistantPlanetTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int seconds = scanner.nextInt();

        if (seconds >= 0 && seconds <= 1000000) {
            int days = seconds / (70 * 12 * 50);
            seconds %= (70 * 12 * 50);
            
            int hours = seconds / (70 * 50);
            seconds %= (70 * 50);
            
            int minutes = seconds / 50;
            seconds %= 50;

            System.out.println(days + " " + hours + " " + minutes + " " + seconds);
        }

        scanner.close();
    }
}