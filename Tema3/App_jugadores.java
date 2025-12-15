    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;

    public class App_jugadores {

        public static void main(String[] args) {

            List alumnos = Arrays.asList(
                    "Raul MIAMI", "Carreras fake", "Perales", "Antonny (del betis)", "Copet's", "Raul malo", "Adelai", "Pinos", "Oscar", "Jonhal", "Hoce Marí", ""
            );

            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el tamaño de los equipos: ");
            int tamEquipo = sc.nextInt();

            crearEquipos(alumnos, tamEquipo);
        }

        public static void crearEquipos(List alumnos, int tamEquipo) {

            List copia = new ArrayList(alumnos);
            Collections.shuffle(copia);

            int numEquipo = 1;

            for (int i = 0; i < copia.size(); i += tamEquipo) {
                System.out.println("\nEquipo " + numEquipo + ":");

                for (int j = i; j < i + tamEquipo && j < copia.size(); j++) {
                    System.out.println(" - " + copia.get(j));
                }

                numEquipo++;
            }
        }
    }
