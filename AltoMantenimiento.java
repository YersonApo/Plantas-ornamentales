public abstract class AltoMantenimiento extends Plantas {

    public AltoMantenimiento(String nombre, String clima, String esDeExterior, String proposito) {
        super(nombre, clima, esDeExterior, proposito);
    }
    @Override
    public void mostrarCuidadosGenerales(){
        System.out.println("""
            """);
        System.out.println();
    }
}