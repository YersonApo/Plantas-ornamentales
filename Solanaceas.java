public class Solanaceas extends MedioMantenimiento {

    public Solanaceas() {
        super("Solanáceas", "Templada", "Ambos", "Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            🌿 Familia: Solanaceae
            Las solanáceas incluyen plantas versátiles con flores atractivas.
            Requieren un mantenimiento moderado, con riego y luz adecuados.
            Se adaptan bien tanto a ambientes interiores como exteriores.
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
        return 2;
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
