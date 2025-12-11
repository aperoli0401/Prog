import java.util.Scanner;
public class Act_14 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime cual es tu nota del primer trimestre: ");
        int primer = sc.nextInt();
        
        System.out.print("Dime cual es tu nota del segundo trimestre: ");
        int segundo = sc.nextInt();

        System.out.print("Dime cual es tu nota del tercer trimestre: ");
        int tercer = sc.nextInt();
        
        nota_media = primer + segundo + tercer;
        
        System.out.print("La nota media es: " + nota_media + a );
                
        double a = (int)nota_media;

    }
    
}
