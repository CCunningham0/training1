package July19;

public class LinearSearch {
	public static void main(String[] args) {
		char letter = 'b';
		char[] letters = {'a', 'b', 'c'};
		
		LinearSearch ls = new LinearSearch();
		
		System.out.println(ls.findLetter(letter, letters));
	}
	
	public int findLetter(char target, char[] data) {
		if (data == null) return -1;
		
		int result = -1;
		
		for (int i = 0; i < data.length; i++) {
			char temp = data[i];
			if (temp == target) {
				return i;
			}
		}
		
		return result;
	}
}
