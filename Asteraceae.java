public class Asteraceae extends BajoMantenimiento {

    public Asteraceae() {
        super("Asteraceae", "Templado", "Ambos", "Decoración");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            Familia: Asteraceae
            Las plantas de la familia Asteraceae son muy diversas y suelen ser fáciles de cuidar.
            Son ideales para interiores y exteriores con luz moderada.
            """);
        System.out.println();
    }

    @Override
    public int getNivelRiego() {
        return 1;
    }
    @Override
    public int getNivelLuz() {
        return 2;
    }
    @Override
    public int getAmbiente() {
        return 1;
    }
    @Override
    public int getTamaño() {
        return 1;
    }
}
