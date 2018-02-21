package Constructors;

public class DogTest2 {

	public static void main(String[] args) {
		
		Dog dog2=new Dog();
		System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
		
		System.out.println("=============================");
		
		Dog dog3=new Dog("Chomar",7,"Kangal","White");
		System.out.println(dog3.name+":"+dog3.age+":"+dog3.breed+":"+dog3.color);
		

	}

}
