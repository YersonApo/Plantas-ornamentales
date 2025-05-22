public class Palmas extends MedioMantenimiento {

    public Palmas() {
        super("Palmas", "Templada", "Exterior", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌴 Familia: Arecaceae
            Las palmas son plantas elegantes y resistentes, ideales para jardines exteriores.
            Requieren riego moderado y prefieren luz media a alta.
            Se adaptan mejor a temperaturas templadas y espacios amplios.
            """);
        System.out.println();
    }

    @Override
    public int getNivelLuz() {
        return 2;
    }

    @Override
    public int getNivelRiego() {
        return 2;
    }

    @Override
    public int getTemperatura() {
        return 2;
    }

    @Override
    public int getAmbiente() {
        return 2;
    }

    @Override
    public int getTamaño() {
        return 3;
    }
}
