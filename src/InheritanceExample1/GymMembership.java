package InheritanceExample1;

public class GymMembership {
	
	private String memberName;
	private double duration;
	private double monthlyFee;
	
	public GymMembership(String name, double duration, double monthlyFee) {
		this.memberName=name;
		this.duration=duration;
		this.monthlyFee=monthlyFee;
	}
	
	public double getTotalCost() {
		return duration*monthlyFee;
	}
	
	//Override toString() method
	public String toString() {
		String det=memberName+","+duration+","+monthlyFee;
		return det;
	}

}
