package day9;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for a ");
		int a = sc.nextInt();
		System.out.println("Enter the value for b ");
		int b = sc.nextInt();
		
//		int a = 1;
//		int b = 5;   // hardcode data
		
		if(a > b) {
			
			System.out.println("A is greater " + a);// + concatenation 
			
		} else {
			
			System.out.println("B is greater " +b);
			
		}
		
		System.out.println("End of program");
	}

}
