public class Cactus extends BajoMantenimiento {

    public Cactus() {
        super("Cactus", "Seco" , "Ambos", "Decoración");

    }

    @Override
    public void mostrarInfoFamilia() {
        System.out.println("""
                Familia: Cactaceae
                Los cactus son plantas suculentas que almacenan agua en sus tejidos.
                Son muy resistentes y perfectos para personas con poco tiempo.
                """);
        System.out.println();
    }
@Override
    public int getNivelRiego(){
        return 1;
    }
    @Override
    public int getNivelLuz(){
        return 3;
    }
    @Override
    public int getAmbiente(){
        return 1;
    }
    @Override
    public int getTamaño(){
        return 2;
    }
}
