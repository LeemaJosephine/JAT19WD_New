package day11;

public class EncapsulSample {

	
	private int rollno;
	private String name;
	
	public void setRollno(int no) {
		
		rollno = no;
		
	}
	
	public void setName(String n) {
		
		name = n;
	}
	
	public int getRollno() {
		
		return rollno;
	}
	
	public void getName() {
		
		System.out.println("The name is: " + name);
	}
	
	
	
	
}
