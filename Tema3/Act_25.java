import java.util.Random;
import java.util.Scanner;

public class Act_25 {
    
    @SuppressWarnings("ConvertToTryWithResources") // Este comando lo genera el visual studio para obviar los warnings y que el codigo no se vea feo10
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int correctas = 0;

        while (true) {
            // Generar dos números aleatorios entre 1 y 100
            int a = rand.nextInt(100) + 1;
            int b = rand.nextInt(100) + 1;

            System.out.print("¿Cuánto es " + a + " + " + b + "? ");
            int respuesta = sc.nextInt();

            if (respuesta == a + b) {
                System.out.println("¡Correcto!\n");
                correctas++;
            } else {
                System.out.println("Incorrecto. El resultado era: " + (a + b));
                break;
            }
        }

        System.out.println("Has realizado correctamente " + correctas + " operaciones.");
        sc.close();
    }
}
