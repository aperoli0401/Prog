package ejercicio1;

import ejercicio2.DiaDeLaSemana;
import ejercicio2.Sexo;

public class Ciudad {

	public static void main(String[] args) {
		
		DiaDeLaSemana miercoles = DiaDeLaSemana.MIERCOLES;
		int x = 5;
		
		Sexo hombre = Sexo.HOMBRE;
		Sexo mujer = Sexo.MUJER;
		Sexo nobinario = Sexo.NOBINARIO;
		
		Persona p = new Persona("Juan", "Perez", 20, 1.8);
		p.dia = DiaDeLaSemana.LUNES;
		
		Persona Fernando = new Persona(null, 0, 0);
		Fernando.nombre = "Fernando";
		Fernando.edad = 84;
		Fernando.estatura = 1.72;
		
		Persona Alejandro = new Persona(null, 0, 0);
		Alejandro.nombre = "Alejandro";
		Alejandro.edad = 18;
		Alejandro.estatura = 1.32;
		
		Persona Manuel = new Persona(null, 0, 0);
		Manuel.nombre = "Manuel";
		Manuel.edad = 40;
		Manuel.estatura = 1.84;
		
		// Imprimir referencia
		System.out.println(Manuel);
		
		// Imprimir: Hola soy [juan] y tengo [20] años
		System.out.println("Hola soy" + Fernando.nombre + "y tengo " + Fernando.edad + "años");
		System.out.println("Hola soy" + Alejandro.nombre + "y tengo " + Alejandro.edad + "años");
		System.out.println("Hola soy" + Manuel.nombre + "y tengo " + Manuel.edad + "años");
		
		// Parte 4 
		
		// Si dejamos el constructor por defecto los datos usaran los datos por defecto depende del tipo de dato
		// Cuando creamos el constructor java elimina el constructor por defecto por tanto java usa los datos que nosotros le demos
		Persona Paco = new Persona(null, 0, 0);
		Paco.nombre = "Paco";
		
		
		System.out.println("Hola soy " + Paco.nombre + " y tengo " + Paco.edad + " años ");
		
		Persona Pepe = new Persona(null, 0, 0);
		Pepe.nombre = "Pepe";
		
		System.out.println("Hola soy " + Pepe.nombre + " y tengo " + Pepe.edad + " años");	
		
		// Para la pregunta 3 usamos este codigo
		Persona Anonima = new Persona("Anonima", 18, 1.70);
		System.out.println("Hola soy " + Anonima.nombre + " y tengo " + Anonima.edad + " años" + " y mido " + Anonima.estatura);
		
		Persona Alfonso = new Persona("Alfonso", 99, 2.1);
		System.out.println("Hola soy " + Anonima.nombre + " y tengo " + Anonima.edad + " años" + " y mido " + Anonima.estatura);
		
		Persona Antonio = new Persona("Antonio", 45, 1.80);
		System.out.println("Hola soy " + Anonima.nombre + " y tengo " + Anonima.edad + " años" + " y mido " + Anonima.estatura);
		
		Persona David = new Persona("David", 10, 1.30);
		System.out.println("Hola soy " + David.nombre);
		
		Persona Marcos = new Persona("Marcos", "Fernandez", 10, 1.24);
		System.out.println("Me llamo " + Marcos.nombre + " y me apellido " + Marcos.apellido + " tengo " + Marcos.edad + " y mido " + Marcos.estatura);	
		
	}
}
