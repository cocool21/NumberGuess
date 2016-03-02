import java.util.Scanner;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber,other, guess ;//guess is initialized to 0
		
		secretNumber = 123;
		other=5;
		System.out.println("I'm thinking of a number between 1 and 1000");
		System.out.println("Enter the number:");
		guess = keyboard.nextInt();
		
		
		while ( guess != secretNumber && guess != other )
		{
			System.out.println("\nYou are wrong. Try again.");
			System.out.println("Enter the number: ");
			guess = keyboard.nextInt();
		}
		System.out.println("You are correct. You win a prize!");
		keyboard.close();
	}
}
