import java.util.Scanner;

public class Act_7 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        boolean mayorDeEdad = edad >= 18;

        System.out.println("¿Es mayor de edad? " + mayorDeEdad);

        sc.close();
    }
}

