package AccessModifiers2;

import AccessModifiers.Greetings;

public class TestGreetings2 {

	public static void main(String[] args) {
		
		Greetings g=new Greetings("welcome");
		System.out.println(g.msg);//accessing instance variable
		Greetings.sayHello();//invoking method

	}

}
