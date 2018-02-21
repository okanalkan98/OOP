package Polymorphism;

public class Woman extends Human{

	@Override //it will check you are really overriding
	public void eat() {
		System.out.println("Woman eats");
	}
	
	@Override
	public void walk() {
		System.out.println("Woman walks");
	}
}
