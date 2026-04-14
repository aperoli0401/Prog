package Ejercicio_6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Control de aduanas
		Set<String> paises = new HashSet<String>();

		int total = 5;
		for (int i = 0; i < total; i++) {
			System.out.print("Introduce el nombre del país: ");
			String pais = sc.nextLine();
			if (!paises.add(pais)) {
				System.out.println("¡Ese ya pasó por la frontera!");
			}
		}
		System.out.println("Países únicos: " + paises.size());
		System.out.println("Lista de países: " + paises);
		sc.close();

		// 2. Ranking de videojuegos
		Scanner scanner = new Scanner(System.in);
		
		Set<String> videojuegos = new TreeSet<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce el juego: ");
			String juegos = scanner.nextLine();
			videojuegos.add(juegos);
		}
		System.out.println("Ranking de videojuegos " + videojuegos);
		scanner.close();
		
		// 3. La memoria de pez
		Set<String> colores = new LinkedHashSet<>();
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Rojo");
        colores.add("Amarillo");
        colores.add("Negro");
        System.out.println("Colores en el orden que fueron añadidos:");
        for (String color : colores) {
            System.out.println(color);
        }
        
        colores.add("Rojo");
        System.out.println("\nIntentando agregar 'Rojo' de nuevo... (no se repite)");
        System.out.println("Colores ahora:");
        System.out.println(colores);
    }
} 