package Abstraction;

public abstract class Employee {

	double salary;
	
	public abstract void work();
	
	public double calculateBonus(double bonus) {
		
		return salary*bonus;
	}
}
