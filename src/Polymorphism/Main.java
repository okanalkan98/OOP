package Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Main {

	public static void main(String[] args) {
		
		Man m1=new Man();
		m1.eat();
		
		Woman w1=new Woman();
		w1.walk();
		
		//polymorphisim
		Human h1=new Man();
		h1.walk();
		
		Human h2=new Woman();
		h2.eat();
		
		Human human=new Man();
		human.walk();
		human=new Woman();
		human.walk();
		
		//We can create an object for the interface data type with polymorphism
		Dad dad=new Man();
		dad.provideForFamily();//only the method inherited from interface can be used
		
		//WebDriver is an interface. All classes implement WebDriver
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		WebDriver driver3=new InternetExplorerDriver();
			  
			  
	}

}
