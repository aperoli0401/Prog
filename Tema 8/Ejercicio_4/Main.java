package Ejercicio_4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		ArrayList<Double> notas = new ArrayList<>();

	
		String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};
		
		for (String notaTexto : notasEntrada) {
			Double notaNumero = Double.valueOf(notaTexto);
		    notas.add(notaNumero);
		    }
		System.out.println("Notas: " + notas);

		
		double suma = 0.0;
		for (Double nota : notas) {
			suma += nota;
			}
		double media = suma / notas.size();
		System.out.println("Nota media: " + media);
		
		ArrayList<Double> aprobados = new ArrayList<>();
		for (Double nota : notas) {
			if (nota >= 5.0) {
				aprobados.add(nota);
				}
			}
		System.out.println("Aprobados: " + aprobados);
		
	}
	
}