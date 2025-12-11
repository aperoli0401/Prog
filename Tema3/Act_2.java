import java.util.Scanner;
public class Act_2 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.print("Introduce tu edad: ");
            
            int edad = sc.nextInt();
            edad = edad + 1;
            
            System.out.println("Tu edad el año que viene sera: " + edad);
            sc.close();
        }
    }
