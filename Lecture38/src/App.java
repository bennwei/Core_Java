import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "/Users/wei/Desktop/workspace/LearnJava/example.txt"; 
		File text = new File(fileName);
		Scanner in = new Scanner(text);
		
		int value = in.nextInt(); 
		System.out.println("Read value: " + value);
		
		in.nextLine();
		
		int count = 2; 
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count+ ": " + line);
			count++;
		}
		
		in.close();
	}

}
