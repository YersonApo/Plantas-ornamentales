 abstract class Plantas {
    //Atributos
    private String nombre;
    private String clima;
    private String tamaño;
    private String esDeExterior;
    private String proposito;

    //Atributos para sugerencias
    private Integer nivelLuz;
    private Integer nivelRiego;
    private Integer nivelClima;
    private Integer nivelAmbiente;

     //Constructor
    public Plantas(String nombre, String clima,String esDeExterior,String proposito) {
        this.nombre = nombre;
        this.clima = clima;
        this.esDeExterior = esDeExterior;
        this.proposito = proposito;
    }
    public Plantas(){
    }

    //Metodos

    public void mostrarInfoBasica(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Clima: " + clima);
        System.out.println("Es de exterior o interior: " + esDeExterior);
        System.out.println("Proposito: " + proposito);
        System.out.println();
    }

    public abstract void mostrarCuidadosGenerales();

    public abstract int getNivelRiego();
    public abstract int getNivelLuz();
    public abstract int getAmbiente();
    public abstract int getTamaño();



    //Getter y Setter

 }
