package Methods;

//Static methods can be invoked from either static and instance method.
//Instance methods can only be invoked from instance method or object

public class TestMethods {

	public static void m1() {
		System.out.println("static method m1()");
	}
	
	public static void m2() {
		System.out.println("static method m2()");
		TestMethods.m1();
		m1();
		//m3(); //instance method can not be invoked from static method
	}
	
	public void m3() {
		System.out.println("instance method m3()");
	}
	
	public void m4() {
		System.out.println("instance method m4()");
		m3();//invoking instance method
		this.m3();
		m1();//invoking static method
		TestMethods.m1();
	}
	
	public static void main(String[] args) {
		m2();
		TestMethods.m2();
		TestMethods obj=new TestMethods();
		obj.m4();
	}
	
}
