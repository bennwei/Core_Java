import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is the price of the item?");
		Scanner keyboard = new Scanner(System.in);
		double price = keyboard.nextDouble();
		System.out.println("you typed in "+price);
		
		double newPrice = price * .7;
		System.out.println("The price after 30% off is " + newPrice);
		p
	}

}
