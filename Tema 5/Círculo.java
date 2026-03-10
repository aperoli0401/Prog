package act_9;

public class Círculo extends Figura{
	private double radio;
	
	Círculo(String nombre, double base, double altura, double radio) {
		super(nombre);
		this.radio = radio;
	} 
	
	public double calcularArea() {
		return radio * 2 / 2;
	}
}
