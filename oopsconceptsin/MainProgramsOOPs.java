package oopsconceptsin;

import java.util.Scanner;

public class MainProgramsOOPs {

	public static void main(String[] args) {

		abstractmethod();
		System.out.println("-----------------------------------");
		superMethodProgram();
		System.out.println("-------------------------------------");
		aggreation();
		System.out.println("-------------------------------------");

	}

	public static void abstractmethod() {
		System.out.println("Program for Abstract methods");
		AbstractClassInMYProgram s = new AbstractSubClass();
		s.method1();
		s.method2();

	}

	public static void superMethodProgram() {
		System.out.println("Program for super keyword");
		superchildclass sc = new superchildclass();
		sc.work();
		sc.suppichildclass();
	}

	public static void aggreation() {
		System.out.println("program for Aggreation using Sphere formula: 4*pi*r*r just enter r value");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the raduis value");
		int radius = scanner.nextInt();
		AggreationChildSphereClass cs = new AggreationChildSphereClass();
		double value = 4 * (cs.area(radius));
		System.out.println(value);
		scanner.close();
	}

}
