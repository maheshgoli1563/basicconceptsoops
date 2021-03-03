package controlstatements;

public class MainClass {
	public static void main(String[] args) {
		Hello h1 = new Hello(); // creating the object for child class

		h1.m2(); //child class has own instance methods

		h1.m1();// for static method

		System.out.println(h1.method()); // override the interface method and print it

		herllo.m1(); // here interface doesn't support object
		// for static direct calling interface name along static method

	}
}
