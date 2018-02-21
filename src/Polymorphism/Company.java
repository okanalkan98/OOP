package Polymorphism;

public class Company {

	public static void main(String[] args) {
		Employee emp1=new QA_Tester();
		Employee emp2=new Developer();
		Employee emp3=new ScrumMaster();
		
		emp1.work();
		emp2.work();
		emp3.work();
		
		System.out.println(emp1.getClass().getName());
		System.out.println(emp2.getClass().getSimpleName());
		System.out.println(emp3.getClass().getSimpleName());
		
		//create array of employees, in polymorphic way
		Employee[] employees= new Employee[4];
		
		employees[0]=new QA_Tester();
		employees[1]=new Developer();
		employees[2]=new Developer();
		employees[3]=new ScrumMaster();
		
		employees[0].work();
		
		System.out.println(employees.length);
		
		int devCount=0;
		for(Employee  emp :employees ) {
			if(emp.getClass().getSimpleName().equals("Developer")) {
				devCount++;
			}
		}
		System.out.println("Developers count: "+devCount);
		
		for(Employee emp:employees) {
			emp.work();
		}
		
		Employee sm=new ScrumMaster();
		clockIn(sm);
		clockIn(new Developer());
	}
	
	public static void clockIn (Employee employee) {
		employee.work();
	}
	

	
}
