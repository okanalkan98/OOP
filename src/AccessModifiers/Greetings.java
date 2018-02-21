package AccessModifiers;

public class Greetings {

	public String msg;
	
	public Greetings(String msg) {
		this.msg=msg;
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Greetings g=new Greetings("welcome");
		System.out.println(g.msg);//accessing instance variable
		Greetings.sayHello();//invoking method
	}
}
