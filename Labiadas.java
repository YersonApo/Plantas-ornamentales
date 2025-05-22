public class Labiadas extends MedioMantenimiento {

    public Labiadas() {
        super("Labiadas", "Templada", "Ambos", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌿 Familia: Lamiaceae
            Las labiadas son plantas aromáticas con flores llamativas.
            Necesitan cuidados moderados, con luz media y riego regular.
            Se adaptan a ambientes interiores y exteriores.
            Prefieren temperaturas templadas y espacios de tamaño medio.
            """);
        System.out.println();
    }

    @Override
    public int getNivelLuz() {
        return 2;
    }

    @Override
    public int getNivelRiego() {
        return 3;
    }

    @Override
    public int getTemperatura() {
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
}
