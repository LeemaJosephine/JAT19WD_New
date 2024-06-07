package day12;

public class CalculatorFinal extends CalculatorClass implements CalculatorInterface{

	public void tan() {
		
		System.out.println("tan");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}
	
	public static void main(String[] args) {
		
		CalculatorFinal obj = new CalculatorFinal();
		obj.add();
		obj.sub();
		obj.div();
		obj.tan();
		
		
	}
}
