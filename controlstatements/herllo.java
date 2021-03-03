package controlstatements;

// here we are using interface, using static methods 
public interface herllo {
	static int num = 100;

	// static methods are possible in the interface
	public static void m1() {
		System.out.println("static block");
	}

	// here static methods are possible in interface only non static methods
	// are not possible
	public int method();
}
