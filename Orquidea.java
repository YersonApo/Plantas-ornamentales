public class Orquidea extends AltoMantenimiento {

    public Orquidea() {
        super("Orquídea", "Húmedo", "Interior", "Decorativo");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
            Familia: Orchidaceae
            Las orquídeas son epífitas, con flores exóticas y larga duración.
            Necesitan ambiente húmedo y buena circulación de aire.
            """);
        System.out.println();
    }

    @Override
    public int getNivelRiego() {
        return 4;
    }

    @Override
    public int getNivelLuz() {
        return 4;
    }

    @Override
    public int getAmbiente() {
        return 4;
    }

    @Override
    public int getTamaño() {
        return 2;
    }
}