import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio9 {
    public static void main(String[] args) {
        

        // Configuración de la conexión a la base de datos 'tienda'
        String url = "jdbc:mariadb://localhost:3306/tienda";
        String usuario = "root";
        String contrasena = "";

        // Consulta SQL para obtener los productos ordenados por precio descendente
        String sql = "SELECT id, nombre, precio FROM producto ORDER BY precio DESC";

        System.out.println("--- Listado de Productos (Ordenados por precio de mayor a menor) ---");

        try {
            // 1. Cargar el driver de MariaDB
            Class.forName("org.mariadb.jdbc.Driver");

            // 2. Establecer la conexión y preparar el statement y el resultset
            // Usamos try-with-resources para asegurar el cierre automático de todos los objetos JDBC
            try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
                 Statement sentencia = conexion.createStatement();
                 ResultSet resultado = sentencia.executeQuery(sql)) {

                // 3. Recorrer los resultados obtenidos
                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");

                    // Imprimir los datos por consola
                    System.out.printf("ID:  | Producto:  | Precio: ", id, nombre, precio);
                }

            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el driver de MariaDB.");
        } catch (SQLException e) {
            System.err.println("Error al conectar o consultar la base de datos: " + e.getMessage());
        }
    }
}
