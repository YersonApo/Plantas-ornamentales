public class Orquidea extends AltoMantenimiento {

    public Orquidea() {
        super("Orquídea", "Templada", "Interior", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌸 Familia: Orchidaceae
            Las orquídeas son plantas delicadas y elegantes que requieren cuidados detallados.
            Prefieren ambientes interiores con temperaturas templadas.
            Necesitan luz media, riego moderado y atención constante.
            Son perfectas para quienes disfrutan de la jardinería especializada.
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
        return 1;
    }

    @Override
    public int getTamaño() {
        return 2;
    }
}
