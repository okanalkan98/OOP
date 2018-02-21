package Practice;

public class GymMembershipPromotion extends GymMembership{

	private double discount;

	public GymMembershipPromotion(String name, double duration, double monthlyFee){
		super(name, duration, monthlyFee);

		if(name.toLowerCase().startsWith("a")||name.toLowerCase().startsWith("e")||name.toLowerCase().startsWith("i")||
		   name.toLowerCase().startsWith("o")||name.toLowerCase().startsWith("u")) {
			discount=0.5;
		}else {
			discount=0.2;
		}
	}
	
	public String getMemberName() {
		return super.getMemberName();
	}
	
	public double getTotalCost() {
		return super.getTotalCost()*(1-discount);
	}
	
	public String toString() {
		return super.toString()+","+discount;
	}
}
