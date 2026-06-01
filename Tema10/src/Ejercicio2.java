import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ejercicio2 {
    public static void main(String[] args) {
        // 1. Creamos la instancia del evento (JavaBean)
        EventoMusical festival = new EventoMusical(
            "Festival de Verano", 
            LocalDateTime.of(2024, 7, 20, 18, 0), 
            new BigDecimal("150000.00"),
            EventoMusical.GeneroMusical.INDIE
        );

        // 2. Añadimos artistas a la lista
        // Gracias a que inicializamos la lista en el constructor, no da error al usar .add()
        festival.getArtistas().add(new Artista("Vetusta Morla"));
        festival.getArtistas().add(new Artista("Love of Lesbian"));
        festival.getArtistas().add(new Artista("Izal"));
        
        // 3. Mostramos los datos por pantalla para verificar
        System.out.println("--- INFORMACIÓN DEL EVENTO (JavaBean) ---");
        System.out.println("Evento: " + festival.getNombre());
        System.out.println("Género: " + festival.getGenero());
        System.out.println("Fecha: " + festival.getFecha());
        System.out.println("Recaudación: " + festival.getRecaudacion() + "€");
        
        System.out.println("\nLista de Artistas Confirmados:");
        for (Artista a : festival.getArtistas()) {
            System.out.println("- " + a.getNombre());
        }
    }
}
