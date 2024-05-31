package day9;

import java.util.Scanner;

public class MatchCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the country");
		String country = sc.next();
		
//		System.out.println("Enter the city");
//		String city = sc.next();
//		
		if(country.equalsIgnoreCase("India")) {
			
			System.out.println("Enter the city");
			String city = sc.next();
			
			if(city.equalsIgnoreCase("Chennai")) {
				
				System.out.println("The city is chennai");
				
			} else if(city.equalsIgnoreCase("Delhi")) {
				
				System.out.println("The city is Delhi");
				
			} else if(city.equalsIgnoreCase("Meerut")) {
				
				System.out.println("The city is Meerut");
				
			} 
		
		} else {
			
			System.out.println("Invalid country");
		}
		
		System.out.println("End of program");
		
	}

}
