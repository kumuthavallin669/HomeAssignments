package week3.day2;

//creating subclass and extending it from superclass

public class OverridingSubClass extends OverridingSuperClass {
	//created same method signature with same parameters ad superclass
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		//creating object for subclass and overriding the values of superclass
		OverridingSubClass s=new OverridingSubClass();
		int fn=1;
		int sn=20;
		s.add(fn, sn);
	}

}
