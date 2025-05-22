import java.util.Scanner;

public class FuncionesValidaciones {

    public static int validarnumentero(Scanner num) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            String entrada = sc.nextLine().trim();

            if (entrada.matches("\\d+")) {
                n = Integer.parseInt(entrada);
                if (n >= 1) {
                    return n;
                } else {
                    System.out.println("El número debe ser mayor o igual a 1.");
                }
            } else {
                System.out.println("Entrada no válida. Ingrese un número entero positivo.");
                System.out.print("Intentelo nuevamente:");
            }
        }
    }

    public static String validarNombre(Scanner sc) {
        String nombre;
        while (true) {
            nombre = sc.nextLine().trim();
            if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                break;
            } else {
                System.out.print("Nombre inválido. Solo se permiten letras. Intente de nuevo: ");
            }
        }
        return nombre;
    }
    public static int validarOpcionSugerencias(Scanner sc) {
        int opcion;

        while (true) {
            System.out.print("Ingrese una opción (1 a 3): ");
            String entrada = sc.nextLine().trim();

            if (entrada.matches("\\d+")) {
                opcion = Integer.parseInt(entrada);
                if (opcion >= 1 && opcion <= 3) {
                    return opcion;
                } else {
                    System.out.print("Opción fuera de rango. Ingrese un número entre 1 y 3: ");
                }
            } else {
                System.out.print("Entrada no válida. Ingrese solo números: ");
            }
        }
    }


}
