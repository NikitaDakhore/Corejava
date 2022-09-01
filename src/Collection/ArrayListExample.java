package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1  = {"abc","pqr","xyz"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("john");
		list1.add("leeana");
		list1.add("priyanka");
		list1.add("rohan");
		list1.add("laurence");
		
		System.out.println("list is this " + list1);
		System.out.println("size of arraylist is " + list1.size());
		
		list1.remove(1);
		
		System.out.println("list is this after removing leeana " + list1);
		System.out.println("size of array list is " + list1.size());
		
		System.out.println("the data at 4th position is " + list1.get(3));
		
		list1.set(0, "james");
		System.out.println("list is this after replacing john " + list1);
		
		list1.add(1,"leeana");
		System.out.println("list is this after adding leeana again " + list1);
		
		Collections.sort(list1);
		System.out.println("list is this after sort " + list1);
		
		for(int index=0;index<list1.size();index++) {
			
			System.out.println(list1.get(index));
			
		}

		for(String name:list1) {
			System.out.println(name);
		}
		
		for(int index=0;index<list1.size();index++) {
			if(list1.get(index).equals("priyanka")) {
				System.out.println(index);
				break;
			}
		}

	}

}
