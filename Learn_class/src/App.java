class Person {
	// Instance variables (data or state)
	// classes can contain
	String name;
	int age;
	
	// 1. Data
	// 2. Subroutine (methods)
	
	void speak() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is " + name + " and I am " + age+ " years old!");
	    }	
	}
	void sayHello() {
		System.out.println("Hello there!");
	}
}



public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Eric Liao";
		person1.age = 30;
		person1.speak();
		person1.sayHello();
		
		System.out.println(person1.name);
		
		Person person2 = new Person();
		person2.name = "Sara Smith";
		person2.age = 29;
		person2.speak();
		person2.sayHello();
		System.out.println(person2.name);
		

	}

}
