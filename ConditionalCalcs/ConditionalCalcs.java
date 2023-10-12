public class ConditionalCalcs {
    public static void main(String[] args) {
        int N = 7;
        int count = 0;

        if (N % 2 == 0) {
          N /= 2;
          count++;
        } else {
          N += 1;
          count++;
        }

        if (N >= 100) {
          N /= 100;
          count++;
        } else if (N >= 10) {
          N /= 10;
          count++;
        }

        if (N % 3 == 0) {
          N -= 1;
          count++;
        }

        System.out.println(N + " " + count);
    }
}
