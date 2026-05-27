package ejercicio_3;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Car("co", "asdf", 1111, FuelType.DIESEL, 3);
		Vehicle v2 = new Car("co", "asdf", 1111, FuelType.DIESEL, 3);
		Vehicle v3 = new Car("co", "asdf", 1111, FuelType.DIESEL, 3);
		Vehicle v4 = new Car("co", "asdf", 1111, FuelType.DIESEL, 3);
		Vehicle v5 = new Car("co", "asdf", 1111, FuelType.DIESEL, 3);
		Vehicle v6 = new Car("co", "asdf", 1111, FuelType.DIESEL, 3);
		
		v1.getTotalVehicles();
		v1.calculateSpeed();
	}

}
