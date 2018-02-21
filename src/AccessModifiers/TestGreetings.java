package AccessModifiers;

public class TestGreetings {

	public static void main(String[] args) {
		
		Greetings g=new Greetings("welcome");
		System.out.println(g.msg);//accessing instance variable
		Greetings.sayHello();//invoking method

	}

}
