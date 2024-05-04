// Interfaz para la estrategia de préstamo
interface EstrategiaPrestamo {
    void realizarPrestamo();
    void devolverPrestamo();
    void renovarPrestamo();
}

// Clases concretas de estrategia de préstamo
class PrestamoNormal implements EstrategiaPrestamo {
    public void realizarPrestamo() {
        System.out.println("Realizando préstamo normal...");
    }

    public void devolverPrestamo() {
        System.out.println("Devolviendo préstamo normal...");
    }

    public void renovarPrestamo() {
        System.out.println("Renovando préstamo normal...");
    }
}

class PrestamoUrgente implements EstrategiaPrestamo {
    public void realizarPrestamo() {
        System.out.println("Realizando préstamo urgente...");
    }

    public void devolverPrestamo() {
        System.out.println("Devolviendo préstamo urgente...");
    }

    public void renovarPrestamo() {
        System.out.println("Renovando préstamo urgente...");
    }
}

// Clase Usuario que utiliza la estrategia de préstamo
class Usuario {
    private EstrategiaPrestamo estrategiaPrestamo;

    public Usuario(EstrategiaPrestamo estrategiaPrestamo) {
        this.estrategiaPrestamo = estrategiaPrestamo;
    }

    public void realizarPrestamo() {
        estrategiaPrestamo.realizarPrestamo();
    }

    public void devolverPrestamo() {
        estrategiaPrestamo.devolverPrestamo();
    }

    public void renovarPrestamo() {
        estrategiaPrestamo.renovarPrestamo();
    }
}

// Clase Inventario para gestionar los libros
class Inventario {
    public void agregarLibro() {
        System.out.println("Agregando libro al inventario...");
    }

    public void editarLibro() {
        System.out.println("Editando libro del inventario...");
    }

    public void eliminarLibro() {
        System.out.println("Eliminando libro del inventario...");
    }

    public void buscarLibro() {
        System.out.println("Buscando libro en el inventario...");
    }
}

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear instancia de Usuario con estrategia de préstamo normal
        Usuario usuario = new Usuario(new PrestamoNormal());
        usuario.realizarPrestamo();
        usuario.devolverPrestamo();
        usuario.renovarPrestamo();

        // Cambiar la estrategia de préstamo del usuario a urgente
        usuario = new Usuario(new PrestamoUrgente());
        usuario.realizarPrestamo();
        usuario.devolverPrestamo();
        usuario.renovarPrestamo();

        // Operaciones de inventario
        Inventario inventario = new Inventario();
        inventario.agregarLibro();
        inventario.editarLibro();
        inventario.eliminarLibro();
        inventario.buscarLibro();
    }
}
