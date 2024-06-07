package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"Apple","Orange","Grapes","Banana"};
		
		System.out.println("Array before convesion : " + Arrays.toString(arr));
		
		// convert to List
		List<String> list = Arrays.asList(arr);
		
		System.out.println("Using Arrays.asList ");
		for(String ls : list) {
			
			System.out.println(ls);
		}
		
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, arr);
		
		System.out.println("Using Collections.addAll()");
		for(String ls : list1) {
			
			System.out.println(ls);
		}
		
		String[] arry = new String[list1.size()];
		
		for( int i = 0; i<arry.length;i++) {
			
			arry[i]= list1.get(i);
		}
		
		System.out.println(Arrays.toString(arry));
		
		System.out.println("List to array");
		
		String[] array = list1.toArray(new String[0]);
		
		System.out.println(Arrays.toString(array));
	}

}
