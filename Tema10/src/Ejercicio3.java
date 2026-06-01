import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ejercicio3 {
    public static void main(String[] args) {
        

        // Creamos varios eventos para comprobar que el ID se incrementa de 10 en 10
        EventoMusical e1 = new EventoMusical("Rock in Rio", LocalDateTime.now(), new BigDecimal("500000"), EventoMusical.GeneroMusical.ROCK);
        EventoMusical e2 = new EventoMusical("Tomorrowland", LocalDateTime.now(), new BigDecimal("900000"), EventoMusical.GeneroMusical.TECHNO);
        EventoMusical e3 = new EventoMusical("Jazz al Parque", LocalDateTime.now(), new BigDecimal("15000"), EventoMusical.GeneroMusical.JAZZ);



        // Mostramos resultados
        System.out.println("ID Evento 1: " + e1.getId() + " - Nombre: " + e1.getNombre());
        System.out.println("ID Evento 2: " + e2.getId() + " - Nombre: " + e2.getNombre());
        System.out.println("ID Evento 3: " + e3.getId() + " - Nombre: " + e3.getNombre());

        
    }
}
