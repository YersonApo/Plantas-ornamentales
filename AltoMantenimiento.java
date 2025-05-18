public abstract class AltoMantenimiento extends Plantas {

    public AltoMantenimiento(String nombre, String clima, String esDeExterior, String proposito) {
        super(nombre, clima, esDeExterior, proposito);
    }
    @Override
    public void mostrarCuidadosGenerales(){
        System.out.println("""
             Las plantas de alto mantenimiento requieren cuidados constantes y detallados. Son ideales para personas con experiencia o con tiempo para dedicarles. Aunque sus necesidades pueden variar entre familias, en general:
             Riego: Necesitan riegos frecuentes y controlados, sin encharcar.
             Luz: Requieren luz abundante, algunas con exposición directa controlada.
             Temperatura: Son sensibles a cambios bruscos, requieren ambientes cálidos y estables.
             Fertilización: Necesitan fertilización regular y específica según la especie.
            """);
        System.out.println();
    }
    public abstract void mostrarInfoFamilia();
}
