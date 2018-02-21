package Practice;

public class A {
	
	int max (int x, int y) {
		if(x>y) return x; else return y;
	}

	public void userClass(){
		C c=new C();
		System.out.println(c.max(13, 29));
	}
}
