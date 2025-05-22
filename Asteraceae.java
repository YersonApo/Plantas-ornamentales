public class Asteraceae extends BajoMantenimiento {

    public Asteraceae() {
        super("Asteraceae", "Templado", "Ambos", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌼 Familia: Asteraceae
            Las plantas de la familia Asteraceae son conocidas por su variedad y belleza.
            Son fáciles de cuidar, ideales para quienes buscan plantas resistentes y decorativas.
            Se adaptan bien a ambientes con luz media y prefieren temperaturas templadas.
            """);
        System.out.println();
    }

    @Override
    public int getNivelRiego() {
        return 2;
    }

    @Override
    public int getNivelLuz() {
        return 2;
    }

    @Override
    public int getAmbiente() {
        return 3;
    }

    @Override
    public int getTamaño() {
        return 2;
    }

    @Override
    public int getTemperatura() {
        return 2;
    }
}
