package ejercicio_2;

public class Perro extends AnimalBase implements Animal{
	
	public Perro(String nombre) {
		super(nombre);
	
	}

	public void hacerSonido() {
		System.out.println("Guau");
	}
	
	public void comer() {
		System.out.println("El perro come");
	}
	
	public void informacion() {
		System.out.println("Nombre: " + nombre);
	}
}
