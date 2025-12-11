import java.util.Scanner;

public class Act_3 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int anioActual = sc.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = sc.nextInt();

        int edad = anioActual - anioNacimiento;

        System.out.println("Tu edad es: " + edad + " años.");
        sc.close();
    }
}
