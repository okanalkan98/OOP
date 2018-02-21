//Because of Dog and DogTest1 classes are under same package, we don't need to import Dog class here
package ObjectAndClasses;

public class DogTest1 {

	public static void main(String[] args) {
	
		Dog dog1=new Dog();
		dog1.name="Bubbly";
		dog1.age=10;
		dog1.breed="Golden";
		dog1.color="White";
		
		dog1.bark();
		dog1.eat();
		
		System.out.println(dog1.name+":"+dog1.age+":"+dog1.breed+":"+dog1.color);
		
		System.out.println("==========================");
		
		Dog dog2=new Dog();
		dog2.name="Chomar";
		dog2.age=5;
		dog2.breed="Kangal";
		dog2.color="Grey";
		
		dog2.bark();
		dog2.eat();
		
		System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);

	}

}
