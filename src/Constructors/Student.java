package Constructors;

public class Student {

	String name;
	int age;
	String gender;
	int year;
	String course;
	String school;
	
	public Student() {
		System.out.println("inside the constructor with no arguments");
		school="Stanford University";
	}
	
	public Student(String studentName, int studentAge, String studentGender, int studentYear, String studentCourse) {
		this();/*It calls Student() and always has to be the first statement in this constructor. 
		It means find a constructor with no arguments in current class.*/
		System.out.println("inside the constructor with arguments");
		name=studentName;
		age=studentAge;
		gender=studentGender;
		year=studentYear;
		course=studentCourse;
	}
	
	public void attendLecture() {
		System.out.println(name+" is atttending "+course);
	}
	
	public void submitAssignment() {
		System.out.println(name+" is submitting "+course);
	}
	
	public void attendLab() {
		System.out.println(name+" is attending lab");
	}
}
