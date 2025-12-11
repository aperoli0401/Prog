public class Act_33 {
    public static int maximo(int a, int b, int c) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {

        int a = 90;
        int b = 42;
        int c = 12;

        int max = maximo(a, b, c);
        
        System.out.println("El máximo entre " + a + " y " + b + " y " + c + " es: " + max);
    }
}
