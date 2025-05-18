import java.util.ArrayList;

public class CatalogoFamilias {
    public static ArrayList<Plantas> mostrarCatalogoBajoMan() {
        ArrayList<Plantas> plantas = new ArrayList<>();
        plantas.add(new Cactus());
        plantas.add(new Rosas());
        plantas.add(new Asteraceae());
        return plantas;
    }
}
