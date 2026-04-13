package Ejercicio_1;

public class Persona {
	protected String nombre;
	protected int edad;
	public String sexo;
	
	public Persona() {}
	
	
	Persona (String nombre) {
		this.nombre = nombre;
	}
	
	
	public void mostrarDatos() {
		
		System.out.println("Hola soy " + nombre + " , tengo " + edad + " años ");
	}
	
	
	public void presentarse() {
		System.out.println("Hola, soy una persona y me llamo " + nombre);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEdad(int Edad) {
		this.edad = edad;
	}
	
	public int getEdad(int Edad) {
		return edad;
	}
}
