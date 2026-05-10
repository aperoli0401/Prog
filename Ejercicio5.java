public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();

        int edad = 0;
        boolean edadValida = false;

        // Bucle para controlar que la edad sea un entero
        while (!edadValida) {
            System.out.print("Introduce tu edad: ");
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
                edadValida = true;
            } else {
                System.out.println("Error: Por favor, introduce un número entero.");
                sc.next(); // Limpia el buffer para evitar un bucle infinito
            }
        }

        System.out.println("\n¡Hola, " + nombre + "! Tienes " + edad + " años.");
        sc.close();
    }
    }

