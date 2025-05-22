public abstract class AltoMantenimiento extends Plantas {

    public AltoMantenimiento(String nombre, String clima, String esDeExterior, String proposito) {
        super(nombre, clima, esDeExterior, proposito);
    }

    @Override
    public void mostrarCuidadosGenerales() {
        System.out.println("""
            🌺 Las plantas de alto mantenimiento requieren cuidados especiales y dedicación constante.
            🕰️ Ideales para personas apasionadas que disfrutan dedicar tiempo diario a sus plantas.
            📌 En general, necesitan:
            💦 Riego frecuente y controlado para evitar estrés hídrico.
            🔆 Luz adecuada, muchas veces luz directa durante varias horas.
            🌡️ Temperaturas estables y específicas según su especie.
            🌿 Fertilización regular y cuidados extra como poda y control de plagas.
            """);
        System.out.println();
    }

    public abstract void mostrarInfoFamilia();
}
