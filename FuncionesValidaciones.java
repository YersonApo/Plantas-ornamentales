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

}
