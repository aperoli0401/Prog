package act_9;

public class Figura {
	protected String nombre;
	
	public Figura (String nombre){
		this.nombre = nombre;
	}

	public double calcularArea() {
		return 0;
	}
	
	public void mostrarInformacion () {
		System.out.println("El nombre de la figura es: " + nombre);
	}
	
}
