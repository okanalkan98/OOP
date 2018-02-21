package Abstraction;

public class ScrumMaster extends FullTimeEmployee{

	@Override
	public void takeOff() {
		System.out.println("Taking vacation");		
	}

	@Override
	public void work() {
		System.out.println("Implementing scrum rules");		
	}
	
}
