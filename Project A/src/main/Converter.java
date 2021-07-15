package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
		int selection;
		double amount;
		Converter ct = new Converter();
		
		while (menuSelection != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			
			Scanner input = new Scanner(System.in);
			selection = (int)getInput();
			
			switch(selection) {
			case 1: System.out.println("Please enter number to convert:");
				amount = getInput() * 48;
				System.out.println(amount + " teaspoons\n");
				break;
			case 2: System.out.println("Please enter number to convert:");
				amount = getInput() * 1.61;
				System.out.println(amount + " kilometers\n");
				break;
			case 3: System.out.println("Please enter number to convert:");
				amount = getInput() * 0.83;
				System.out.println(amount + " imperial gallons\n");
				break;
			case 4: System.out.println("Quit application");
			 	input.close();
				menuSelection = 4;
				return;
			default: System.out.println("Please enter a number between 1 and 4\n");
				break;
			}
		}
	}
	
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		boolean validInput = false;
		
		// check input for int or double type
		while (!validInput) {			
			if (!scan.hasNextInt()) {
				if (!scan.hasNextDouble()) {
					System.out.println("Please enter a number");
					scan.next();
				} else {
					return scan.nextDouble();
				}
			} else {
				return (double)scan.nextInt();
			}
		}
		scan.close();
		return -1;
	}
}
