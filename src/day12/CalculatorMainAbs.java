package day12;

public class CalculatorMainAbs extends ConcreteClass{

	
	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Div");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorMainAbs obj = new CalculatorMainAbs();
		obj.add();
		obj.sub();
		obj.div();
		obj.mul();
	}

}
