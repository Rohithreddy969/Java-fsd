package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Munbai");
		cities.add("Delhi");
		cities.add("Hyderabad");
		
		for (String t :  cities) {
			System.out.println(t);
		}
		
		System.out.println("Total items in the linked-list = " + cities.size());
		
		System.out.println("Item at index 1 = " + cities.get(1));
		
		System.out.println("Index of Delhi = " + cities.indexOf("Delhi"));
		
		System.out.println("Is Goa present in the list? " + cities.contains("Goa"));
	}

}
