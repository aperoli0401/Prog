package Ejercicio_4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};
        ArrayList<Double> listaNotas = new ArrayList<>();

       
        for (String notaTexto : notasEntrada) {
            
            listaNotas.add(Double.valueOf(notaTexto));
        }

 
        double suma = 0;
        for (Double nota : listaNotas) {
            suma += nota; 
        }
        double media = suma / listaNotas.size();

        
        ArrayList<Double> aprobados = new ArrayList<>();
        for (Double nota : listaNotas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        // Resultados
        System.out.println("Lista completa de notas: " + listaNotas);
        System.out.printf("Nota media de la clase: %.2f%n", media);
        System.out.println("Lista de aprobados: " + aprobados);
    }
}