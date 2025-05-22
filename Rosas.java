public class Rosas extends BajoMantenimiento {

    public Rosas() {
        super("Rosas", "Templado", "Ambos", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌹 Familia: Rosaceae
            Las rosas son plantas elegantes, famosas por su belleza y su delicada fragancia.
            Requieren cuidados moderados, ideales para jardines y espacios con luz media a alta.
            Prefieren un ambiente mixto, adaptándose tanto a interiores como exteriores.
            """);
        System.out.println();
    }

    @Override
    public int getNivelRiego() {
        return 3;
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
