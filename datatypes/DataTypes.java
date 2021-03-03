package datatypes;

public class DataTypes {
	public static void main(String[] args) {
		/*
		 * final float d = 2.34f; System.out.println(d); System.out.println(d *
		 * 3); float a=12; int b=(int)a; a=(long)b; long c=34; float d=c;
		 * 
		 */
		int x = -12;
		int c = 23;
		System.out.println(x << 2);
		System.out.println(x >> 2);
		/*
		 * System.out.println(x > c && x++ > c); System.out.println(x);
		 * 
		 * System.out.println(x > c & x++ > c); System.out.println(x);
		 */

		/*
		 * System.out.println(x < c || x++ > c); here first conditon is true it
		 * dont goes to 2nd condition System.out.println(x);
		 * System.out.println(x < c | x++ > c); here first condition is false
		 * are not it goes to second condition System.out.println(x);
		 */

		short a = 10;
		short b = 10;
		// a=a+b;
		// here compile error because short arithamtic short cannot be short
		// a=(short)a+b; 
		//here we are converting int to short because of addition short is converted to int so narrowing 

	}
}
