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
			selection = input.nextInt();
			
			switch(selection) {
			case 1: System.out.println("Please enter number to convert:");
				amount = input.nextInt() * 48;
				System.out.println(amount + " teaspoons\n");
				break;
			case 2: System.out.println("Please enter number to convert:");
				amount = input.nextInt() * 1.61;
				System.out.println(amount + " kilometers\n");
				break;
			case 3: System.out.println("Please enter number to convert:");
				amount = input.nextInt() * 0.83;
				System.out.println(amount + " imperial gallons\n");
				break;
			case 4: System.out.println("Quitting");
			 	input.close();
				menuSelection = 4;
			}
		}
	}
}
