public class Ejercicio8 {
    public static void main(String[] args) {
        File ruta = new File("datos.txt");

        // 1. Escritura eficiente con PrintWriter y BufferedWriter
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ruta)))) {
            pw.println("Línea 1: Introducción");
            pw.println("Línea 2: Conceptos Clave");
            pw.println("Línea 3: Conclusión");
        } catch (IOException e) {
            System.out.println("Error al escribir");
        }

        // 2. Lectura con BufferedReader para usar mark() y reset()
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            
            System.out.println("--- Inicio de la lectura ---");
            
            System.out.println(br.readLine()); // Lee: Línea 1
            
            // Queremos recordar esta posición antes de leer la Línea 2
            if (br.markSupported()) {
                System.out.println("-> Marcando posición aquí...");
                br.mark(100); // El número es el límite de caracteres que podemos leer antes de que la marca falle
            }

            System.out.println(br.readLine()); // Lee: Línea 2
            
            System.out.println("-> Volviendo a la marca (reset)...");
            br.reset(); 
            
            // Volvemos a leer la Línea 2
            System.out.println("Re-leyendo: " + br.readLine());
            System.out.println(br.readLine()); // Lee: Línea 3

        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}

