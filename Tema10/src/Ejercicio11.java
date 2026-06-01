import java.sql.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        

        String url = "jdbc:mariadb://localhost:3306/tienda";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            // --- PARTE 1: Uso de execute() ---
            // El método execute() devuelve 'true' si el resultado es un ResultSet (SELECT)
            // y 'false' si es un conteo de actualización (INSERT, UPDATE, DELETE).
            String sqlEsp = "SELECT * FROM producto WHERE pais = 'Espana'";
            try (Statement st = conn.createStatement()) {
                boolean esSelect = st.execute(sqlEsp);
                
                if (esSelect) {
                    ResultSet rs = st.getResultSet();
                    System.out.println("--- Productos de España (usando execute()) ---");
                    while (rs.next()) {
                        System.out.println(rs.getString("nombre") + " - " + rs.getString("pais"));
                    }
                }
            }

            // --- PARTE 2: Procesamiento por Lotes (Batch) ---
            // El Batch permite enviar varias sentencias SQL juntas para reducir latencia.
            String insertBatch = "INSERT INTO producto (id, nombre, descripcion, precio, pais) VALUES (?, ?, ?, ?, ?)";
            
            try (PreparedStatement ps = conn.prepareStatement(insertBatch)) {
                // Desactivamos el autocommit para gestionar nosotros la transacción (recomendado en batch)
                conn.setAutoCommit(false);

                // 1. Kiwi
                ps.setInt(1, 4);
                ps.setString(2, "kiwi");
                ps.setString(3, "Zaspri gold");
                ps.setDouble(4, 120);
                ps.setString(5, "Nueva Zelanda");
                ps.addBatch(); // Añadimos al lote

                // 2. Perito
                ps.setInt(1, 5);
                ps.setString(2, "perito");
                ps.setString(3, "Peritos de Tavizna");
                ps.setDouble(4, 18);
                ps.setString(5, "Espana");
                ps.addBatch();

                // 3. Plátano
                ps.setInt(1, 6);
                ps.setString(2, "plátano");
                ps.setString(3, "Plátano canario");
                ps.setDouble(4, 40);
                ps.setString(5, "Espana");
                ps.addBatch();

                // Ejecutamos todo el lote
                int[] resultados = ps.executeBatch();
                conn.commit(); // Consolidamos los cambios
                
                System.out.println("\nBatch ejecutado. Registros insertados: " + resultados.length);

            } catch (SQLException e) {
                conn.rollback(); // Si falla el batch, deshacemos todo
                throw e;
            } finally {
                conn.setAutoCommit(true);
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
