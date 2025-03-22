import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Variable para controlar la continuidad del programa

        while (continuar) { // Bucle que mantiene la calculadora en ejecución
            float numero1 = obtenerNumero(scanner, "Ingresa el primer número: ");
            float numero2 = obtenerNumero(scanner, "Ingresa el segundo número: ");

            System.out.println("Selecciona la operación:");
            System.out.println("a. Sumar");
            System.out.println("b. Restar");
            System.out.println("c. Multiplicar");
            System.out.println("d. Dividir");
            System.out.println("e. Elevar al cuadrado (de ambos números)");

            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case 'b':
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case 'c':
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case 'd':
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + (numero1 / numero2));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                case 'e':
                    System.out.println("Primer número al cuadrado: " + (numero1 * numero1));
                    System.out.println("Segundo número al cuadrado: " + (numero2 * numero2));
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            // Preguntar al usuario si desea continuar
            System.out.println("¿Deseas realizar otra operación? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                continuar = false; // Salir del bucle si el usuario no desea continuar
            }
        }

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }

    public static float obtenerNumero(Scanner scanner, String mensaje) {
        float numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextFloat();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número válido.");
                scanner.next(); // Limpiar el buffer
            }
        }
        return numero;
    }
}
