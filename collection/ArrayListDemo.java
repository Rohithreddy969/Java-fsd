package collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Pune");
		cities.add("Bengaluru");
		cities.add("Chennai");
		
		for (String t :  cities) {
			System.out.println(t);
		}
		
		System.out.println("Total items in the array-list = " + cities.size());
		
		System.out.println("Item at index 1 = " + cities.get(1));
		
		System.out.println("Index of Pune = " + cities.indexOf("Pune"));
		
		System.out.println("Is mumbai present in the list? " + cities.contains("mumbai"));
	}
	
}
