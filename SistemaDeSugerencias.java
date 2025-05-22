import java.util.Scanner;

public class SistemaDeSugerencias {
    public static void sugerirPlanta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("🌱 *** Bienvenido al sistema de sugerencias de plantas *** 🌱");
        System.out.print("""
                Para comenzar, responde las siguientes preguntas sobre tus preferencias y condiciones:

                Según tu disponibilidad (Tiempo, Dinero, Paciencia)
                ¿Qué nivel de mantenimiento prefieres para tu planta? 🌿

                1. Bajo Mantenimiento — Plantas fáciles de cuidar, ideales para principiantes.
                2. Medio Mantenimiento — Requieren cuidados moderados, perfectas para quienes tienen algo de experiencia.
                3. Alto Mantenimiento — Plantas exigentes que necesitan atención especial y tiempo.

                Ingresa el número según tu preferencia: """);
        int opmantenimiento = FuncionesValidaciones.validarOpcionSugerencias(sc);

        int luz = obtenerPreferenciaLuz(sc);
        int riego = obtenerPreferenciaRiego(sc);
        int temperatura = obtenerPreferenciaTemperatura(sc);
        int tamaño = obtenerPreferenciaTamaño(sc);
        int ambiente = obtenerPreferenciaAmbiente(sc);

        switch (opmantenimiento) {
            case 1 -> {
                Cactus cactus = new Cactus();
                Rosas rosas = new Rosas();
                Asteraceae ast = new Asteraceae();

                int puntosCactus = calcularPuntaje(cactus, luz, riego, temperatura, tamaño, ambiente);
                int puntosRosas = calcularPuntaje(rosas, luz, riego, temperatura, tamaño, ambiente);
                int puntosAst = calcularPuntaje(ast, luz, riego, temperatura, tamaño, ambiente);

                System.out.println("\n🌸 Según tus preferencias, te recomendamos esta familia de plantas:");
                if (puntosCactus >= puntosRosas && puntosCactus >= puntosAst) {
                    cactus.mostrarInfoBasica();
                    cactus.mostrarInfoFamilia();
                } else if (puntosRosas >= puntosCactus && puntosRosas >= puntosAst) {
                    rosas.mostrarInfoBasica();
                    rosas.mostrarInfoFamilia();
                } else {
                    ast.mostrarInfoBasica();
                    ast.mostrarInfoFamilia();
                }
            }
            case 2 -> {
                Palmas palmas = new Palmas();
                Labiadas labiadas = new Labiadas();
                Solanaceas solanaceas = new Solanaceas();

                int puntosPalmas = calcularPuntaje(palmas, luz, riego, temperatura, tamaño, ambiente);
                int puntosLabiadas = calcularPuntaje(labiadas, luz, riego, temperatura, tamaño, ambiente);
                int puntosSolanaceas = calcularPuntaje(solanaceas, luz, riego, temperatura, tamaño, ambiente);

                System.out.println("\n🌿 Según tus preferencias, te recomendamos esta familia de plantas:");
                if (puntosPalmas >= puntosLabiadas && puntosPalmas >= puntosSolanaceas) {
                    palmas.mostrarInfoBasica();
                    palmas.mostrarInfoFamilia();
                } else if (puntosLabiadas >= puntosPalmas && puntosLabiadas >= puntosSolanaceas) {
                    labiadas.mostrarInfoBasica();
                    labiadas.mostrarInfoFamilia();
                } else {
                    solanaceas.mostrarInfoBasica();
                    solanaceas.mostrarInfoFamilia();
                }
            }
            case 3 -> {
                Orquidea orquidea = new Orquidea();
                Leguminosas leguminosas = new Leguminosas();
                Araceas araceas = new Araceas();

                int puntosOrquidea = calcularPuntaje(orquidea, luz, riego, temperatura, tamaño, ambiente);
                int puntosLeguminosas = calcularPuntaje(leguminosas, luz, riego, temperatura, tamaño, ambiente);
                int puntosAraceas = calcularPuntaje(araceas, luz, riego, temperatura, tamaño, ambiente);

                System.out.println("\n🌷 Según tus preferencias, te recomendamos esta familia de plantas:");
                if (puntosOrquidea >= puntosAraceas && puntosOrquidea >= puntosLeguminosas) {
                    orquidea.mostrarInfoBasica();
                    orquidea.mostrarInfoFamilia();
                } else if (puntosAraceas >= puntosOrquidea && puntosAraceas >= puntosLeguminosas) {
                    araceas.mostrarInfoBasica();
                    araceas.mostrarInfoFamilia();
                } else {
                    leguminosas.mostrarInfoBasica();
                    leguminosas.mostrarInfoFamilia();
                }
            }
            default -> System.out.println("⚠️ Opción inválida. Por favor, intenta de nuevo.");
        }
    }

    private static int obtenerPreferenciaAmbiente(Scanner sc) {
        System.out.print("""
                🌞 ¿Dónde colocarás tu planta?
                1. Interior — Ideal para ambientes cerrados y controlados.
                2. Exterior — Perfecto para jardines y terrazas.
                3. Ambos — Puede adaptarse a interiores y exteriores.

                Ingresa el número de tu preferencia: """);
        return FuncionesValidaciones.validarOpcionSugerencias(sc);
    }

    private static int obtenerPreferenciaTamaño(Scanner sc) {
        System.out.print("""
                📏 ¿Qué tamaño prefieres para tu planta?
                1. Pequeña — Ideal para espacios reducidos, como escritorios o mesas.
                2. Mediana — Perfecta para rincones y estantes.
                3. Grande — Para espacios amplios, jardines o patios.

                Ingresa el número de tu preferencia: """);
        return FuncionesValidaciones.validarOpcionSugerencias(sc);
    }

    private static int obtenerPreferenciaTemperatura(Scanner sc) {
        System.out.print("""
                🌡️ ¿Cuál es la temperatura del lugar donde estará tu planta?
                1. Fría — Ambientes frescos y con bajas temperaturas.
                2. Templada — Temperaturas moderadas, ni muy frías ni muy cálidas.
                3. Cálida — Lugares con clima cálido o tropical.

                Ingresa el número de tu preferencia: """);
        return FuncionesValidaciones.validarOpcionSugerencias(sc);
    }

    private static int obtenerPreferenciaRiego(Scanner sc) {
        System.out.print("""
                💧 ¿Qué nivel de riego prefieres?
                1. Bajo — Plantas que requieren poca agua y cuidados.
                2. Medio — Requieren riego regular, no muy frecuente ni escaso.
                3. Alto — Plantas que necesitan riego constante y atención.

                Ingresa el número de tu preferencia: """);
        return FuncionesValidaciones.validarOpcionSugerencias(sc);
    }

    private static int obtenerPreferenciaLuz(Scanner sc) {
        System.out.print("""
                ☀️ ¿Cuál es el nivel de luz disponible para tu planta?
                1. Baja — Espacios con sombra o poca luz natural.
                2. Media — Luz indirecta o parcial.
                3. Alta — Luz directa y abundante.

                Ingresa el número de tu preferencia: """);
        return FuncionesValidaciones.validarOpcionSugerencias(sc);
    }

    public static int calcularPuntaje(Plantas planta, int luz, int riego, int temperatura, int tamaño, int ambiente) {
        int puntos = 0;
        if (planta.getNivelLuz() == luz) puntos++;
        if (planta.getNivelRiego() == riego) puntos++;
        if (planta.getTemperatura() == temperatura) puntos++;
        if (planta.getTamaño() == tamaño) puntos++;
        if (planta.getAmbiente() == ambiente) puntos++;
        return puntos;
    }
}
