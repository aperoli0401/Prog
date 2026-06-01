import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio8 {
    public static void main(String[] args) {
        // 1. Configuración de parámetros de conexión (Ajustar según tu base de datos local)
        // El protocolo para MariaDB es 'jdbc:mariadb://' seguido de host:puerto/base_de_datos
        String url = "jdbc:mariadb://localhost:3306/test"; 
        String usuario = "root";
        String contrasena = ""; 

        System.out.println("Intentando conectar con el servidor de base de datos...");

        try {
            // 2. Carga el driver JDBC de MariaDB en memoria.
            // Esto requiere haber añadido previamente el archivo 'mariadb-java-client.jar' a las librerías del proyecto.
            Class.forName("org.mariadb.jdbc.Driver");

            // 3. Intentamos obtener el objeto de conexión.
            // Usamos la estructura 'try-with-resources' para garantizar que la conexión se cierre
            // automáticamente al terminar el bloque, cumpliendo con la buena gestión de recursos.
            try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena)) {
                
                // Si llegamos aquí sin excepciones, la conexión es válida.
                if (conexion != null && !conexion.isClosed()) {
                    System.out.println("Conexión exitosa");
                }
            }

        } catch (ClassNotFoundException e) {
            // Se lanza si no se encuentra el archivo .jar del driver en el classpath
            System.err.println("No se pudo conectar: Driver JDBC no encontrado.");
        } catch (SQLException e) {
            // Se lanza por credenciales erróneas, servidor apagado o base de datos inexistente
            System.err.println("No se pudo conectar");
        }
    }
}
