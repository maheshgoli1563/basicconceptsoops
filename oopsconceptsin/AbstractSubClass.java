package oopsconceptsin;

public class AbstractSubClass extends AbstractClassInMYProgram {

	public AbstractSubClass() {

		System.out.println("constructor in child abstract class");
	}
	@Override
	void method1() {
		System.out.println("override the abstract method 1  ");
	}

	void method3() {
		System.out.println("method2 in child class");
	}

}
