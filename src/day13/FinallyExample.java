package day13;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b=2;
		int c=0;
		
		System.exit(0);
		
		try {
			c = a/b;
			System.out.println("Before exit");
			// System.exit(0);
			System.out.println("After exit");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception catched");
		
		}
		
		finally {
			
			System.out.println("Finally block statements");
			
		}
		
		System.out.println("End of program");
	}

}
