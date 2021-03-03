package oopsconceptsin;

public class CompositionPhoneChildClass {

	private CompositionSimParentClass sc;
	private String phoneCompany;

	CompositionPhoneChildClass(CompositionSimParentClass sc, String phoneCompany) {
		this.sc = sc;
		this.phoneCompany = phoneCompany;
	}

	public String toString() {
		return "Phone Company: " + phoneCompany + " " + " " + sc;
	}

}
