import java.util.Scanner;

/*
 * Zachariah Zatina
 * 
 * This program takes user input and displays a table of
 * squares and cubes up to the inputed number
 * 
 */
public class LabThree {

	public static void main(String[] args) {
		// Variable list
		Scanner scnr = new Scanner(System.in);
		int num;
		char cont = 'y';
		
		// While loop to ask the user if they want to go again
		while (cont == 'y' || cont == 'Y') {
			
			// Integer enter part
			System.out.print("Enter an integer: ");
			num = scnr.nextInt();
			scnr.nextLine();
			System.out.println("");
			
			// Creating a format for all outputs using the format type to use
			String format = "%1$-10s %2$-10s %3$-15s \n";
			System.out.format(format, "Number", "Squared", "Cubed");
			System.out.format(format, "======", "=======", "=====");
			
			// For loop to square and cube i until it reaches the num and outputs in the correct format.
			for (int i = 1; i <= num; i++) {
				System.out.format(format, i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			}
			
			// Part that decides whether or not the entire code runs again based on user input.
			System.out.println("");
			System.out.print("Would you like to continue? (y/n): ");
			cont = scnr.nextLine().charAt(0);
			System.out.println("");
		}
		
		// Goodbye statement
		System.out.println("");
		System.out.println("Goodbye!");
		scnr.close();
	}

}
