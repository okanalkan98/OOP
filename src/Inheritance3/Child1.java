package Inheritance3;

public class Child1 extends Parent{
	
	public Child1() {
		super();
	}
	
	public void m2() {
		super.m1();
		System.out.println(super.var);
	}

}
