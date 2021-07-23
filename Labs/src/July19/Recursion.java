package July19;

public class Recursion {
	public static void main(String[] args) {
		int input = 5;
		
		Recursion rc = new Recursion();
		System.out.println(rc.factorial(input));
	}
	
	public int factorial(int num) {
		if (num <= 0) return 0;
		if (num == 1) return 1;
		
		return num * factorial(num-1);
	}
}
