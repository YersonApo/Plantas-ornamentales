public abstract class AltoMantenimiento extends Plantas {

    public AltoMantenimiento(String nombre, String clima, String esDeExterior, String proposito) {
        super(nombre, clima, esDeExterior, proposito);
    }

    @Override
    public void mostrarCuidadosGenerales() {
        System.out.println("""
            Las plantas de alto mantenimiento requieren atención constante y condiciones específicas:
            - Riego: Frecuente y controlado, evitando encharcamientos.
            - Humedad: Alta, con nebulizaciones o bandejas de guijarros.
            - Luz: Intensa pero filtrada; nunca sol directo todo el día.
            - Temperatura: Estable, sin cambios bruscos (ideal 18–24 °C).
            - Sustrato: Mezclas especializadas y fertilización regular.
            """);
        System.out.println();
    }
}