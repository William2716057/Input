import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		//create scanner object to read input from user
		Scanner scanner = new Scanner(System.in);
		//ask for name
		System.out.print("What is your name?");
		//read as string
		String name = scanner.nextLine();
		//print greeting
		System.out.println("Hello " + name);
		//scanner needs to be closed
		scanner.close();
	}
}
