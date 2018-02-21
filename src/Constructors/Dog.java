package Constructors;

public class Dog {

	public String name;
	public int age;
	public String breed;
	public String color;
	
	//Constructors look like a method but no return type:
	
	public Dog() { //no argument constructor
		System.out.println("inside the constructor 1");
		name="xxx";
		age=5;
		breed="Golden";
		color="red";
	}
	
	public Dog(String dogName, int dogAge, String dogBreed, String dogColor) { //argument constructor
		System.out.println("inside the constructor 2");
		name=dogName;
		age=dogAge;
		breed=dogBreed;
		color=dogColor;
	}
	
	public void bark(){
		System.out.println(name+" is barking");
	}
	
	public void eat() {
		System.out.println(name+" is eating");
	}

}
