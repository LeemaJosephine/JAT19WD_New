package day9;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1="Guvi";
		String name2="guvi";
		
		System.out.println(name1.concat(name2));
		
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.length());
		System.out.println(name1.charAt(2));
		System.out.println(name1.indexOf('i'));
		
		System.out.println(name1.contains("vi"));
	}

}
