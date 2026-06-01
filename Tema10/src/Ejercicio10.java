import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio10 {
    public static void main(String[] args) {
        

        String url = "jdbc:mariadb://localhost:3306/tienda";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            // 1. Borrado de todos los registros
            // Usamos Statement porque es una consulta estática y sencilla
            try (Statement st = conn.createStatement()) {
                int eliminados = st.executeUpdate("DELETE FROM producto");
                System.out.println("Se han eliminado " + eliminados + " registros previos.");
            }

            // 2. Inserción de 3 nuevos registros
            // Usamos PreparedStatement por seguridad y eficiencia en inserciones
            String sqlInsert = "INSERT INTO producto (id, nombre, descripcion, precio, pais) VALUES (?, ?, ?, ?, ?)";
            
            try (PreparedStatement ps = conn.prepareStatement(sqlInsert)) {
                // Producto 1
                ps.setInt(1, 1);
                ps.setString(2, "Manzana");
                ps.setString(3, "Manzana roja de calidad");
                ps.setDouble(4, 2.50);
                ps.setString(5, "Espana");
                ps.executeUpdate();

                // Producto 2
                ps.setInt(1, 2);
                ps.setString(2, "Pera");
                ps.setString(3, "Pera de agua dulce");
                ps.setDouble(4, 1.80);
                ps.setString(5, "Espana");
                ps.executeUpdate();

                // Producto 3
                ps.setInt(1, 3);
                ps.setString(2, "Naranja");
                ps.setString(3, "Naranja para zumo");
                ps.setDouble(4, 1.20);
                ps.setString(5, "Espana");
                ps.executeUpdate();

                System.out.println("Se han insertado 3 nuevos productos con éxito.");
            }

        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }
}
