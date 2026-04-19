public class Ejercicio_9 {
    public static void main(String[] args) {
        
        Set<Persona> listaNatural = new TreeSet<>();

        listaNatural.add(new Persona("Zaira", "García"));
        listaNatural.add(new Persona("Alberto", "Pérez"));
        listaNatural.add(new Persona("Mario", "Luna"));
        listaNatural.add(new Persona("Alberto", "Pérez")); 

        System.out.println("Orden Natural: ");
        
        System.out.println(listaNatural);

        Set<Persona> listaInsercion = new LinkedHashSet<>(listaNatural);
        
        
        listaInsercion.add(new Persona("Beatriz", "Sanz"));

        System.out.println("Orden de Inserción: ");
        System.out.println(listaInsercion);
    }
}