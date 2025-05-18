import java.util.Scanner;

public class MenuPlantas {

    static InventarioPlantas inventario = new InventarioPlantas();

    public static void iniciarMenu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("***Bienvenido a SmartPLant***");
            System.out.println("""
                Para iniciar seleccione una opcion🌿
                1. Ya tengo una planta
                2. Quiero una nueva planta
                3. Salir
                Ingrese un numero segun la opcion:""");
            Integer opcion = FuncionesValidaciones.validarnumentero(sc);

            switch (opcion) {
                case 1:
                    menuTengoUnaPlanta(sc);
                    break;
                case 2:
                    menuQuieroPlantaNueva(sc);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        sc.close();
    }

    public static void menuTengoUnaPlanta(Scanner sc) {
        boolean salir = false;
        while (!salir) {
            System.out.print("""
                ***Sistema de inventario de Plantas***
                1. Agregar nueva planta (ornamental):
                2. Ver plantas en inventario:
                3. Ver informacion de una planta:
                4. Volver al menú principal:
                Ingrese un numero segun la opcion: """);
            System.out.println();
            Integer opcion = FuncionesValidaciones.validarnumentero(sc);

            switch (opcion) {
                case 1:
                    agregarNuevaPlanta(sc);
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    mostrarInformacionPlanta(sc);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

    public static void agregarNuevaPlanta(Scanner sc) {
        System.out.println("¿Qué planta desea agregar?");
        System.out.println("1. Cactus");
        System.out.println("2. Rosas");
        System.out.println("3. Asteraceae");
        System.out.print("Ingrese el número de la planta: ");
        Integer plantaElegida = FuncionesValidaciones.validarnumentero(sc);

        switch (plantaElegida) {
            case 1:
                inventario.agregarPlanta(new Cactus());
                break;
            case 2:
                inventario.agregarPlanta(new Rosas());
                break;
            case 3:
                inventario.agregarPlanta(new Asteraceae());
                break;
            default:
                System.out.println("Opción inválida para agregar planta.");
        }
    }

    public static void mostrarInventario() {
        inventario.mostrarInventario();
    }

    public static void mostrarInformacionPlanta(Scanner sc) {
        if (inventario.getCantidad() == 0) {
            System.out.println("El inventario está vacío, no hay plantas para mostrar información.\n");
            return;
        }
        mostrarInventario();
        System.out.print("Ingrese el número de la planta para ver detalles: ");
        Integer numPlanta = FuncionesValidaciones.validarnumentero(sc);
        inventario.mostrarInfoPlanta(numPlanta - 1);
    }

    public static void menuQuieroPlantaNueva(Scanner sc) {
        boolean salir = false;
        while (!salir) {
            System.out.print("""
                ***Sistema para nuevas plantas***
                1. Te sugerimos una planta segun tus preferencias
                2. Buscar información de una planta
                3. Volver al menú principal
                Ingrese un numero segun la opcion: """);
            System.out.println();
            Integer opcion = FuncionesValidaciones.validarnumentero(sc);

            switch (opcion) {
                case 1:
                    SistemaDeSugerencias.sugerirPlanta();
                    System.out.print("""
                        ¿Desea volver al menu?
                        1. Si
                        2. No
                        """);
                    Integer menuPrincipal = FuncionesValidaciones.validarnumentero(sc);
                    if (menuPrincipal == 1) {
                        menuTengoUnaPlanta(sc);
                    } else {
                        System.out.println("Finalizando, gracias por usar el sistema...");
                        salir = true;
                    }
                    break;
                case 2:
                    System.out.println("Buscando informacion...");
                    // FALTA
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}





