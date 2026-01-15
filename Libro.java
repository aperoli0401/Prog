package Proyecto_Tema_4;



public class Libro {

    // Atributos 
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private EstadoPrestamo estado;

    // Constructor
    public Libro(String isbn, String titulo, String autor, int anioPublicacion, EstadoPrestamo estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
    }

    // Muestra la información del libro
    public void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Estado: " + estado);
        System.out.println("¿Es antiguo?: " + esAntiguo());
        System.out.println();
    }

    // Metodos
    public boolean esAntiguo() {
       
        return (2026 - anioPublicacion) > 20;
    }

    
    public void cambiarEstado(EstadoPrestamo nuevoEstado) {
        this.estado = nuevoEstado;
    }

   
    public EstadoPrestamo getEstado() {
        return estado;
    }

    
    public String getTitulo() {
        return titulo;
    }
}
