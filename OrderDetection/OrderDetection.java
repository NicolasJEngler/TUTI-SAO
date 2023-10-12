public class OrderDetection {
    public static void main(String[] args) {
        // Definir los enteros A, B y C dentro del rango especificado
        int A = 150;
        int B = 200;
        int C = 250;

        // Verificar el tipo de secuencia
        if (A == B && B == C) {
            System.out.println("I");  // Todos los números son iguales
        } else if (A <= B && B <= C) {
            System.out.println("C");  // Creciente débil
        } else if (A >= B && B >= C) {
            System.out.println("D");  // Decreciente débil
        } else {
            System.out.println("X");  // No existe un orden aparente
        }
    }
}