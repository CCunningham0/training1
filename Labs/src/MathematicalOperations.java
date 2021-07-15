
public class MathematicalOperations {
	public static void main(String[] args) {
		//define variables
		int x = 5;
		int y = 3;
		int z;
		
		//addition
		z = x + y;
		System.out.println(z);
		
		//subtraction
		z = x - y;
		System.out.println(z);
		
		//multiplication
		z = x * y;
		System.out.println(z);
		
		//division
		z = x / y;
		System.out.println(z);
		
		//modulus
		z = x % y;
		System.out.println(z);
		
		//float vs. int
		float f = 3.6f;
		int i = 22;
		int result = (int) f + i;
		
		System.out.println(result);
	}
}
