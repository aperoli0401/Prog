package ejercicio_3;

public class Car extends Vehicle{
	private int numberOfDoors;

	public Car(String string, String string2, int i, FuelType diesel, int j) {
	
	}

	@Override
	public double calculateSpeed() {
		return 0;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
