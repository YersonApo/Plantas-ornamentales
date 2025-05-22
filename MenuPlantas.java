import java.util.Scanner;

public class MenuPlantas {

    static InventarioPlantas inventario = new InventarioPlantas();

    public static void iniciarMenu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.print("""
                🌿🌸🌿🌸🌿🌸🌿🌸🌿🌸🌿
             🌼 Bienvenido a SmartPlant 🌼
                🌿🌸🌿🌸🌿🌸🌿🌸🌿🌸🌿

                🍃 Para iniciar, seleccione una opción:

                1. 🌱 Ya tengo una planta
                2. 🌷 Quiero una nueva planta
                3. 🌵 Salir

                🌺 Ingrese un número según la opción: """);

            Integer opcion = FuncionesValidaciones.validarnumentero(sc);
            System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");

            switch (opcion) {
                case 1 -> menuTengoUnaPlanta(sc);
                case 2 -> menuQuieroPlantaNueva(sc);
                case 3 -> {
                    salir = true;
                    System.out.println("""
                        🌸 Gracias por usar SmartPlant
                        ¡Hasta luego! 🌼
                        """);
                }
                default -> System.out.println("❌ Opción inválida, intente de nuevo.");
            }
        }

        sc.close();
    }

    public static void menuTengoUnaPlanta(Scanner sc) {
        boolean salir = false;
        while (!salir) {
            System.out.print("""
                🌿🌻🌿 Sistema de Inventario de Plantas 🌿🌻🌿

                   1. 🪴 Agregar nueva planta ornamental
                   2. 📋 Ver plantas en inventario
                   3. 🔍 Ver información de una planta
                   4. 🗑️ Eliminar una planta del inventario
                   5. 🔙 Volver al menú principal
              
              🍀 Ingrese un número según la opción: """);

            Integer opcion = FuncionesValidaciones.validarnumentero(sc);
            System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");

            switch (opcion) {
                case 1 -> agregarNuevaPlanta(sc);
                case 2 -> mostrarInventario();
                case 3 -> mostrarInformacionPlanta(sc);
                case 4 -> eliminarPlantaDelInventario(sc);
                case 5 -> salir = true;
                default -> System.out.println("❌ Opción inválida, intente de nuevo.");
            }
        }
    }

    public static void agregarNuevaPlanta(Scanner sc) {
        System.out.print("""
    🌼 Ingrese la familia de la planta que desea agregar:

    1. 🌵 Cactus
    2. 🌹 Rosas
    3. 🌻 Asteraceae

    4. 🌴 Palmas
    5. 🍅 Solanáceas
    6. 🌿 Labiadas

    7. 🌱 Leguminosas
    8. 🦋 Orquídeas
    9. 🍃 Aráceas

    🌺 Ingrese el número de la planta: """);

        Integer plantaElegida = FuncionesValidaciones.validarnumentero(sc);
        if (plantaElegida < 1 || plantaElegida > 9) {
            System.out.println("❌ Opción inválida para agregar planta.");
            return;
        }

        Plantas nuevaPlanta;

        switch (plantaElegida) {
            case 1 -> nuevaPlanta = new Cactus();
            case 2 -> nuevaPlanta = new Rosas();
            case 3 -> nuevaPlanta = new Asteraceae();
            case 4 -> nuevaPlanta = new Palmas();
            case 5 -> nuevaPlanta = new Solanaceas();
            case 6 -> nuevaPlanta = new Labiadas();
            case 7 -> nuevaPlanta = new Leguminosas();
            case 8 -> nuevaPlanta = new Orquidea();
            case 9 -> nuevaPlanta = new Araceas();
            default -> {
                System.out.println("❌ Opción inválida para agregar planta.");
                return;
            }
        }

        System.out.print("""
        🌼 ¿Desea darle un nombre personalizado a la planta?
        1. ✅ Sí
        2. ❌ No
        👉 Ingrese su opción: """);

        Integer opcionNombre = FuncionesValidaciones.validarnumentero(sc);
        if (opcionNombre == 1) {
            System.out.print("📝 Ingrese el nombre personalizado: ");
            String nombrePer = sc.nextLine().trim();
            if (!nombrePer.isEmpty()) {
                nuevaPlanta.setNombre(nombrePer);
            }
        } else if (opcionNombre == 2) {
            System.out.println("🌿 Se conservará el nombre por defecto.");
        }

        inventario.agregarPlanta(nuevaPlanta);
        System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");
    }



    public static void mostrarInventario() {
        inventario.mostrarInventario();
        System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");
    }

    public static void mostrarInformacionPlanta(Scanner sc) {
        if (inventario.getCantidad() == 0) {
            System.out.println("""
                🌵 El inventario está vacío.
                No hay plantas para mostrar información.
                """);
            return;
        }

        mostrarInventario();
        System.out.print("""
            🔢 Ingrese el número de la planta para ver detalles: """);

        Integer numPlanta = FuncionesValidaciones.validarnumentero(sc);
        System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");
        inventario.mostrarInfoPlanta(numPlanta - 1);
    }
    public static void eliminarPlantaDelInventario(Scanner sc) {
        if (inventario.getCantidad() == 0) {
            System.out.println("🪴 El inventario está vacío. No hay plantas para eliminar.");
            return;
        }

        mostrarInventario();
        System.out.print("🔢 Ingrese el número de la planta que desea eliminar: ");
        Integer indice = FuncionesValidaciones.validarnumentero(sc);
        inventario.eliminarPlanta(indice - 1);
        System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");
    }


    public static void menuQuieroPlantaNueva(Scanner sc) {
        boolean salir = false;
        while (!salir) {
            System.out.print("""
                🌿🌷🌿 Sistema para Nuevas Plantas 🌿🌷🌿

                1. 🌼 Te sugerimos una planta según tus preferencias
                2. 🔍 Buscar información de una planta
                3. 🔙 Volver al menú principal

                🍃 Ingrese un número según la opción: """);

            Integer opcion = FuncionesValidaciones.validarnumentero(sc);
            System.out.println("🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃🍃");

            switch (opcion) {
                case 1 -> SistemaDeSugerencias.sugerirPlanta();

                case 2 -> {
                    System.out.println("🔎 Buscando información...");
                    buscarInformacionPorTipo(sc);
                }

                case 3 -> salir = true;
                default -> System.out.println("❌ Opción inválida, intente de nuevo.");
            }
        }
    }
    public static void buscarInformacionPorTipo(Scanner sc) {
        while (true) {
            System.out.print("""
        🌿 ¿Qué tipo de mantenimiento desea consultar?

        1. 🟢 Bajo mantenimiento
        2. 🟡 Mantenimiento medio
        3. 🔴 Alto mantenimiento
        4. 📘 Ver detalles
        5. 🔙 Volver

        🔍 Ingrese la opcion que desea consultar: """);

            Integer tipoMantenimiento = FuncionesValidaciones.validarnumentero(sc);
            System.out.println();

            switch (tipoMantenimiento) {
                case 1 -> {
                    System.out.print("""
                🟢 Plantas de bajo mantenimiento:

                1. 🌵 Cactus
                2. 🌹 Rosas
                3. 🌻 Asteraceae

                🔍 Ingrese el número de la planta: """);

                    Integer opcion = FuncionesValidaciones.validarnumentero(sc);
                    switch (opcion) {
                        case 1 -> {
                            Cactus cactus = new Cactus();
                            cactus.mostrarInfoBasica();
                            cactus.mostrarInfoFamilia();
                        }
                        case 2 -> {
                            Rosas rosas = new Rosas();
                            rosas.mostrarInfoBasica();
                            rosas.mostrarInfoFamilia();
                        }
                        case 3 -> {
                            Asteraceae asteraceae = new Asteraceae();
                            asteraceae.mostrarInfoBasica();
                            asteraceae.mostrarInfoFamilia();
                        }
                        default -> System.out.println("❌ Opción inválida.");
                    }
                }
                case 2 -> {
                    System.out.print("""
                🟡 Plantas de mantenimiento medio:

                1. 🌴 Palmas
                2. 🍅 Solanáceas
                3. 🌿 Labiadas

                🔍 Ingrese el número de la planta: """);

                    Integer opcion = FuncionesValidaciones.validarnumentero(sc);
                    switch (opcion) {
                        case 1 -> {
                            Palmas palmas = new Palmas();
                            palmas.mostrarInfoBasica();
                            palmas.mostrarInfoFamilia();
                        }
                        case 2 -> {
                            Solanaceas solanaceas = new Solanaceas();
                            solanaceas.mostrarInfoBasica();
                            solanaceas.mostrarInfoFamilia();
                        }
                        case 3 -> {
                            Labiadas labiadas = new Labiadas();
                            labiadas.mostrarInfoBasica();
                            labiadas.mostrarInfoFamilia();
                        }
                        default -> System.out.println("❌ Opción inválida.");
                    }
                }
                case 3 -> {
                    System.out.print("""
                🔴 Plantas de alto mantenimiento:

                1. 🌱 Leguminosas
                2. 🦋 Orquídeas
                3. 🍃 Aráceas

                🔍 Ingrese el número de la planta: """);

                    Integer opcion = FuncionesValidaciones.validarnumentero(sc);
                    switch (opcion) {
                        case 1 -> {
                            Leguminosas leguminosas = new Leguminosas();
                            leguminosas.mostrarInfoBasica();
                            leguminosas.mostrarInfoFamilia();
                        }
                        case 2 -> {
                            Orquidea orquidea = new Orquidea();
                            orquidea.mostrarInfoBasica();
                            orquidea.mostrarInfoFamilia();
                        }
                        case 3 -> {
                            Araceas araceas = new Araceas();
                            araceas.mostrarInfoBasica();
                            araceas.mostrarInfoFamilia();
                        }
                        default -> System.out.println("❌ Opción inválida.");
                    }
                }
                case 4 -> {
                    System.out.println("📘 Cuidados generales por tipo de mantenimiento:");

                    System.out.println("🟢 Bajo mantenimiento:");
                    new Cactus().mostrarCuidadosGenerales();

                    System.out.println("\n🟡 Mantenimiento medio:");
                    new Palmas().mostrarCuidadosGenerales();

                    System.out.println("\n🔴 Alto mantenimiento:");
                    new Leguminosas().mostrarCuidadosGenerales();
                }
                case 5 -> {
                    System.out.println("🔙 Volviendo...");
                    return;
                }
                default -> System.out.println("❌ Opción inválida.");
            }
        }
    }



}
