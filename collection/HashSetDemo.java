package collection;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<>();
		
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Hyderabad");
		
		for (String t :  cities) {
			System.out.println(t);
		}
		
		System.out.println("Total items in the linked-list = " + cities.size());
		
		System.out.println("Is Goa present in the list? " + cities.contains("Bengaluru"));
	}

}
