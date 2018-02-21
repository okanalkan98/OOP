package Inheritance4;

public class LocalVariable {
	
	public void m1(final String s1, final String s2) {
		final int x=5;
		//public int x=5;//compile error
		//private int y=5;//compile error
		//protected int z=5;//compile error
	}

}
