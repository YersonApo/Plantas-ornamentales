public class Labiadas extends MedioMantenimiento {

    public Labiadas() {
        super("Labiadas", "Moderado", "Ambos", "Aromática y Ornamental");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
                Familia: Labiadas
                Plantas aromáticas y ornamentales que requieren buena aireación 
                y podas ligeras para un crecimiento saludable.
                """);
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
        return 1;
    }

    @Override
    public int getTamaño() {
        return 1;
    }
}
