
public class ConditionalBlocks {
	public static void main(String[] args) {
		//Conditional block
		boolean b = false;
		
		if (b) {
			System.out.println("Inside if-statement");
		}
		
		System.out.println("Outside if-statement");
		
		//Variant conditional block
		boolean a = false;
		
		if (a) {
			System.out.println("Inside if-statement");
		} else {
			System.out.println("Inside else-statement");
		}
		
		System.out.println("Outside if-statement");
		
		//Nested if-statement
		boolean firstCondition = true;
		boolean secondCondition = false;
		
		if (firstCondition) {
			System.out.println("Inside if-statement");
			
			if (secondCondition) {
				System.out.println("Inside nested if-statement");
			} else {
				System.out.println("Inside else-statement");
			}
		}
		
		System.out.println("Outside if-statement");
		
		//Else-if-statement
		boolean cond1 = false;
		boolean cond2 = true;
		
		if (cond1) {
			System.out.println("Inside if-statement");
			
			if (cond2) {
				System.out.println("Inside nested if-statement");
			} else if (cond2) {
				System.out.println(5);
			} else {
				System.out.println("Inside else-statement");
			}
		}
		
		System.out.println("Outside if-statement");
	}
}
