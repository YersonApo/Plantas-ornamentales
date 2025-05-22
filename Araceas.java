public class Araceas extends AltoMantenimiento {

    public Araceas() {
        super("Arácea", "Cálida", "Interior", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌿 Familia: Araceae
            Las aráceas son plantas tropicales que prefieren ambientes cálidos y protegidos.
            Son ideales para interiores con luz indirecta y riego moderado a alto.
            Su follaje es decorativo y requieren cuidados constantes para mantenerse saludables.
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
        return 3;
    }

    @Override
    public int getAmbiente() {
        return 1;
    }

    @Override
    public int getTamaño() {
        return 3;
    }
}
