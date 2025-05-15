import java.util.Scanner;

public class MenuPlantas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("***Bienvenido a SmartPLant***");
            System.out.println("""
            Para iniciar seleccione una opcion
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
    }

    public static void menuTengoUnaPlanta(Scanner sc) {
        boolean salir = false;
        while (!salir) {
            System.out.print("""
            ***Sistema de inventario de Plantas***
            1. Agregar nueva planta:
            2. Ver plantas en inventario:
            3. Ver informacion de una planta:
            4. Volver al menú principal:
            Ingrese un numero segun la opcion: """);
            System.out.println();
           Integer opcion = FuncionesValidaciones.validarnumentero(sc);

            switch (opcion) {
                case 1:
                    System.out.println("Agregando planta...");
                    // FALTA
                    break;
                case 2:
                    System.out.println("Abriendo inventario...");
                    // FALTA
                    break;
                case 3:
                    System.out.println("Buscando informacion...");
                    //FALTA
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
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
                            1.Si
                            2.No""");
                    Integer menuPrincipal = FuncionesValidaciones.validarnumentero(sc);
                    if (menuPrincipal == 1) {
                        menuTengoUnaPlanta(sc);
                    }else{
                        System.out.println("Finalizando,Gracias por usar el sistema...");
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
