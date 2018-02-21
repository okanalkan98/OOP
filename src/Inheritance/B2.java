package Inheritance;

public class B2 extends A2 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	/*
	@Override
	public void setValue(int value) {
		System.out.println("setValue() method in class B");
	}
	*/
	
	public void setValue(int value) {
		System.out.println("setValue() method in class B");
		super.setValue(value);
	}
}
