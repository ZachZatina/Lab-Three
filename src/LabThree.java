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
		Scanner scnr = new Scanner(System.in);
		int num;
		char cont = 'y';

		while (cont == 'y' || cont == 'Y') {

			System.out.print("Enter an integer: ");
			num = scnr.nextInt();
			scnr.nextLine();
			System.out.println("");

			String format = "%1$-10s %2$-10s %3$-15s \n";
			System.out.format(format, "Number", "Squared", "Cubed");
			System.out.format(format, "======", "=======", "=====");

			for (int i = 1; i <= num; i++) {
				System.out.format(format, i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			}

			System.out.println("");
			System.out.print("Would you like to continue? (y/n): ");
			cont = scnr.nextLine().charAt(0);
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Goodbye!");
	}

}
