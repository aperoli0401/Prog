package Proyecto_Tema_4;

public class Main {

    public static void main(String[] args) {

        // Crear libros
        Libro libro1 = new Libro("111A", "Platero y Yo", "Juan Ramón Jimenez", 1605, EstadoPrestamo.DISPONIBLE);
        Libro libro2 = new Libro("222B", "50 sombras de Grey", "E. L. James", 2018, EstadoPrestamo.DISPONIBLE);

        // Crear usuarios
        Usuario usuario1 = new Usuario("12345678A", "Carlos Pérez", 25);
        Usuario usuario2 = new Usuario("87654321B", "Laura Gómez", 30);

        // Mostrar información inicial
        System.out.println("--- INFORMACIÓN INICIAL DE LOS LIBROS ---");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        System.out.println("--- DATOS DE LOS USUARIOS ---");
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        // Realizar préstamos
        System.out.println("--- REALIZANDO PRÉSTAMOS ---");

        Prestamo prestamo1 = new Prestamo(libro1, usuario1, 15);
        prestamo1.mostrarDetalle();

        Prestamo prestamo2 = new Prestamo(libro2, usuario2, 10);
        prestamo2.mostrarDetalle();

        // Comprobar que el estado del libro cambia
        System.out.println("--- ESTADO DE LOS LIBROS DESPUÉS DE LOS PRÉSTAMOS ---");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        // Marcar retraso en un préstamo
        System.out.println("--- MARCANDO RETRASO EN UN PRÉSTAMO ---");
        prestamo1.marcarRetraso();

        // Estado final del libro
        System.out.println("--- ESTADO FINAL DEL LIBRO 1 ---");
        libro1.mostrarInformacion();
    }
}
