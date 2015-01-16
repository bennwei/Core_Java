
public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car started.");
	}

	public void windShiled() {
		System.out.println("Wiping windshield!");
	}
	
	public void showInfo() {
		System.out.println(name);
	}
}
