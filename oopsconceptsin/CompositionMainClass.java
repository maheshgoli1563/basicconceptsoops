package oopsconceptsin;

public class CompositionMainClass {
	public static void main(String[] args) {
		CompositionSimParentClass sc = new CompositionSimParentClass("9874561231", "Tata");

		CompositionSimParentClass sc1 = new CompositionSimParentClass("7894561234", "Airtel");

		CompositionPhoneChildClass cs = new CompositionPhoneChildClass(sc, "nokia");
		CompositionPhoneChildClass cs1 = new CompositionPhoneChildClass(sc1, "SAMSUNG");
		System.out.println(cs);
		System.out.println(cs1);

	}
}
