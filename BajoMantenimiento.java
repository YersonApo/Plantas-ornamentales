public abstract class BajoMantenimiento extends Plantas {

    public BajoMantenimiento(String nombre, String clima, String esDeExterior, String proposito) {
        super(nombre, clima, esDeExterior, proposito);
    }
@Override
public void mostrarCuidadosGenerales(){
    System.out.println("""
            Las plantas de bajo mantenimiento son fáciles de cuidar y requieren poca atención.
            Aunque sus necesidades pueden variar entre familias, en general:
            -Riego: Requieren poco riego, solo cuando el sustrato está seco.
            -Luz: Prefieren luz indirecta y no toleran la exposición prolongada al sol.
            -Temperatura: Disfrutan de temperaturas moderadas y ambientes estables.
            -Fertilización: No necesitan fertilización frecuente, un poco de fertilizante ocasional es suficiente.
            """);
    System.out.println();
}
public abstract void mostrarInfoFamilia();
}
