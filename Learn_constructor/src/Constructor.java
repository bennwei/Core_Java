
class Machine {
	private String name;
	private int code;
	
	public Machine() {
		
		this("Arnie", 0);
		System.out.println("Constructor running!");
		
	}
	
	public Machine(String name) {
		System.out.println("second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("3rd constructor running!");
		this.name = name;
		this.code = code;
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		//new Machine();
		
		// Machine machine2 = new Machine("Bernie");
		// Machine machine3 = new Machine("eric", 100);

	}

}
