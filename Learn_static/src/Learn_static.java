
class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	public void showName() {
		//System.out.println(name);
		System.out.println("Object's ID: " + id + ", " + description + ":" + name); // instance can access static methods
	}
	
	public static void showInfo() {
		System.out.println("Hello!");
		System.out.println(description); 
		// System.out.println(name); this will not work: static method can not access instance
		// variable
	}
}

public class Learn_static {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		//System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before creating object the count is " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating object the count is " + Thing.count);
		
		thing1.name = "bob";
		thing2.name = "sue";
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
