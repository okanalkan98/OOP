package ObjectAndClasses;

public class Dog {

	public String name;
	public int age;
	public String breed;
	public String color;
	
	public void bark(){
		System.out.println(name+" is barking");
	}
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	/*
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="Bubbly";
		dog1.age=10;
		dog1.breed="Golden";
		dog1.color="White";
		
		dog1.bark();
		dog1.eat();
	}
	*/
}
