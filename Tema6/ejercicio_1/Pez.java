package ejercicio_1;

public class Pez extends Animal implements Nadador{
	public void hacerSonido() {
		System.out.println("Blup");
	}
	
	public void moverse() {
		System.out.println("Se mueve");
	}
	
	public void mostrarInfo() {
		System.out.println("Info");
	}
	
	public void correr() {
		System.out.println("Nada");
	}

	@Override
	public void nadar() {
		
	}
}
