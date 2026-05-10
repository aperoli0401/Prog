import java.io.FileWriter;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(10000); // Espera 10 segundos
        
        // No hemos puesto ni flush() ni close()


        // 1. Porque java cuando manda los datos no envia caracter por caracter sino que los acumula todos en un buffer 

        // 2. Para solucionar el problema vamos a usar la sentencia try, esto hace se cierre el archivo automaticamente al terminar el bloque.

        // Código corregido
        try (FileWriter escritor = new FileWriter("prueba.txt")) {
            
            escritor.write("¿Donde está mi texto?");
            
            // Si quieres que el texto aparezca ANTES del sleep sin cerrar el archivo:
            escritor.flush(); 
            
            System.out.println("He escrito y forzado el volcado con flush().");
            System.out.println("ahora el archivo si tiene texto");
            
            Thread.sleep(10000); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Al llegar aquí, el close() ya se ha ejecutado automáticamente
    }
}
