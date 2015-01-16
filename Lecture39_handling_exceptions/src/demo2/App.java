package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");

		try {
			FileReader fr = new FileReader(file);
			// will not be run if an exception is thrown.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file.toString());
			e.printStackTrace();
			System.out.println("Finished");
		}

	}

}
