package Ejercicio_5;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// 1. Crear conjunto vacío
		Set<Integer> conjuntoEntero = new HashSet<Integer>();
		
		// 2. Agregar 5 numeros
		conjuntoEntero.add(0);
		conjuntoEntero.add(1);
		conjuntoEntero.add(2);
		conjuntoEntero.add(3);
		conjuntoEntero.add(4);
		
		// 3. Imprimir los numeros
		System.out.println(conjuntoEntero);
		
		// 4. Numero repetidos
		conjuntoEntero.add(1);
		System.out.println(conjuntoEntero);
		
		
		// 5. Añadir nulo
		conjuntoEntero.add(null);
		
		// 6. Conjunto numeros primos
		Set<Integer> conjuntoPrimos = new HashSet<Integer>();
		conjuntoPrimos.add(2);
		conjuntoPrimos.add(3);
		
		// 7. Lista final
		final Set<Integer> conjuntoFinal = new HashSet<Integer>();
		conjuntoEntero.add(0);
		conjuntoEntero.add(1);
		conjuntoEntero.add(2);
		conjuntoEntero.add(3);
		conjuntoEntero.add(4);
		
		// La lista 
		
	}

}
