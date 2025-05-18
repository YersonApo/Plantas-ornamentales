public class Palmas extends MedioMantenimiento {

    public Palmas() {
        super("Palmas", "Moderado", "Interior", "Decoración tropical");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
                Familia: Arecaceae (Palmas)
                Plantas elegantes de aspecto tropical. 
                Requieren riego regular, buena humedad y protección contra el frío.
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
        return 0; // Interior
    }

    @Override
    public int getTamaño() {
        return 3; // Tamaño grande
    }
}
