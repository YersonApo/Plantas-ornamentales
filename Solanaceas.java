public class Solanaceas extends MedioMantenimiento {

    public Solanaceas() {
        super("Solanáceas", "Moderado", "Exterior", "Decoración y Fruto");
    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
                Familia: Solanáceas
                Plantas con flores vistosas y frutos decorativos. 
                Requieren buena iluminación, suelos bien drenados y vigilancia contra plagas.
                """);
    }

    @Override
    public int getNivelRiego() {
        return 2;
    }

    @Override
    public int getNivelLuz() {
        return 3;
    }

    @Override
    public int getAmbiente() {
        return 2; // Exterior
    }

    @Override
    public int getTamaño() {
        return 2; // Tamaño medio
    }
}
