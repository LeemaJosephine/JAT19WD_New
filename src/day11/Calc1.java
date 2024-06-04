package day11;

public class Calc1 {
	
		int c;
		
		public void add(int a, int b) {
			
			c = a+b;
			System.out.println("Addition with integer " + c);
		}
		
		public void add(float a,float b) {
			
			float c = a + b;
			System.out.println("Addiation with float " + c);
			
		}
		
		public void sub(int a ,int b) {
			
			c = a - b; 
			System.out.println("Subraction");
			
		}
		
		public void mul(int a,int b) {
			
			c = a * b;
			System.out.println("Multiplication");
		}
}

