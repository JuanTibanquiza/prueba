import java.util.ArrayList;
import java.util.List;
public class GestionMascotas {
    private List<Mascota> listaMascotas;
    public GestionMascotas() {
        this.listaMascotas = new ArrayList<>();
    }
    public void registrarMascota(Mascota mascota) {
        if (mascota.getid() <= 0 || mascota.getnombre() == null || mascota.getnombre().isEmpty() || mascota.getedad() <= 0) {
            System.out.println("Error: No se pudo registrar la mascota por datos invalidos.");
            return;
        }
        listaMascotas.add(mascota);
        System.out.println("Mascota registrada con exito.");
    }
    public void mostrarMascotas() {
        if (listaMascotas.isEmpty()) {
            System.out.println("La lista esta vacia. No hay mascotas registradas.");
            return;
        }
        System.out.println("LISTA DE MASCOTAS ");
        for (Mascota m : listaMascotas) {
            m.mostrarInfo();
            System.out.println("Sonido: " + m.hacerSonido());
        }
    }
    public Mascota buscarPorId(int id) {
        for (Mascota m : listaMascotas) {
            if (m.getid() == id) {
                return m;
            }
        }
        return null;
    }
    public Mascota buscarPorNombre(String nombre) {
        for (Mascota m : listaMascotas) {
            if (m.getnombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }
}

