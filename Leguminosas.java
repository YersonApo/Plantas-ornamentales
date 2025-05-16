public class Leguminosas extends AltoMantenimiento {

    public Leguminosas() {
        super("Leguminosas", "Húmedo", "Interior", "Funcional");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            Familia: Fabaceae
            Engloban plantas como guisantes y frijoles ornamentales.
            Exigen suelo rico en nutrientes y riego frecuente.
            """);
        System.out.println();
    }

    @Override
    public int getNivelRiego() {
        return 4;
    }

    @Override
    public int getNivelLuz() {
        return 3;
    }

    @Override
    public int getAmbiente() {
        return 4;
    }

    @Override
    public int getTamaño() {
        return 3;
    }
}