package ejercicio1;
 
import ejercicio2.DiaDeLaSemana;
import ejercicio2.Sexo;

public class Persona {	
		// Atributos
		
		String nombre;
		String apellido;
		int edad;
		double estatura;
		DiaDeLaSemana dia;
		Sexo sexo;
		
		Persona(String nombre, int edad, double estatura, DiaDeLaSemana dia, Sexo sexo){
		// Constructor
		
			this.nombre = nombre;
			this.edad = edad;
			this.estatura = estatura;
			this.dia = dia;
			this.sexo = sexo;
			
		}
	
		
		Persona(){
			
		}
		
		Persona(String nombre, String apellido, int edad, double estatura, DiaDeLaSemana dia, Sexo sexo){
			this(nombre, edad, estatura, dia, sexo);
			this.apellido = apellido;
			
		}
		
}
