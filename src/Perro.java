public class Perro {
public Perro(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
}
