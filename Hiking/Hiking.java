public class Hiking {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 6;

        if (a < b && b < c) {
            System.out.println("up");
        } else if (a > b && b > c) {
            System.out.println("down");
        } else if (a < b && b > c) {
            System.out.println("peak");
        } else if (a > b && b < c) {
            System.out.println("abyss");
        }
    }
}
