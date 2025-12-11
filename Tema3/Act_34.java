import java.util.Scanner;

public class Act_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etiqueta = 0;
        int altura;
        int maxAltura = -1;
        int etiquetaMax = -1;

        while (true) {
            System.out.print("Introduce la altura del árbol (o -1 para terminar): ");
            altura = sc.nextInt();

            if (altura == -1) {
                break;
            }

            if (altura > maxAltura) {
                maxAltura = altura;
                etiquetaMax = etiqueta;
            }

            etiqueta++;
        }

        if (maxAltura == -1) {
            System.out.println("No se introdujeron datos.");
        } else {
            System.out.println("El árbol más alto es el de etiqueta " + etiquetaMax + " con " + maxAltura + " cm.");
        }

        sc.close();
    }
}

