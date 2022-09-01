package Collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1," matt");
		map1.put(2," kate");
		map1.put(3," john");
		map1.put(4,"kathy ");
		map1.put(5," matt");
		map1.put(2," arpita");
		map1.put(100," sachin");  
		
		System.out.println("map1");
		System.out.println("data at 4th key is " + map1.get(4));
		System.out.println("data at 100th key is " + map1.get(100));
		
		map1.remove(100);
		System.out.println("map1");
		
		for(Integer key:map1.keySet()) {
			System.out.println("key is: " + key);
			System.out.println("value is: " + map1.get(key));
		}
		
	}


	}


