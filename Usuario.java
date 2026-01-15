package Proyecto_Tema_4;

public class Usuario {

    // Atributos
    private String dni;
    private String nombre;
    private int edad;

    // Constructor
    public Usuario(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Muestra los datos del usuario
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println();
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }
}
