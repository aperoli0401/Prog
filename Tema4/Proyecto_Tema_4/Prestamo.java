
package Proyecto_Tema_4;

public class Prestamo {

    // Atributos
    private Libro libro;
    private Usuario usuario;
    private int diasPrestamo;

    // Constructor
    public Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;

        // Al crear el préstamo, el libro pasa a PRESTADO
        libro.cambiarEstado(EstadoPrestamo.PRESTADO);
    }

    // Muestra los detalles del préstamo
    public void mostrarDetalle() {
        System.out.println("Libro prestado: " + libro.getTitulo());
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Días de préstamo: " + diasPrestamo);
        System.out.println("Estado del libro: " + libro.getEstado());
        System.out.println();
    }

    // Marca el préstamo como retrasado
    public void marcarRetraso() {
        libro.cambiarEstado(EstadoPrestamo.RETRASADO);
        System.out.println("El préstamo ha sido marcado como retrasado.\n");
    }
}
