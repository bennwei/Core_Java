class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


public class Learn_setters {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		//frog1.name = "Sertie";
		//frog1.age = 1;
		
		frog1.setName("Sertie");
		frog1.setAge(1);
		String name = frog1.getName();
		int age = frog1.getAge();
		
		System.out.println(frog1.getName());
		System.out.println("The frog's name is " + name + " and its age is " + age);

	}

}
