package labs;

public class WhileLoops {
	public static void main(String[] args) {
		boolean on = true;
		
		//while loop
		while (on) {
			System.out.println("Inside of while loop");
			on = false;
		}
		
		//do-while loop
		//*always execute at least once
		on = false;
		do {
			System.out.println("Inside of do-while loop");
		} while (on);
		
		//for loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
