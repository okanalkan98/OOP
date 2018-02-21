package Abstraction;

public class Manager extends Employee implements Telework{

	@Override
	public void workFromHome() {
		System.out.println("Manager is working from home");
		
	}

	@Override
	public void work() {
		System.out.println("Supporting team members");
		
	}
 
	

}
