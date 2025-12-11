
package holamundo;
import java.util.Scanner;
public class HolaMundo {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        java.time.LocalTime hora = java.time.LocalTime.now();
        System.out.println("La hora es: "+ hora);
        
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        System.out.println("Número"+ numero);
    }
    
}
