package day14;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		list.add("Jose");
		list.add("Divya");
		list.add("Kavin");
		list.add("Leema");
		list.add("Kan");
		list.add("Lee");
		
		System.out.println("Using for each:");
		for(String ls : list) {
			
			System.out.println(ls);
		}
		
		list.remove("Jose");
		list.remove(1);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}

}
