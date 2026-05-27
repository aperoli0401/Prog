package ejercicio_3;

public class Motorcycle extends Vehicle{
	private boolean hasSidecar;
	
	Motorcycle(boolean hasSidecar){
		super();
		this.hasSidecar = hasSidecar;
	}

	@Override
	public double calculateSpeed() {
		return 0;
	}
}
