package act_9;

public class Rectángulo extends Figura{
	private double base;
	private double altura;
	
	Rectángulo (String nombre, double base, double altura) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularArea() {
		return base * altura;
	}
}
