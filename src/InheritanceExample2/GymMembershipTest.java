package InheritanceExample2;

import InheritanceExample1.DiscountedMembership;
import InheritanceExample1.GymMembership;

public class GymMembershipTest {

	public static void main(String[] args) {
		GymMembership m1=new GymMembership("Okan",12,5);
		//System.out.println(m1);
		System.out.println(m1.getTotalCost());
		System.out.println(m1.toString());
		
		DiscountedMembership m2=new DiscountedMembership("Okan",12,5, .2);
		System.out.println(m2.getTotalCost());
		System.out.println(m2.toString());
	}
}
