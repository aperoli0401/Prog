import java.sql.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        

        String url = "jdbc:mariadb://localhost:3306/tienda";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            // Obtenemos el objeto DatabaseMetaData
            DatabaseMetaData meta = conn.getMetaData();

            // 1. Información de la conexión y sistema
            System.out.println("--- INFORMACIÓN GENERAL ---");
            System.out.println("Usuario: " + meta.getUserName());
            System.out.println("URL: " + meta.getURL());
            System.out.println("SGBD: " + meta.getDatabaseProductName());
            System.out.println("Driver: " + meta.getDriverName() + " v" + meta.getDriverVersion());

            // 2. Tablas de la base de datos
            System.out.println("\n--- TABLAS EN 'tienda' ---");
            // getTables(catalog, schema, namePattern, types)
            try (ResultSet rsTablas = meta.getTables(null, null, null, new String[]{"TABLE"})) {
                while (rsTablas.next()) {
                    // La columna 3 es el TABLE_NAME
                    System.out.println("Tabla encontrada: " + rsTablas.getString(3));
                }
            }

            // 3. Columnas de la tabla 'producto'
            System.out.println("\n--- COLUMNAS DE LA TABLA 'producto' ---");
            // getColumns(catalog, schema, tableName, columnNamePattern)
            try (ResultSet rsCols = meta.getColumns(null, null, "producto", null)) {
                while (rsCols.next()) {
                    String nombreCol = rsCols.getString("COLUMN_NAME");
                    String tipoCol = rsCols.getString("TYPE_NAME");
                    int tamano = rsCols.getInt("COLUMN_SIZE");
                    
                    System.out.printf("Columna: %-15s | Tipo: %-10s | Tamaño: %d%n", 
                                      nombreCol, tipoCol, tamano);
                }
            }
            
            /* 
             * NOTA SOBRE METADATOS:
             * Los metadatos son fundamentales para herramientas de administración 
             * o para programar software que deba adaptarse a bases de datos 
             * cuya estructura no conoce de antemano (como un IDE o un ORM).
             */

        } catch (SQLException e) {
            System.err.println("Error obteniendo metadatos: " + e.getMessage());
        }
    }
}
