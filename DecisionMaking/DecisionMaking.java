public class DecisionMaking {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;

        if (A + B == 5) {
            B += 3;
            System.out.println(2 * A + B);
        } else {
            A -= 1;
            if ((7 * A + B) % 2 == 0) {
                System.out.println(A - B);
            } else {
                System.out.println(A * B);
            }
        }
    }
}
