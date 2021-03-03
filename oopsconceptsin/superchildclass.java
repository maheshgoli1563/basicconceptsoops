package oopsconceptsin;

public class superchildclass extends SuperProgram {
	void suppimethod() {
		System.out.println("super child class method");
	}

	void work() {
		super.suppimethod();
	}

	void suppichildclass() {
		System.out.println("child method in child ");
	}
}
