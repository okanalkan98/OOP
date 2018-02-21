package Inheritance;

public class TestSuperAndSub {

	public static void main(String[] args) {
		
		Sub s=new Sub();
		System.out.println("Value x before increment "+s.x);

		s.increment();
		System.out.println("Value x before increment "+s.x);
		
		System.out.println(s.getSuperX());
	}

}
