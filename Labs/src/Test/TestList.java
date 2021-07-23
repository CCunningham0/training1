package Test;

import July22.List;

public class TestList {
	public static void main(String[] args) {
		List list = new List();
		list.set(0,  "Apple");
		System.out.println(list.get(0));
		
		int index = list.add("banana");
		
		System.out.println(index);
		System.out.println(list.get(index));
		
		list.add("Canteloupe");
		list.add("Dragonfruit");
		list.add("Elderberry");
		list.add("Fig");
		
		String value = list.remove();
		System.out.println(value);
		
		value = list.remove();
		System.out.println(value);
	}
}
