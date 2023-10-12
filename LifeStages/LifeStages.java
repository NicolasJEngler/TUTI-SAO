public class LifeStages {
    public static void main(String[] args) {
        int edad = 25;

        if (edad >= 0 && edad <= 3) {
            System.out.println("Baby");
        } else if (edad >= 4 && edad <= 14) {
            System.out.println("Children");
        } else if (edad >= 15 && edad <= 18) {
            System.out.println("Young");
        } else if (edad >= 19 && edad <= 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Elder");
        }
    }
}
