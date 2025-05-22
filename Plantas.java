 abstract class Plantas {

     //Atributos
    private String nombre;
    private String clima;
    private String esDeExterior;
    private String proposito;

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
     public abstract int getTemperatura();



    //Getter y Setter
    public String getClima() {
        return clima;
    }

     public void setClima(String clima) {
         this.clima = clima;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getEsDeExterior() {
         return esDeExterior;
     }

     public void setEsDeExterior(String esDeExterior) {
         this.esDeExterior = esDeExterior;
     }

     public String getProposito() {
         return proposito;
     }

     public void setProposito(String proposito) {
         this.proposito = proposito;
     }


 }
