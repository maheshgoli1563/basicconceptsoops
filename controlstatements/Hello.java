package controlstatements;

public class Hello implements herllo {

	// here non static methods its own method
	void m2() {
		System.out.println("printing the child class");
	}

	// static block of hello
	public static void m1() {
		System.out.println("static child block");
	}

	// override the method of interface
	@Override
	public int method() {
		// TODO Auto-generated method stub
		return 4564;
	}
}
