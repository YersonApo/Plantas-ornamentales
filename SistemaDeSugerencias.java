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

                System.out.println("Responde las siguientes preguntas:");

                System.out.print("""
                        Nivel de luz:
                        1. Baja
                        2. Media
                        3. Alta
                        Prefieres: """);
                Integer luz = FuncionesValidaciones.validarnumentero(sc);

                System.out.print("""
                        Nivel de riego:
                        1. Bajo
                        2. Medio
                        3. Alto
                        Prefieres: """);
                Integer riego = FuncionesValidaciones.validarnumentero(sc);

                System.out.print("""
                        Temperatura:
                        1. Fría
                        2. Templada
                        3. Cálida
                        Prefieres: """);
                Integer temp = FuncionesValidaciones.validarnumentero(sc);

                System.out.print("""
                        Ambiente:
                        1. Interior
                        2. Exterior
                        Prefieres: """);
                Integer amb = FuncionesValidaciones.validarnumentero(sc);


                int puntosCactus = calcularPuntaje(cactus, luz, riego, temp, amb);
                int puntosRosa = calcularPuntaje(rosas, luz, riego, temp, amb);
                int puntosAst = calcularPuntaje(ast, luz, riego, temp, amb);



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
        }
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
