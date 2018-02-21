//Local variables are not initialized to default values

package VariableTypes;

public class LocalTest {

	public static void main(String[] args) {
		
		final int i=0;
		//i=0;
		System.out.println(i);
		
		String str;
		if(i==0) {
			str="A";
		}
		System.out.println(str);

	}

}
