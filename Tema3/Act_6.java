import java.util.Scanner;

public class Act_6 {

    
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce el radio de la circunferencia: ");
            double radio = sc.nextDouble();
            
            
            double longitud = 2 * PI * radio;
            double area = PI * radio * radio;
            
            
            System.out.println("Longitud de la circunferencia: " + longitud);
            System.out.println("Área de la circunferencia: " + area);
        }
    }
}
