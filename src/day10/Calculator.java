package day10;

import java.util.Scanner;

public class Calculator {

	int a;
	int b; 
	int d;
	int e;
	
	
//	public Calculator(int sub1,int sub2) {
//		
//		a=sub1;
//		b=sub2;
//		
//	}
	
	public Calculator(int num1,int num2,int num3,int num4) {
		
		a=num1;
		b=num2;
		d=num3;
		e=num4;
	}
	
	
	 // attributes or variable
	//static int num1;
	//static int num2;
	
	public void add() {
		
		
		int c = a + b;
		System.out.println("Addition of a + b = " + c);
	}
	
	
	public int sub() {
		
		int c = d - e;
		return c;
		
	}
	
	
	
	
	public static void main(String[] args) {  // String --> "10"
		// TODO Auto-generated method stub
		
		// To call normal method, create object
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for a and b (Add)");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the values for c and d (Sub)");
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		
		// to invoke 3 parameter constructor
		
		Calculator obj  = new Calculator(num1,num2,num3,num4);
		
		// calling the variable of the class and assigning value to it.
		
		obj.add();
		
		System.out.println("Sub operation " + obj.sub());
		
//		System.out.println("Enter the values for a and b(Sub)");
//		int num3=sc.nextInt();
//		int num4=sc.nextInt();
//		
//		System.out.println("Sub operation " + obj.sub(num3, num4));
//		
//		
//		System.out.println("Sub of a - b = " + obj.sub());
//		
//		// To call static method --> call it directly with method name
//		mul();
	}

}
