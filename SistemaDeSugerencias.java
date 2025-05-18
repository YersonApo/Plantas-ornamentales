import java.util.Scanner;

public class SistemaDeSugerencias {
    public static void sugerirPlanta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("***Bienvenido al sistema de sugerencias de plantas***");
        System.out.print("""
                Para iniciar responda la siguiente pregunta:
                Segun su disponibilidad (Tiempo,Dinero,Paciencia)
                ¿Que nivel de mantenimiento para una planta prefiere?
                
                1.Bajo Mantenimiento
                2.Medio Mantenimiento
                3.Alto Mantenimiento
                
                Ingresa el numero segun tu preferencia:""");
        System.out.println();
        Integer opmantenimiento = FuncionesValidaciones.validarnumentero(sc);
        switch (opmantenimiento) {
            case 1:
                Cactus cactus = new Cactus();
                Rosas rosas = new Rosas();
                Asteraceae ast = new Asteraceae();

                Integer luz = ObtenerPreferenciaLuz(sc);

                Integer riego = ObtenerPreferenciaRiego(sc);

                Integer temp = ObtenerPreferenciaTemperatura(sc);

                Integer amb = ObtenerPreferenciaMetodo(sc);


                Integer puntosCactus = calcularPuntaje(cactus, luz, riego, temp, amb);
                Integer puntosRosa = calcularPuntaje(rosas, luz, riego, temp, amb);
                Integer puntosAst = calcularPuntaje(ast, luz, riego, temp, amb);



                if (puntosCactus >= puntosRosa && puntosCactus >= puntosAst) {
                    System.out.println("Segun tus preferencias te recomendamos la siguiente familia de plantas:");
                    cactus.mostrarInfoBasica();
                    cactus.mostrarInfoFamilia();
                } else if (puntosRosa >= puntosCactus && puntosRosa >= puntosAst) {
                    System.out.println("Segun tus preferencias te recomendamos la siguiente familia de plantas:");
                    rosas.mostrarInfoBasica();
                    rosas.mostrarInfoFamilia();
                } else {
                    System.out.println("Segun tus preferencias te recomendamos la siguiente familia de plantas:");
                    ast.mostrarInfoBasica();
                    ast.mostrarInfoFamilia();
                }
                break;
            case 2:
                Palmas palmas = new Palmas();
                Labiadas labiadas = new Labiadas();
                Solanaceas solanaceas = new Solanaceas();

                luz = ObtenerPreferenciaLuz(sc);
                riego = ObtenerPreferenciaRiego(sc);
                temp = ObtenerPreferenciaTemperatura(sc);
                amb = ObtenerPreferenciaMetodo(sc);

                Integer puntosPalmas = calcularPuntaje(palmas, luz, riego, temp, amb);
                Integer puntosLabiadas = calcularPuntaje(labiadas, luz, riego, temp, amb);
                Integer puntosSolanaceas= calcularPuntaje(solanaceas, luz, riego, temp, amb);

                if (puntosPalmas >= puntosLabiadas && puntosPalmas >= puntosSolanaceas) {
                    System.out.println("Segun tus preferencias te recomendamos la familia de las:");
                    palmas.mostrarInfoBasica();
                    palmas.mostrarInfoFamilia();
                } else if (puntosLabiadas>=puntosPalmas && puntosLabiadas>=puntosSolanaceas) {
                    System.out.println("Segun tus preferencias te recomendamos la familia de las:");
                    labiadas.mostrarInfoBasica();
                    labiadas.mostrarInfoFamilia();
                }else{
                    System.out.println("Segun tus preferencias te recomendamos la familia de las:");
                    solanaceas.mostrarInfoBasica();
                    solanaceas.mostrarInfoFamilia();
                }
                break;
                case 3:
                    Orquidea orquidea = new Orquidea();
                    Leguminosas leguminosas = new Leguminosas();
                    Araceas araceas = new Araceas();

                    luz = ObtenerPreferenciaLuz(sc);
                    riego = ObtenerPreferenciaRiego(sc);
                    temp = ObtenerPreferenciaTemperatura(sc);
                    amb = ObtenerPreferenciaMetodo(sc);

                    Integer puntosOrquidea= calcularPuntaje(orquidea, luz, riego, temp, amb);
                    Integer puntosLeguminosas= calcularPuntaje(leguminosas, luz, riego, temp, amb);
                    Integer puntosAraceas = calcularPuntaje(araceas, luz, riego, temp, amb);

                    if (puntosOrquidea >= puntosAraceas && puntosOrquidea >= puntosLeguminosas) {
                        System.out.println("Segun tus preferencias te recomendamos la familia de las:");
                        orquidea.mostrarInfoBasica();
                        orquidea.mostrarInfoFamilia();
                    } else if (puntosAraceas>=puntosOrquidea && puntosAraceas>=puntosLeguminosas) {
                        System.out.println("Segun tus preferencias te recomendamos la familia de las:");
                        araceas.mostrarInfoBasica();
                        araceas.mostrarInfoFamilia();
                    }else{
                        System.out.println("Segun tus preferencias te recomendamos la familia de las:");
                        leguminosas.mostrarInfoBasica();
                        leguminosas.mostrarInfoFamilia();
                    }


        }
    }

    private static Integer ObtenerPreferenciaMetodo(Scanner sc) {
        System.out.print("""
                Ambiente:
                1. Interior
                2. Exterior
                3. Ambos
                Prefieres: """);
        Integer amb = FuncionesValidaciones.validarnumentero(sc);
        return amb;
    }

    private static Integer ObtenerPreferenciaTemperatura(Scanner sc) {
        System.out.print("""
                Temperatura:
                1. Fría
                2. Templada
                3. Cálida
                Prefieres: """);
        Integer temp = FuncionesValidaciones.validarnumentero(sc);
        return temp;
    }

    private static Integer ObtenerPreferenciaRiego(Scanner sc) {
        System.out.print("""
                Nivel de riego:
                1. Bajo
                2. Medio
                3. Alto
                Prefieres: """);
        Integer riego = FuncionesValidaciones.validarnumentero(sc);
        return riego;
    }

    private static Integer ObtenerPreferenciaLuz(Scanner sc) {
        System.out.println("Responde las siguientes preguntas:");

        System.out.print("""
                Nivel de luz:
                1. Baja
                2. Media
                3. Alta
                Prefieres: """);
        Integer luz = FuncionesValidaciones.validarnumentero(sc);
        return luz;
    }

    public static int calcularPuntaje(Plantas planta, int luz, int riego, int temp, int amb) {
        int puntos = 0;
        if (planta.getNivelLuz() == luz) puntos++;
        if (planta.getNivelRiego() == riego) puntos++;
        if (planta.getTamaño() == temp) puntos++;
        if (planta.getAmbiente() == amb) puntos++;
        return puntos;
    }
}
