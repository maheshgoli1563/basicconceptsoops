package variables;

public class Variables {

	int s = 10;
	static int a = 9;

	public static void main(String[] args) {
		int x = 10 * 20 - 20;
		System.out.println(x);
		variables1();
		Variables v = new Variables();
		System.out.println(v.s);
		m3();
	}

	public static void variables1() {
		int c = 23;
		System.out.println(a);
		System.out.println(c);

	}

	public static void m3() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Java" + 1 + 2 + "Quiz" + "" + (3 + 4);
		System.out.println(s3);
		System.out.println("s1 == s2 is: " + (s1 == s2));

		String s11 = new String("java");
		String s12 = new String("JAVA");
		System.out.println(s11 = s12);

	}

}
