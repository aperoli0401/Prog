package ejercicio_2;

import java.util.Scanner;


public class Calculadora {
		double a;
	    double b;

	    public static double sumar(double a, double b) {
	        return a + b;
	    }

	    public static double restar(double a, double b) {
	        return a - b;
	    }

	    public static double dividir (double a, double b) throws ArithmeticException{
	        return a / b;
	    }

	    public static double multiplicar(double a, double b) {
	        return a * b;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("1-Sumar  2-Restar  3-Multiplicar  4-Dividir");
	        int opcion = sc.nextInt();

	        System.out.print("Numero 1: ");
	        double a = sc.nextDouble();

	        System.out.print("Numero 2: ");
	        double b = sc.nextDouble();

	        if (opcion == 1) {
	            System.out.println("Resultado: " + sumar(a, b));
	        } 
	        else if (opcion == 2) {
	            System.out.println("Resultado: " + restar(a, b));
	        } 
	        else if (opcion == 3) {
	            System.out.println("Resultado: " + multiplicar(a, b));
	        } 
	        else if (opcion == 4) {
	            System.out.println("Resultado: " + dividir(a, b));
	        } 
	        else {
	            System.out.println("Opcion no valida");
	        }

	        sc.close();
	    }
	}


