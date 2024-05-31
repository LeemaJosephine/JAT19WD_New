package day9;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i=0;i<size;i++) {
			
			numbers[i]=sc.nextInt();
		}
		
		
		System.out.println("The size of array " + numbers.length);  // size of the array
		
//		for(int i = 0 ; i<numbers.length;i++) {
//			
//			System.out.println(numbers[i]);
//			
//		}
		
		// for- each
		
		System.out.println("Elements of array");
		for(int num : numbers) {
			
			System.out.println(num);
		}
		
	}

}
