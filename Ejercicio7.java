public class Ejercicio7 {
    public static void main(String[] args) {
        File archivo = new File("notas.txt");

        // ESCRITURA (BufferedWriter + FileWriter)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write("Línea 1: Estudiando Java I/O");
            bw.newLine(); // Salto de línea automático
            bw.write("Línea 2: El buffering es eficiente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LECTURA (BufferedReader + FileReader)
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Leído: " + linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
