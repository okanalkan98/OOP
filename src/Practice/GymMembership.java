package Practice;

public class GymMembership {

	private String memberName;
	private double duration;
	private double monthlyFee;  
	
	public GymMembership(String name,double duration, double monthlyFee) {
		this.memberName=name;
		this.duration=duration;
		this.monthlyFee=monthlyFee;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public double getTotalCost() {
		return duration*monthlyFee;
	}
	
	public String toString() {
		String det=memberName+","+duration+","+monthlyFee;
		return det;
	}
}
