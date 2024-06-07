package day12;

public class ImplementInterfcae implements CalculatorInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementInterfcae obj = new ImplementInterfcae();
		obj.add();
		obj.sub();
		obj.mod();
		obj.mul();
		obj.cos();
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

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		System.out.println("mod");
	}

	@Override
	public void cos() {
		// TODO Auto-generated method stub
		System.out.println("cos");
	}

}
