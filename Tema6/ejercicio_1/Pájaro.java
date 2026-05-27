package ejercicio_1;

public class Pájaro extends Animal implements Volador{
	public void hacerSonido() {
		System.out.println("Pio Pio");
	}
	
	public void moverse() {
		System.out.println("Se mueve");
	}
	
	public void mostrarInfo() {
		System.out.println("Info");
	}
	
	public void correr() {
		System.out.println("Corre");
	}

	@Override
	public void volar() {
		
	}
}
