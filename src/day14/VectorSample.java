package day14;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vec = new Vector<String>();
		
		vec.add("Jose");
		vec.add("Divya");
		vec.add("Kavin");
		vec.add("Leema");
		
		System.out.println(vec.size());
		
		vec.remove(0);
		
		System.out.println("Using for each:");
		for(String ls : vec) {
			
			System.out.println(ls);
		}
		
		
		System.out.println(vec.get(2));
	}

}
