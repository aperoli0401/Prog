package ejercicio_1;

public class ejercicio1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("COMIENZO PROGRAMA DIVISIÓN");
			int dividendo = 5;
			int divisor = 0;
			System.out.println("Resultado :" + dividendo / divisor);
		}catch (Exception ex) {
			ex.printStackTrace();
		}catch (Throwable ex){
			ex.printStackTrace();
		}finally {
			System.out.println("FIN DEL PROGRAMA");
		}
	}
	
	private static float division(int dividendo, int divisor) throws Exception{
		return dividendo / divisor;
	}
}
