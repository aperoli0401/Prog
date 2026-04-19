public class Ejercicio_10 {
    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Mario", "Luna", 30));
        personas.add(new Persona("Zaira", "García", 25));
        personas.add(new Persona("Alberto", "Pérez", 25));
        personas.add(new Persona("Ana", null, 40)); 
        personas.add(new Persona("Beatriz", "Pérez", 20));

        System.out.println("Ordenado por Edad: ");
        personas.sort(Comparator.comparingInt(Persona::getEdad));
        personas.forEach(System.out::println);

        
        System.out.println("Ordenado por Apellidos: ");
        
        personas.sort(Comparator.comparing(Persona::getApellidos, Comparator.nullsFirst(String::compareTo)));
        personas.forEach(System.out::println);

        
        System.out.println("Ordenado por Apellidos, Nombre y Edad: ");
        
        Comparator<Persona> comparadorComplejo = Comparator
            .comparing(Persona::getApellidos, Comparator.nullsFirst(String::compareTo))
            .thenComparing(Persona::getNombre)
            .thenComparingInt(Persona::getEdad);

        personas.sort(comparadorComplejo);
        personas.forEach(System.out::println);
    }
}