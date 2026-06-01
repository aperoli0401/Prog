import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos una instancia de EventoMusical usando el constructor con parámetros

        // El código da un fallo porque el constructor no exs
        EventoMusical miEvento = new EventoMusical(
            "Concierto de Rock Solidario", 
            LocalDateTime.of(2023, 12, 15, 21, 30), 
            new BigDecimal("25450.75")
        );

        // Mostramos la información del evento por consola
        System.out.println("Detalles del Evento Musical:");
        System.out.println("Nombre: " + miEvento.getNombre());
        System.out.println("Fecha y Hora: " + miEvento.getFecha());
        System.out.println("Recaudación: " + miEvento.getRecaudacion() + "€");

        /* 
         * RESPUESTAS A LAS CUESTIONES:
         * 
         * 1. ¿Cuándo conviene usar BigInteger en lugar de Integer?
         * Se debe usar BigInteger cuando el número entero que necesitamos manejar supera los límites 
         * de un 'int' (32 bits) o incluso de un 'long' (64 bits). BigInteger permite una precisión 
         * arbitraria, limitada únicamente por la memoria disponible del sistema.
         * 
         * 2. ¿Para qué sirve cada uno de los tipos: Date, Time, Timestamp y Calendar?
         * - Date (java.util.Date): Representa un instante específico en el tiempo con precisión de milisegundos. Está mayormente obsoleta.
         * - Time (java.sql.Time): Diseñada para JDBC, se enfoca únicamente en la parte de la hora (HH:mm:ss).
         * - Timestamp (java.sql.Timestamp): Utilizada en bases de datos para almacenar fecha y hora con precisión de nanosegundos.
         * - Calendar: Clase abstracta que proporciona métodos para convertir entre un instante específico y campos como AÑO, MES, DÍA, etc., permitiendo manipular fechas de forma más compleja que Date.
         * 
        
         */
    }
}
