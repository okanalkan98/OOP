package Constructors;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student student1= new Student("John",18,"M",2016,"Java");
		System.out.println(student1.name+":"+student1.age+":"+student1.gender+":"+student1.year+":"+student1.course+":"+student1.name+":"+student1.school);
		student1.attendLecture();
		student1.submitAssignment();
		student1.attendLab();

		System.out.println("=====================================");
		
		Student student2= new Student("Jack",17,"M",2016,"DBA");
		System.out.println(student2.name+":"+student2.age+":"+student2.gender+":"+student2.year+":"+student2.course+":"+student2.name+":"+student2.school);
		student2.attendLecture();
		student2.submitAssignment();
		student2.attendLab();
		
		System.out.println("=====================================");
		
		Student student3= new Student("Lucy",18,"F",2016,"SQL");
		System.out.println(student3.name+":"+student3.age+":"+student3.gender+":"+student3.year+":"+student3.course+":"+student3.name+":"+student3.school);
		student3.attendLecture();
		student3.submitAssignment();
		student3.attendLab();
				
	}

}
