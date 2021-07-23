package July16;

import java.util.Scanner;

public class LabScanner {
	public static void Main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in a line and hit enter.");
		String line = scan.nextLine();
		
		System.out.println("You have typed: " + line);
		
		scan.close();
		
		String numbers = "1 2 3 5 7 9";
		scan = new Scanner(numbers);
		
		while (scan.hasNextInt()) {
			System.out.print(scan.nextInt());
		}
		
		scan.close();
	}
}
