package day13;

import java.util.Scanner;

public class ExcepSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter value for a: ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		String word = null;
		
		int[] arr = new int[5];
		
		try {
			c = a/b;
			arr[1]=c;
			int len = word.length();
			System.out.println("Sample");
			
		} catch (ArithmeticException e) {
			c = a /1;
			System.out.println("Since the value of b was 0, assigning a default value as 1");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check the array size");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("A diffrent execption has occured");
		}
		System.out.println("end of program");
		sc.close();
	}

}
