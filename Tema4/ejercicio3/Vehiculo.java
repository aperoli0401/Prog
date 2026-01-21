package ejercicio3;

public class Vehiculo {
	
	// Atributos
	String matricula;
	String marca;
	int anioFabricacion;
	double precio;
	TipoVehiculo tipo;
	double viejo;
	double porcentaje;
	
	// Constructor
	Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo){
		
		this.matricula = matricula;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	// Métodos
	
	void mostrarInformacion(){
		System.out.println("informacion");
	}
	
	void viejo(double viejo) {
		if (viejo >= 10) {
			System.out.println("El coche es viejo");
		}
	}
	void aplicarDescuento(double porcentaje) {
		precio -= precio * porcentaje/100;
	}
}
