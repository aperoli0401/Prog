package ejercicio_4;

import java.util.Scanner;

import ejercicio_5.NumeroRepetido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			introduceEnteros();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void introduceEnteros() {
		int[] lista = new int[5];
		lista[0] = 0;
		lista[1] = 12;
		lista[2] = 20;
		lista[3] = 13;
		lista[4] = 40;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (repetirNumero(lista, num))
			throw new NumeroRepetido("Número repetido");
		
		for (int e: lista) {
			System.out.println(e);
		}
	}
	private static boolean repetirNumero(int[] lista, int num) {
		boolean esta = false;
		for (int e: lista) {
			if (e == num)
				return true;
		}
		
		return false;
	}
}
