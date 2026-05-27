package ejercicio_2;

public class Pajaro extends AnimalBase implements Volador{

	public Pajaro(String nombre) {
		super(nombre);
		
	}

	
	public void hacerSonido() {
		System.out.println("Pio Pio");
		
	}

	
	public void comer() {
		System.out.println("El pajaro come");
		
	}

	
	public void informacion() {
		System.out.println("Nombre: " + nombre);
		
	}

}
