package ejercicio_2;

public class Gato extends AnimalBase implements Animal{

	public Gato(String nombre) {
		super(nombre);
		
	}

	public void hacerSonido() {
		System.out.println("Miau");
	}
	
	public void comer() {
		System.out.println("El gato come");
	}
	
	public void informacion() {
		System.out.println("Nombre: " + nombre);
	}
}
