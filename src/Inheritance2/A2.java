package Inheritance2;

public class A2 {

	private int i;
	
	public A2(int i) {
		System.out.println("In parameterized constructor of A");
		this.i=i;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i=i;
	}
}
