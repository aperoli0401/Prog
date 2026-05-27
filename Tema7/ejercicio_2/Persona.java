package ejercicio_2;

import ejercicio_5.ExcepcionEdadInvalida;

public class Persona {
	protected String nombre;
	protected int edad;
	public String sexo;
	
	Persona() {}
	
	
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
	
	public void setEdad(int edad) {
		if (edad < 0) {
			throw new ExcepcionEdadInvalida("Edad debe ser 0 o mayor");
		}
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}


}
