package labs;

public class DisplayingArrays {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		
		//prints memory address of array
		System.out.println(intArray);
		
		intArray[0] = -5123;
		intArray[2] = 32;
		
		System.out.println(intArray[0]);
		
		//ArrayLength
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr.length);
	}
}
