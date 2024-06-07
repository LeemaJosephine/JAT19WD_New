package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Four");
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("Linked HashSet");
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Four");
		
		
		Iterator itr1 = set1.iterator();
		
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
		
		System.out.println("TreeSet");
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("one");
		set2.add("Two");
		set2.add("Three");
			
		for(String se : set2) {
			System.out.println(se);
		}
		
		System.out.println();
		System.out.println("Set to List");
		List<String> lst = new ArrayList<String>(set1);
		
		for(int i = 0; i < lst.size();i++) {
			
			System.out.println(lst.get(i));
		}
	
	}

}
