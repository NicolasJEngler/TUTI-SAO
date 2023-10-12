public class Hiking {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 6;

        if (a < b && b < c) {
            System.out.println("ascenso");
        } else if (a > b && b > c) {
            System.out.println("descenso");
        } else if (a < b && b > c) {
            System.out.println("pico");
        } else if (a > b && b < c) {
            System.out.println("abismo");
        }
    }
}
