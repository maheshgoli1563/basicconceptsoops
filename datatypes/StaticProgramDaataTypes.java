package datatypes;

public class StaticProgramDaataTypes {

	static int a = 2147483647;// upto 2147483647

	static float b = 9654;
	static char c = 'e';
	static boolean d = true;
	static long e = 487;// upto (2^64)-1
	static short f = 4578;
	static double g = 14;
	static byte h = 45;

	public static void multiplication() {
		/*
		 * int x1 = 5_2;
		 * 
		 * Scanner sc=new Scanner(System.in); long s=sc.nextInt();
		 * System.out.println(hexWords); System.out.println(a);
		 * System.out.println(a*c); System.out.println(a*b);
		 * System.out.println(a*f); System.out.println(a*g);
		 * System.out.println(b); System.out.println(e*f);
		 * 
		 * System.out.println(x1); System.out.println(e * a);
		 * System.out.println(e + a); System.out.println(a * c);
		 * System.out.println(a + c);
		 */

	}

	public static void multi() {
		byte a = 12;
		float b = 3.45f;
		short c = 1024;
		int i = 234556;
		System.out.println(a);
		System.out.println(b);
		double result = (a * b);
		double s = (i + c);

		double g = result * s;// 9753063.359466553
		System.out.println(g);
		System.out.println(s);
		System.out.println(result);
	}

	public static void div() {
		// System.out.println(a / b); //return float
		// System.out.println(a/c); //return 21262214 but a vlaue 2147483647
		// System.out.println(a);

		// System.out.println(a * a); // return 1

		// long h=a/e;
		// System.out.println(h); // int 2147483647=a a/e=4409617 return long
		// int u = a / f;
		// System.out.println(u); // int divided by short returns int cant short
		// double u = a / h;

		// System.out.println(u); // cant short,byte: int divided by byte return
		// can be long, float, double,int
		// double u=a/g;
		// System.out.println(u); //int divided by double is double
		// System.out.println(b);
		// float u = b / a; // return float,double,
		// u = b / c; // float / char returns float double
		// double u=b/e; // float / long return float double
		// float u = b / f;
		System.out.println(c);
		// int u=c/a; // ascii value of c value divided by int is return int
		// float u=c/b; // ascii value of c value divided by float is return
		// u=c/c; // return ascii value / ascii value

		// System.out.println(u);
	}

	public static void mod() {
		// float u=a%b; // return float
		System.out.println(a);
		System.out.println(c);
		// double u=c%e; // ascii value of e div long return float
		// long u = f % e; // return long/short = long

		// System.out.println(u);
	}

	public static void main(String[] args) {
		// multi();
		// multiplication();
		// div();
		mod();
	}

}
