package Methods;

import java.util.Scanner;

public class TestConvertFtoC {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter degree in Fahrenheit: ");
		int f=s1.nextInt();
		
		ConvertFtoC d1=new ConvertFtoC();
		double result=d1.convert(f);
		System.out.println("The degree in Celcius: "+result);
		
		s1.close();

	}

}
