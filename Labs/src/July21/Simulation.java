package July21;

import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) {
		try {
			getInput();
		} catch (EvenNumberException e) {
			e.printStackTrace();
		}
	}
	
	public static void getInput() throws EvenNumberException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You've typed: " + line);
		
		if (isEven(line)) {
			try {
				throw new EvenNumberException();
			} catch (EvenNumberException e) {
				e.printStackTrace();
			} finally {
				in.close();
			}
 		}
	}
	
	public static boolean isEven(String num) {
		int value = Integer.parseInt(num);
		return (value % 2 == 0);
	}
}
