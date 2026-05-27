package ejercicio_1;

public class Perro extends Animal implements Corredor{
	public void hacerSonido() {
		System.out.println("Guau");
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
