package datatypes;

public class StaticKeyProgram {
	int a = 22;
	static int s = 2; // which method will execute first
	static int count = 0;

	static int add(int a, int b) {
		return a + b;
	}

	public StaticKeyProgram() {
		// calling constructor
		a++;
		count++;
		System.out.println("no: " + a + " count: " + count);
	}

	static {
		System.out.println(s);
		System.out.println("static block");
		// load all the static block
	}

	public static void main(String[] args) {
		System.out.println(++s);
		staticProgram();
		System.out.println(++s);
	}

	public static void staticProgram() {
		new StaticKeyProgram();
		new StaticKeyProgram();
		new StaticKeyProgram();
		System.out.println(StaticKeyProgram.add(21, 54));

	}
}
