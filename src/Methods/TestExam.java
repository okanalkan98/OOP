package Methods;

public class TestExam {

	public static void main(String[] args) {
		
		Exam e1=new Exam("Okan",100,90,80);
		e1.displayGreetings();
		
		System.out.println("=======================================");
		
		int res1=e1.getTotalScore();
		System.out.println("Total Score: "+res1);
		
		System.out.println("=======================================");
		
		int res2=e1.calculateTotal(e1.score1, e1.score2, e1.score3);
		System.out.println("Calculated Score: "+res2);
		
		System.out.println("=======================================");
		
		String[] arr1=Exam.convertToArray("Okan", "Alkan");
		for(String item:arr1)
			System.out.println(item);


	}

}
