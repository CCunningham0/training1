package labs;

public class Basics {
	public static void main(String[] args) {
		// first way to create array
		// empty array with fixed size of 5
		int[] numbers = new int[5];
		
		//second way to create array
		//with values
		int[] numbersTwo = new int[] {4,7,0,12,77};
	
		// third way to create array
		// no "new int[]" = anonymous array assignment
		// (does not declare the datatype, so infered based on values)
		// ***can only assign anonymous array to reference variable
		// when you declare reference variable in the same line
		int[] numbersThree = {5,66,80,100};
		
		double[] doubles = new double[] {1.0,2.5,7.4};
		numbersThree[0] = (int)doubles[2];
		doubles[0] = numbersThree[1];
		int[] numbersFour = numbersThree;
		
		System.out.println(numbersFour);
		System.out.println(numbersThree[0]);
	}
}
