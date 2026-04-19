import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_8 {
    public static void main(String[] args) {
    
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);

        System.out.println("Ordenados de menor a mayor: ");
        for (Integer n : numeros) {
            System.out.println(n);
        }

        System.out.println();

        Set<String> alumnos = new TreeSet<>();

        alumnos.add("Zaira");
        alumnos.add("Alberto");
        alumnos.add("Mario");

        System.out.println("Ordenados alfabeticamente: ");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}