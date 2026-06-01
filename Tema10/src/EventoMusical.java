import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ElementCollection;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * POJO que representa un evento musical.
 * Implementa Serializable para cumplir con el estándar JavaBean.
 */
@Entity
public class EventoMusical implements Serializable {
    
    // Enumerado para el género musical
    public enum GeneroMusical {
        ROCK, POP, JAZZ, CLASSICAL, TECHNO, INDIE
    }

    // Constructor ejercicio 1
    public EventoMusical(String nombre, LocalDateTime fecha, BigDecimal recaudacion) {
            this(); // Invocamos al constructor vacío para inicializar el ID y la lista
            this.nombre = nombre;
            this.fecha = fecha;
            this.recaudacion = recaudacion;
            }


    // Lógica para la clave primaria incremental
    private static long contadorId = 0;
    @Id
    private long id;

    private String nombre;
    private LocalDateTime fecha;
    private BigDecimal recaudacion;
    private GeneroMusical genero;
    @ElementCollection
    private List<Artista> artistas;

    // Campo de control: usamos 'transient' para que no sea tenido en cuenta por la serialización
    // (o frameworks de persistencia como Hibernate/JPA), cumpliendo el enunciado.
    private transient int control;

    // Constructor vacío
    public EventoMusical() {
        this.id = contadorId;
        contadorId += 10; // Incremento de 10 en 10
        this.artistas = new ArrayList<>();
    }

    // Constructor con parámetros
    public EventoMusical(String nombre, LocalDateTime fecha, BigDecimal recaudacion, GeneroMusical genero) {
        this(); // Llama al constructor vacío para gestionar el ID y la lista
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
    }

    // Métodos Getter y Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }
}