
public class Lecture25 {

	public static void main(String[] args) {
		//Inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " "; 
		info += "I am a builder.";
		
		System.out.println(info);
		// more memory efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("My name is Rob.") //method chaining
		.append(" ")
		.append("I am a player!");
		
		System.out.println(sb2.toString());
		//// Formatting strings////
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline!");
		System.out.println("More text");
		
		System.out.printf("total cost %d; quantity is %d!", 5, 120);
		System.out.printf(" total cost %10d; quantity is %10d", 5, 120);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		System.out.printf("Total value: %.2f\n", 5.687);
		System.out.printf("Total value: %-10.1f\n", 343.684447);
	}

}
