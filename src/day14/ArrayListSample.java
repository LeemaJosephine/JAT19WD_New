package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating array list
		
		ArrayList<String> list = new ArrayList<String>();
		
		// Add the elements
		
		list.add("Jose");
		list.add("Divya");
		list.add("Kavin");
		list.add("Leema");
		
		System.out.println("Direct print");
		
		System.out.println(list);
		
		// print the elements of array list
		
		System.out.println("Using for each:");
		for(String ls : list) {
			
			System.out.println(ls);
		}
		
		System.out.println("Using for loop");
		
		for(int i = 0; i < list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("Using Iterator");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		// access the element
		
		System.out.println("Get and Set methods");
		System.out.println("Before " + list.get(1));
		
		// changing the element
		
		list.set(1, "Tara");
		
		System.out.println("After " + list.get(1));
		
		// sorting
		System.out.println("Sorting");
		
		System.out.println("Before sorting: " +list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting " + list);
		
		list.remove(2);
		System.out.println(list);
		list.clear();
		System.out.println(list.size());
		
//		//User-defined
//		
//		Student s1 = new Student(10, "Lee");
//		Student s2 = new Student(20, "Jo");
//		Student s3 = new Student(30, "Jose");
//		
//		ArrayList<Student> ls = new ArrayList<Student>();
//		ls.add(s1);
//		ls.add(s2);
//		ls.add(s3);
//		
//		Iterator itr = ls.iterator();
//		
//		while(itr.hasNext()) {
//			
//			Student st = (Student) itr.next();
//			System.out.println(st.rollno+" "+st.name);
//		}
//		
		
	}

}
