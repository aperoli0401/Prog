import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        /* 
         * Enunciado:
         * Elimina de la base de datos el primer evento, pero antes haz una copia con otro id diferente. 
         * Realiza el borrado utilizando el identificador.
         * Después elimina el segundo utilizando JPQL. En este caso hazlo de dos formas nuevamente:
         * Con una query estática y con una query dinámica.
         */

        // 1. Conexión a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos.odb");
        EntityManager em = emf.createEntityManager();

        try {
            // --- PARTE 1: Copiar y eliminar el primer evento (ID 0) por identificador ---
            em.getTransaction().begin();
            
            // Localizamos el evento original
            EventoMusical original = em.find(EventoMusical.class, 0L);
            
            if (original != null) {
                // Para asegurar que el "nuevo ID" sea realmente diferente de los que ya existen (0 y 10),
                // creamos instancias vacías para avanzar el contador estático hasta 20.
                new EventoMusical(); // Genera ID 0
                new EventoMusical(); // Genera ID 10
                
                // Ahora creamos la copia (esta obtendrá el ID 20)
                EventoMusical copia = new EventoMusical(
                    original.getNombre() + " (Copia)", 
                    original.getFecha(), 
                    original.getRecaudacion(), 
                    original.getGenero()
                );
                copia.setArtistas(new ArrayList<>(original.getArtistas()));

                // Eliminamos el original usando el objeto recuperado
                em.remove(original);
                // Guardamos la copia
                em.persist(copia);
                
                System.out.println("Evento 1 eliminado. Se ha guardado una copia con ID: " + copia.getId());
            }
            em.getTransaction().commit();

            // --- PARTE 2: Eliminar el segundo evento (ID 10) usando JPQL Estático ---
            em.getTransaction().begin();
            Query qEstatica = em.createQuery("DELETE FROM EventoMusical e WHERE e.id = 10");
            int eliminadosEst = qEstatica.executeUpdate();
            em.getTransaction().commit();
            System.out.println("Eliminación JPQL Estática (ID 10) - Filas afectadas: " + eliminadosEst);

            // --- PARTE 3: Eliminar el segundo evento (ID 10) usando JPQL Dinámico ---
            // Aunque ya se haya borrado, ejecutamos la sintaxis dinámica para cumplir el enunciado.
            em.getTransaction().begin();
            Query qDinamica = em.createQuery("DELETE FROM EventoMusical e WHERE e.id = :idABorrar");
            qDinamica.setParameter("idABorrar", 10L);
            int eliminadosDin = qDinamica.executeUpdate();
            em.getTransaction().commit();
            System.out.println("Eliminación JPQL Dinámica (ID 10) - Filas afectadas: " + eliminadosDin);

        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
