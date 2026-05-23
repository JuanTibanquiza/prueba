public class App {
  public static void main(String[] args) throws Exception {
        Gestionmascotas sistema = new Gestionmascotas();
        int opcion = 0;
        System.out.println(" CORRIENDO CASOS DE PRUEBA ");
        System.out.print("Prueba ID igual a 0: ");
        sistema.registrarMascota(new Perro(0, "Niño", 4));
        System.out.print("Prueba Edad negativa: ");
        sistema.registrarMascota(new Gato(4, "Ron", -2));
        System.out.print("Prueba Nombre vacio: ");
        sistema.registrarMascota(new Perro(5, "", 4));        
        System.out.println("Cargando mascotas validas iniciales...");
        sistema.registrarMascota(new Perro(1, "Lucas", 4));
        sistema.registrarMascota(new Gato(2, "Felix", 2));
        do {
            System.out.println(" SISTEMA DE GESTIÓN DE MASCOTAS ");
            System.out.println("1. Mostrar todas las mascotas ");
            System.out.println("2. Escuchar sonido de mascota por ID");
            System.out.println("3. Buscar mascota por Nombre");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int caracter = System.in.read();
            
           while (System.in.available() > 0) {
                System.in.read();
            }

            opcion = caracter - '0';

            switch (opcion) {
                case 1:
                    sistema.mostrarMascotas();
                    break;

                case 2:
                    
                    System.out.println(" Buscando ID 1 (Rex) ");
                    Mascota mId = sistema.buscarPorId(1);
                    if (mId != null) {
                        System.out.println(mId.getnombre() + " dice: " + mId.hacerSonido());
                    } else {
                        System.out.println("Mascota no encontrada");
                    }

                 
                    System.out.println("Buscando ID 99 ");
                    Mascota mIdFalso = sistema.buscarPorId(99);
                    if (mIdFalso != null) {
                        System.out.println(mIdFalso.hacerSonido());
                    } else {
                        System.out.println("Mascota no encontrada");
                    }
                    break;

                case 3:
                    System.out.println(" Buscando nombre 'Felix' ");
                    Mascota mNom = sistema.buscarPorNombre("Felix");
                    if (mNom != null) {
                        mNom.mostrarInfo();
                        System.out.println("Sonido: " + mNom.hacerSonido());
                    } else {
                        System.out.println("Mascota no encontrada");
                    }

                    System.out.println(" Buscando nombre 'Firu'" );
                    Mascota mNomFalso = sistema.buscarPorNombre("Firu");
                    if (mNomFalso != null) {
                        mNomFalso.mostrarInfo();
                    } else {
                        System.out.println("Mascota no encontrada");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema... Examen finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}