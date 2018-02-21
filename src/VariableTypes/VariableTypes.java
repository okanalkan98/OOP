package VariableTypes;

public class VariableTypes {
	
	public String fName;//instance variable
	public String lName;//instance variable
	public int age;//instance variable
	
	public static String univ="Stanford";//class variable
	
	public VariableTypes(String firstName, String lastName, int studAge) {
		fName=firstName;
		lName=lastName;
		age=studAge;
	}
	
	public void printDetails() {
		String name=lName+","+fName; //local variable
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("University:"+univ);
	}
	
	public static void main(String[] args) {
		VariableTypes z1=new VariableTypes("James","Rose",21);
		VariableTypes z2=new VariableTypes("Edward","Lee",22);
		
		System.out.println(z1.fName);
		System.out.println(z2.fName);
		System.out.println(VariableTypes.univ);

	}

}
