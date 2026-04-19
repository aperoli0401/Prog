import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;

public class Ejercicio_6 {
    public static void main(String[] args) {
        //Reto 1
        Scanner scanner = new Scanner(System.in);
        HashSet<String> paises = new HashSet<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Dime un país: ");
            String pais = scanner.nextLine();
            if (!paises.add(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            }
        }
        System.out.println("Total de países únicos: " + paises.size());
    }

        //Reto 2
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> juegos = new TreeSet<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Dime el nombre del juego: ");
            juegos.add(scanner.nextLine());
        }
        
        System.out.println("Lista ordenada alfabéticamente:");
        System.out.println(juegos);
        
        //Reto 3
        LinkedHashSet<String> colores = new LinkedHashSet<>();
    
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Cian");

        System.out.println("Java recuerda el orden exacto:");
        for (String color : colores) {
            System.out.println("- " + color);
        }
}

