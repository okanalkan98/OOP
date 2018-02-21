package InheritanceExample1;

public class DiscountedMembership extends GymMembership{
	
	/*
	private String memberName;
	private double duration;
	private double monthlyFee;
	private double discount;
	
	public DiscountedMembership(String name, double duration, double monthlyFee, double discount) {
		this.memberName=name;
		this.duration=duration;
		this.monthlyFee=monthlyFee;
		this.discount=discount;
	}
	
	public double getTotalCost() {
		double cost=duration*monthlyFee;
		return cost*(1-discount);
	}
	
	public String toString() {
		String det=memberName+","+duration+","+monthlyFee+","+discount;
		return det;
	}
	*/
	
	private double discount;
	
	public DiscountedMembership(String name, double duration, double monthlyFee, double discount) {
		super(name, duration, monthlyFee);
		this.discount=discount;
	}
	
	public double getTotalCost() {
		double cost=super.getTotalCost();
		return cost*(1-discount);
	}
	
	public String toString() {
		String det=super.toString()+","+discount;
		return det;
	}
	
	

}
