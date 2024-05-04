import java.util.ArrayList;
import java.util.List;

// Clase Libro para representar un libro en el inventario
class Libro {
    private String titulo;
    private String autor;
    private int cantidad;

    public Libro(String titulo, String autor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

// Clase Inventario para gestionar los libros
class Inventario {
    private List<Libro> libros;

    public Inventario() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor, int cantidad) {
        Libro libro = new Libro(titulo, autor, cantidad);
        libros.add(libro);
    }

    public void editarLibro(int index, String titulo, String autor, int cantidad) {
        if (index >= 0 && index < libros.size()) {
            Libro libro = libros.get(index);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setCantidad(cantidad);
        }
    }

    public void eliminarLibro(int index) {
        if (index >= 0 && index < libros.size()) {
            libros.remove(index);
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println((i + 1) + ". " + libro.getTitulo() + " - " + libro.getAutor() + " - Cantidad: " + libro.getCantidad());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // Agregar libros al inventario
        inventario.agregarLibro("Cien años de soledad", "Gabriel García Márquez", 5);
        inventario.agregarLibro("1984", "George Orwell", 3);
        inventario.agregarLibro("El señor de los anillos", "J.R.R. Tolkien", 7);

        // Mostrar inventario
        inventario.mostrarInventario();

        // Editar libro en el inventario
        inventario.editarLibro(1, "1984", "George Orwell", 5);

        // Mostrar inventario actualizado
        inventario.mostrarInventario();

        // Eliminar libro del inventario
        inventario.eliminarLibro(2);

        // Mostrar inventario actualizado
        inventario.mostrarInventario();
    }
}
