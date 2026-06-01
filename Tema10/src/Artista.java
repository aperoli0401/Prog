import javax.persistence.Embeddable;
import java.io.Serializable;

/** Marcamos la clase como embebible para que sus datos se guarden dentro de la tabla del evento */
@Embeddable
public class Artista implements Serializable {
    private String nombre;

    // Constructor vacío
    public Artista() {
    }

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}