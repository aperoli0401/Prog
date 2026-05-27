package ejercicio_2;

public class Vaca extends AnimalBase implements Animal{
	
	public Vaca(String nombre) {
		super(nombre);
		
	}

	public void hacerSonido() {
		System.out.println("Muuuuuu");
	}
	
	public void comer() {
		System.out.println("La vaca come");
	}
	
	public void informacion() {
		System.out.println("Nombre: " + nombre);
	}

}
