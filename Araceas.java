public class Araceas extends AltoMantenimiento {

    public Araceas() {
        super("Aráceas", "Húmedo", "Interior", "Decorativo");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            Familia: Araceae
            Incluye helechos de interior como monstera y alocasia.
            Requieren mucha humedad y luz indirecta brillante.
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