package day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexCharacterClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Character class
		
		// look for either of the character of the pattern to match
		
//		System.out.println(Pattern.matches("[y]", "n"));  // this will return true
//		System.out.println(Pattern.matches("[n]", "n"));  // this will return false
//		System.out.println(Pattern.matches("[a-zA-Z]", "A"));  // this will return true
//		
		
		// Reqex with Character classes and Quantifiers (are used to specify the number of occurance of a character
		
		System.out.println(" ? quantifier ");
		System.out.println(Pattern.matches("[amn]?", "a"));  // (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));  // false (a comes more than one time)
		
		System.out.println("+ quantifier");
		System.out.println(Pattern.matches("[amn]+", "a"));  // true
		System.out.println(Pattern.matches("[amn]+", "aaa")); // true
		
		System.out.println("* quantifier");
		System.out.println(Pattern.matches("[amn]*", "aaammm"));
		
		System.out.println("{} quantifier");
		System.out.println(Pattern.matches("[amn]{3}", "aa"));
		
		
		// Metacharacters
		System.out.println();
		System.out.println(" Meta Character ");
		
		System.out.println(Pattern.matches("\\d", "abc123"));
		System.out.println(Pattern.matches("\\d", "1"));  // look for 1 digit
		
		System.out.println(Pattern.matches("\\D", "a")); // look for 1 non digit
		System.out.println(Pattern.matches("\\D", "1")); 
		
		// 2. Regex should accept alphanumeric characters only. Its length must be six characters long only.

		System.out.println("Regex should accept alphanumeric characters only. Its length must be six characters long only");
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun12"));
		
		System.out.println();
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arung&"));
		
		System.out.println("Regex that accepts 10 digits numeric character. Starting with 7,8 or 9 only");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String number = sc.nextLine();
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", number));
		
		
	}

}
