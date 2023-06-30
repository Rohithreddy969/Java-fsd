package collection;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Ram", 1245);
		td.put("Rahim", 1345);
		
		for(Entry<String, Integer> m: td.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}

}
