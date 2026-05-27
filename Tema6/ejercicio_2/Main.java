package ejercicio_2;

public class Main {

	public static void main(String[] args) {
		Animal bobby = new Perro("Bobby");
		Animal michini = new Gato("Michini");
		Animal pintitas = new Vaca("Pintitas");
		
		bobby.informacion();
		bobby.hacerSonido();
		bobby.comer();
		
		michini.informacion();
		michini.hacerSonido();
		michini.comer();
		
		pintitas.informacion();
		pintitas.hacerSonido();
		pintitas.comer();
		
	}

}
