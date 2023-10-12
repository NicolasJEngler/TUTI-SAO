public class OrderDetection {
    public static void main(String[] args) {
        int A = 150;
        int B = 200;
        int C = 250;

        if (A == B && B == C) {
            System.out.println("I");
        } else if (A <= B && B <= C) {
            System.out.println("C");
        } else if (A >= B && B >= C) {
            System.out.println("D");
        } else {
            System.out.println("X");
        }
    }
}