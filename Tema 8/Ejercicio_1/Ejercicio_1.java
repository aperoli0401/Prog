package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import Ejercicio_1.*;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// 1
		List listaNula = null ;
		System.out.println(listaNula);
		
		// 2
		List listaVacia = new ArrayList();
		System.out.println(listaVacia);
		
		// 3
		Persona alejandro = new Persona();
		alejandro.setNombre("alex");
		Persona manuel = new Persona();
		Persona ernesto = new Persona();
		listaVacia.add(alejandro);
		listaVacia.add(manuel);
		listaVacia.add(ernesto);
		listaVacia.add(manuel);
		System.out.println(listaVacia);
		
		// 4
		System.out.println(listaVacia.getLast());
		
		// 5
		Persona persona;
		persona = (Persona)listaVacia.getFirst();
		persona.setNombre("alexander");
		
		// En una línea
		((Persona)listaVacia.getFirst()).setNombre("alexander");
		
		// 6
		int indiceCentral = listaVacia.size()/2 - 1;
		listaVacia.remove(indiceCentral);
		System.out.println(listaVacia);
		
		//8
		for (int i = 0; i <= listaVacia.size(); i++) {
			System.out.println(listaVacia.get(i));
		}
		
		//9
		Persona antonio = new Persona();
		listaVacia.add(antonio);
		if (listaVacia.contains(antonio)) {
			System.out.println("antonio esta en la lista");
		}else {
			System.out.println("antonio no esta en la lista");
		}
	}
}
