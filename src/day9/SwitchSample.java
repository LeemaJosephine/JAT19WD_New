package day9;

import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		
		case 2,4,6:
				System.out.println("It's even number");
				break;
			
		default:
			System.out.println("It's odd");
		}
	}

}
