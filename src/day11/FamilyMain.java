package day11;

public class FamilyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son obj = new Son();
		obj.grandFather();
		obj.father();
		obj.son();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Daughter obj1 = new Daughter();
		obj1.grandFather();
		obj1.father();
		obj1.daughter();
	}

}
