import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Set<String> alumnos = new LinkedHashSet<>();
        
        alumnos.add("Ana");
        alumnos.add("Carlos");
        alumnos.add("Beatriz");

        System.out.println("Contenido del conjunto: " + alumnos);

        alumnos.add("Ana"); 

        alumnos.add(null);

        
        System.out.println("Lista de alumnos con prefijo (Orden de inserción):");
        for (String alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno);
            } else {
                System.out.println("Nulo");
            }
        }
    }
}