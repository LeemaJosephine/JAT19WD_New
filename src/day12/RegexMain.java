package day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Getting the input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to be searched: ");
		String word = sc.nextLine();
		
		
		// Define the pattern
		
		Pattern pat = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
		
		// Search for the patter
		
		System.out.println("Enter the sentence:");
		String text = sc.nextLine();
		
		Matcher mat = pat.matcher(text);
		
		// check if the pattern is found
		
		boolean matchFound = mat.find();
		
		if(matchFound) {
			
			System.out.println("Match found");
		} else {
			
			System.out.println("Match not found");
		}
		
	}

}
