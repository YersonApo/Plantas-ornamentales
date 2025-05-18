public abstract class MedioMantenimiento extends Plantas {

    public MedioMantenimiento(String nombre, String clima, String esDeExterior, String proposito) {
        super(nombre, clima, esDeExterior, proposito);
    }
    @Override
    public void mostrarCuidadosGenerales(){
        System.out.println("""
             Las plantas de medio mantenimiento requieren atención moderada,
             ideales para personas que pueden dedicarles algo de tiempo semanalmente. 
             Aunque sus necesidades varían entre familias, en general:
             -Riego: Necesitan riego regular, manteniendo el sustrato ligeramente húmedo.
             -Luz: Prefieren buena iluminación, algunas toleran luz directa por pocas horas.
             -Temperatura: Se desarrollan bien en climas templados, evitando extremos.
             -Fertilización: Requieren fertilización mensual para mantener su vitalidad.
            """);
        System.out.println();
    }
    public abstract void mostrarInfoFamilia();
}
