package ejercicio_1;

public class Gato extends Animal implements Corredor{
	public void hacerSonido() {
		System.out.println("Miau");
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
}
