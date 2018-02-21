package Inheritance;

public class Sub extends Super{

	public int x=200;
	//properties of the class can not be overridden
	//instance variables are hidden and not overridden by child class
	
	public int getSuperX() {
		return super.x;
	}
	
}
