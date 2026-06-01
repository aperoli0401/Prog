import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Ejercicio6 {
    public static void main(String[] args) {
        /* 
         * Enunciado:
         * Cambiale el nombre al primer evento para ponerlo en mayúsculas utilizando el identificador.
         * Cambia ahora el nombre al segundo evento para ponerlo también en mayúsculas, pero ahora utilizando JPQL. 
         * En este caso hazlo de dos formas nuevamente: Con una query estática y con una query dinámica.
         */

        // 1. Abrimos la conexión con la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos.odb");
        EntityManager em = emf.createEntityManager();

        try {
            // --- PARTE 1: Actualizar primer evento (ID 0) mediante el Identificador ---
            // Iniciamos transacción para persistir los cambios
            em.getTransaction().begin();
            
            // Buscamos el objeto por su ID (identificador)
            EventoMusical evento1 = em.find(EventoMusical.class, 0L);
            if (evento1 != null) {
                // Al ser un objeto "managed" (gestionado), basta con usar el setter para que se actualice al hacer commit
                evento1.setNombre(evento1.getNombre().toUpperCase());
                System.out.println("Evento 1 actualizado mediante identificador.");
            }
            em.getTransaction().commit();

            // --- PARTE 2: Actualizar segundo evento (ID 10) mediante JPQL Estático ---
            em.getTransaction().begin();
            // Query estática: la consulta es una cadena fija con los valores incrustados
            Query qEstatica = em.createQuery("UPDATE EventoMusical e SET e.nombre = UPPER(e.nombre) WHERE e.id = 10");
            int actualizadosEst = qEstatica.executeUpdate();
            em.getTransaction().commit();
            System.out.println("Evento 2 actualizado mediante JPQL Estático. Filas afectadas: " + actualizadosEst);

            // --- PARTE 3: Actualizar segundo evento (ID 10) mediante JPQL Dinámico ---
            em.getTransaction().begin();
            // Query dinámica: utilizamos parámetros (:idBusca) para que la consulta sea reutilizable y segura
            Query qDinamica = em.createQuery("UPDATE EventoMusical e SET e.nombre = UPPER(e.nombre) WHERE e.id = :idBusca");
            qDinamica.setParameter("idBusca", 10L);
            
            int actualizadosDin = qDinamica.executeUpdate();
            em.getTransaction().commit();
            System.out.println("Evento 2 actualizado mediante JPQL Dinámico. Filas afectadas: " + actualizadosDin);

        } catch (Exception e) {
            // Si algo falla, revertimos cualquier transacción activa
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error durante la actualización: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cerramos recursos
            em.close();
            emf.close();
        }
    }
}
