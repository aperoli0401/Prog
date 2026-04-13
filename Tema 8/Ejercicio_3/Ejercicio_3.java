package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		//1
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Alejandro");
		listaNombres.add("Jose");
		listaNombres.add("Manuel");
		listaNombres.add("Paco");
		listaNombres.add("Juan");
		
		//2
		for (String e: listaNombres) {
			System.out.println(listaNombres);
		}
		
		//3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nuevo nombre: ");
		String nuevoNombre = sc.nextLine();
		listaNombres.add(nuevoNombre);
		System.out.println(listaNombres);
		
		//4
		System.out.println("Introduce el nombre a eliminar: ");
		String eliminarNombre = sc.nextLine();
		
		if (listaNombres.remove(eliminarNombre)) {
			System.out.println("El nombre se ha eliminado correctamente");
		}else {
			System.out.println("El nombre no se encuentra en la lista");
		}
		
		//5
		System.out.println("Total nombres: " + listaNombres.size());
		
		sc.close();
	}
		

}
