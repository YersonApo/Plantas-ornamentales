import java.util.ArrayList;

public class InventarioPlantas {

    private ArrayList<Plantas> listaPlantas;

    public InventarioPlantas() {
        listaPlantas = new ArrayList<>();
    }

    public void agregarPlanta(Plantas planta) {
        listaPlantas.add(planta);
        System.out.println("🌿 Planta agregada exitosamente.");
    }

    public void mostrarInventario() {
        if (listaPlantas.isEmpty()) {
            System.out.println("📭 El inventario está vacío.");
        } else {
            System.out.println("🌸 Plantas en inventario:");
            for (int i = 0; i < listaPlantas.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + listaPlantas.get(i).getClass().getSimpleName());
            }
            System.out.println();
        }
    }

    public void mostrarInfoPlanta(int indice) {
        if (indice >= 0 && indice < listaPlantas.size()) {
            Plantas planta = listaPlantas.get(indice);
            planta.mostrarInfoBasica();
            System.out.println("Y sus cuidados en general son:");
            planta.mostrarCuidadosGenerales();
        } else {
            System.out.println("⚠️ Índice inválido.");
        }
    }

    public int getCantidad() {
        return listaPlantas.size();
    }
    public void eliminarPlanta(int indice) {
        if (indice >= 0 && indice < listaPlantas.size()) {
            Plantas eliminada = listaPlantas.remove(indice);
            System.out.println("🗑️ Planta '" + eliminada.getNombre() + "' eliminada del inventario.");
        } else {
            System.out.println("❌ Índice inválido. No se pudo eliminar la planta.");
        }
    }

}
