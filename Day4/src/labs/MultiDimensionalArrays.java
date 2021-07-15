package labs;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][][] my3dArray = new int[3][3][3];
		
		//array index 0 points to index zero of another array which
		//points to index zero of third array, which will hold one
		my3dArray[0][0][0] = 1;
		System.out.println(my3dArray[0][0][0]);
		
		//creates 2d array (3x3)
		int[][] my2dArray = {{1,2,0}, {4,5,6}, {1,4,5}};
		
		System.out.println(my2dArray.length);
		System.out.println(my2dArray[1][2]);
	}
}
