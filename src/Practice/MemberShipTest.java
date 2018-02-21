package Practice;

public class MemberShipTest {

	public static void main(String[] args) {
		
		
		GymMembershipPromotion p1= new GymMembershipPromotion("Mike", 6, 3000);
		System.out.println(p1);
		System.out.println(p1.getTotalCost());

		GymMembershipPromotion p2= new GymMembershipPromotion("Aohn", 6, 3000);
		System.out.println(p2);
		System.out.println(p2.getTotalCost());
	}

}
