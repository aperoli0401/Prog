public class Act_4 {

    public static void main(String[] args) {

        short max = 32767;     
        short min = -32768;    

        short siguiente = (short) (max + 1); 

        System.out.println("Valor máximo de short: " + max);
        System.out.println("Valor mínimo de short: " + min);
        System.out.println("Valor siguiente al máximo: " + siguiente);

        if (siguiente == min) {
            System.out.println("El tipo short SE comporta de forma cíclica.");
        } else {
            System.out.println("El tipo short NO se comporta de forma cíclica.");
        }
    }
}