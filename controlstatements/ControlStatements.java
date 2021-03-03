package controlstatements;

public class ControlStatements {
	public static void main(String[] args) {
		simpleIfStatement();
		elseIfStatement();
		nestedIfStatement();
		switchStatement();
		forLoopStatements();
		whileLoopStatement();
		doWhileLoopStatement();
		continueStatement();
	}

	public static void simpleIfStatement() {
		System.out.println("simpleIfStatement:");
		boolean s = true;
		int w = 4;
		System.out.println(w++);
		int s1 = 34;
		float d = 23;
		float x = (s1++ + ++s1) + d++;
		System.out.println(x);
		float y = (s1++ + ++s1) + d++;
		System.out.println(y);
		if ((x <= y)) {
			float z = (s1++ + ++s1) + ++d;
			System.out.println(w);
			System.out.println(z);
		}
	}

	public static void elseIfStatement() {
		System.out.println("elseIfStatement :");
		int sample = 23;
		float si = 24;
		System.out.println(si);
		if (si < sample) {
			System.out.println(si);
		} else {
			System.out.println(sample);
		}
	}

	public static void nestedIfStatement() {
		int a = 12;
		int b = 24;
		int c = 14;
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			System.out.println(b);
		}
	}

	public static void switchStatement() {
		System.out.println("switchStatement:");

		int order = 3;
		switch (order++) {
		case 1:
			System.out.println("bill: 240");
			break;
		case 2:
			System.out.println("bill:350");
			break;
		case 3:
			System.out.println("bill:450");
			break;
		case 4:
			System.out.println("bill:550");
			break;
		case 5:
			System.out.println("bill:650");
			break;
		default:
			System.out.println("none");
			break;
		}
		System.out.println(order);
	}

	public static void forLoopStatements() {
		System.out.println("forloop:");
		for (int i = 0; i <= 3; i++) {
			System.out.print("hello ");
		}
		System.out.println();
	}

	public static void whileLoopStatement() {
		System.out.println("whileloop:");
		int i = 0;
		while (i < 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}

	public static void doWhileLoopStatement() {
		System.out.println("dowhileloop:");
		int i = 23;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 27);
		System.out.println();
	}

	public static void continueStatement() {
		System.out.println("continueStatement:");
		for (int i = 0; i <= 10; i++) {
			if (i < 5) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
