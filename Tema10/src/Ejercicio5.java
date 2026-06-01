import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Ejercicio5 {
 public static void main(String[] args) {
    // 1. Conexión a la base de datos existente
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos.odb");
    EntityManager em = emf.createEntityManager();

    try {
        // --- PARTE 1: Recuperar el primer evento por IDENTIFICADOR ---
        // Según la lógica de contadorId += 10, el primer evento tiene el ID 0.
        System.out.println(">>> 1. Recuperando primer evento por ID (método find) <<<");
        EventoMusical primerEvento = em.find(EventoMusical.class, 0L);
        imprimirEvento(primerEvento);

        // --- PARTE 2: Recuperar el segundo evento con JPQL (QUERY ESTÁTICA) ---
        // El segundo evento tiene el ID 10. La query estática tiene el valor incrustado.
        System.out.println("\n>>> 2. Recuperando segundo evento (JPQL Estático) <<<");
        TypedQuery<EventoMusical> queryEst = em.createQuery(
            "SELECT e FROM EventoMusical e WHERE e.id = 10", EventoMusical.class);
        EventoMusical segundoEst = queryEst.getSingleResult();
        imprimirEvento(segundoEst);

        // --- PARTE 3: Recuperar el segundo evento con JPQL (QUERY DINÁMICA) ---
        // Usamos parámetros con nombre (:idBuscado) para que la consulta sea dinámica y segura.
        System.out.println("\n>>> 3. Recuperando segundo evento (JPQL Dinámico) <<<");
        TypedQuery<EventoMusical> queryDin = em.createQuery(
            "SELECT e FROM EventoMusical e WHERE e.id = :idBuscado", EventoMusical.class);
        queryDin.setParameter("idBuscado", 10L); // Asignamos el valor en tiempo de ejecución
        
        EventoMusical segundoDin = queryDin.getSingleResult();
        imprimirEvento(segundoDin);

    } catch (Exception e) {
        System.err.println("Error al consultar la base de datos: " + e.getMessage());
    } finally {
        // Es obligatorio cerrar los recursos para liberar la base de datos
        em.close();
        emf.close();
    }
 }

 /**
  * Método auxiliar para imprimir los detalles de un evento musical de forma legible.
  */
 private static void imprimirEvento(EventoMusical e) {
    if (e != null) {
        System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre() + " | Género: " + e.getGenero());
        System.out.println("Fecha: " + e.getFecha() + " | Recaudación: " + e.getRecaudacion() + "€");
        System.out.println("Artistas: " + e.getArtistas());
    } else {
        System.out.println("No se encontró el evento solicitado.");
    }
 }
}
