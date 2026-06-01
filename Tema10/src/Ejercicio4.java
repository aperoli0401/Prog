import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ejercicio4 {
    public static void main(String[] args) {
         // 1. Crear el EntityManagerFactory. 
        // Al indicar "eventos.odb", ObjectDB creará el archivo automáticamente si no existe.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos.odb");
        
        // 2. Crear el EntityManager para interactuar con la base de datos
        EntityManager em = emf.createEntityManager();

        try {
            // 3. Iniciar una transacción (necesaria para operaciones de escritura/insert)
            em.getTransaction().begin();

            // 4. Instanciar dos nuevos eventos musicales
            EventoMusical evento1 = new EventoMusical(
                "Rock en el Parque", 
                LocalDateTime.of(2024, 6, 10, 21, 0), 
                new BigDecimal("25000.50"), 
                EventoMusical.GeneroMusical.ROCK
            );

            EventoMusical evento2 = new EventoMusical(
                "Noche de Jazz", 
                LocalDateTime.of(2024, 7, 5, 22, 30), 
                new BigDecimal("8400.00"), 
                EventoMusical.GeneroMusical.JAZZ
            );

            // 5. Persistir los objetos (equivalente al INSERT de SQL)
            em.persist(evento1);
            em.persist(evento2);

            // 6. Confirmar los cambios
            em.getTransaction().commit();
            System.out.println("Base de datos 'eventos.odb' creada y eventos insertados con éxito.");

        } catch (Exception e) {
            // Si algo falla, revertimos la transacción para evitar datos corruptos
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // 7. Cerrar siempre los recursos
            em.close();
            emf.close();
        }
    }
}
