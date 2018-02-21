package Inheritance4;

import Inheritance3.Parent;

public class Child2 extends Parent{
	
	public Child2() {
		super();
	}
	
	public void m2() {
		super.m1();
		System.out.println(super.var);
	}

}
