package Ejercicio_4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		ArrayList<Double> notas = new ArrayList<>();

	
		String[] notasEntrada = {"67.7", "8.8", "10.0", "7.231", "78.5"};
		
		for (String notaTexto : notasEntrada) {
			Double notaNumero = Double.valueOf(notaTexto);
		    notas.add(notaNumero);
		    }
		System.out.println("Notas: " + notas);

		
		double sumar = 0.0;
		for (Double nota : notas) {
			sumar += nota;
			}
		double media = sumar / notas.size();
		System.out.println("Nota media: " + media);
		
		ArrayList<Double> aprobadas = new ArrayList<>();
		for (Double nota : notas) {
			if (nota >= 5.0) {
				aprobadas.add(nota);
				}
			}
		System.out.println("Aprobados: " + aprobadas);
		
	}
	
}