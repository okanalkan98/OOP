package Abstraction;

public class Parking {

	public static void main(String[] args) {
		
		//Car car=new Car();//can not create object from an abstract class
		Volvo v=new Volvo();
		v.start();
		
		Toyota t=new Toyota();
		t.start();

	}

}
