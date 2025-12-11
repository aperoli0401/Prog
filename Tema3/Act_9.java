import java.util.Scanner;

public class Act_9 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = sc.nextBoolean();
            
        boolean permiso = (!llueve && tareasTerminadas) || irBiblioteca;

        System.out.println("¿Puedes salir a la calle?: " + permiso);
        sc.close();
    }
}

