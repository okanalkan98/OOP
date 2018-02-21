package Polymorphism;

public class Man extends Human implements Dad{

	public void provideForFamily() {
		System.out.println("Dad is providing for family");
	}
	
	@Override 
	public void eat() {
		System.out.println("Man eats");
	}
	
	@Override
	public void walk() {
		System.out.println("Man walks");
	}
}
