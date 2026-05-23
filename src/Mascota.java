public class Mascota {
    private int id;
    private String nombre;
    private int edad;
    public Mascota(int id, String nombre, int edad) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 1;
        }
        this.nombre = nombre;
        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 1;
        }
    }
    public int getid() {
        return id;
    }
    public String getnombre() {
        return nombre;
    }
    public int getedad() {
        return edad;
    }
    public void setid(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Error: El ID debe ser mayor a 0.");
        }
    }
    public void setnombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }
    public void setedad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 0.");
        }
    }
    public String hacerSonido() {
        return "Sonido de mascota";
    }
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad );
    }
}

