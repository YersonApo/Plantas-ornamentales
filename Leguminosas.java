public class Leguminosas extends AltoMantenimiento {

    public Leguminosas() {
        super("Leguminosas", "Cálida", "Exterior", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌱 Familia: Leguminosae
            Las leguminosas requieren cuidados intensivos y atención constante.
            Prefieren ambientes exteriores con temperaturas cálidas.
            Necesitan luz alta y riego frecuente.
            Son ideales para jardineros experimentados que buscan plantas llamativas.
            """);
        System.out.println();
    }

    @Override
    public int getNivelLuz() {
        return 3;
    }

    @Override
    public int getNivelRiego() {
        return 3;
    }

    @Override
    public int getTemperatura() {
        return 3;
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
