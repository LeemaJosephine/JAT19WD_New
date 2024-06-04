package day11;

public class CalculatorImpMain extends CalculatorImplementation{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
		System.out.println("Sub");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorImpMain obj = new CalculatorImpMain();
		obj.add();
		obj.sub();
		obj.mul();
		
//		CalculatorImpMain obj[] = new CalculatorImpMain[1];
//		
//		for(CalculatorImpMain obj1 : obj) {
//			
//			obj1.add();
//			
//		}
		
		
	}	

}
