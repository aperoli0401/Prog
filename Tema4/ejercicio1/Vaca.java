package ejercicio1;

public class Vaca {
    
	// Atributos 
    String nombre;
    String color;
    boolean hambre = true;
    
    // Métodos
    void comer(){
        hambre = false;
    }
    
    void mugir(){
        System.out.println("Muuuu!!!");
    }
}
