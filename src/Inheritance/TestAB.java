package Inheritance;

public class TestAB {

	public static void main(String[] args) {
		
		A a=new A();
		a.setValue(5);
		System.out.println(a.getValue());
		
		B b=new B();
		b.setValue(6);
		System.out.println(b.getValue());

		System.out.println(a.getValue());
	}

}
