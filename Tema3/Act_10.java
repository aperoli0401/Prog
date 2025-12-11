import java.util.Scanner;

public class Act_10 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("¿Cuantos kilos de manzanas has vendido?: ");
        double manzanas = sc.nextDouble();
        
        System.out.print("¿Cuantos kilos de peras has vendido?: ");
        double peras = sc.nextDouble();
        
        peras = peras * 1.95;
        
        manzanas = manzanas * 2.35;
        
        System.out.print("El importe total es: " + peras + manzanas);

        sc.close();
    }
}
