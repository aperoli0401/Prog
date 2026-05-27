package ejercicio_2;

public class Main {

	public static void main(String[] args) {
		hacerDivisionEntera(2, 0);

		try {
			Calculadora.dividir(2, 0);
		} catch (ArithmeticException ex) {
			System.out.println("Imposible dividir entre 0");
		}

		Persona alejandro = new Persona();
		alejandro.setEdad(-1);
		System.out.println("La edad es: " + alejandro.getEdad());
		try {
			alejandro.getEdad();
		} catch (ArithmeticException ex) {
			System.out.println("No puede tener edad negativa");
		}
		
		Persona p = new Persona();
		p.setEdad(-4);
	}

	private static int hacerDivisionEntera(int a, int b) throws ArithmeticException {
		return (int) Calculadora.dividir(a, b);
	}
}
