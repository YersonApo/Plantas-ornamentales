public class Rosas extends BajoMantenimiento {

    public Rosas() {
        super("Rosas", "Templado", "Ambos", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            Familia: Rosaceae
            Las rosas son plantas con flores conocidas por su belleza y fragancia.
            Requieren cuidados moderados y son ideales para jardines decorativos.
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
        return 2;
    }

    @Override
    public int getTamaño() {
        return 2;
    }
}
