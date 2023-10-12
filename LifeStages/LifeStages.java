public class LifeStages {
    public static void main(String[] args) {
        int edad = 25;

        if (edad >= 0 && edad <= 3) {
            System.out.println("BEBE");
        } else if (edad >= 4 && edad <= 14) {
            System.out.println("NINO");
        } else if (edad >= 15 && edad <= 18) {
            System.out.println("JOVEN");
        } else if (edad >= 19 && edad <= 65) {
            System.out.println("ADULTO");
        } else {
            System.out.println("ADULTO 3RA");
        }
    }
}
