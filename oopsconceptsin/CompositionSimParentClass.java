package oopsconceptsin;

public class CompositionSimParentClass {
	public String phoneno;
	public String simCompnayName;

	public CompositionSimParentClass(String phoneno, String simCompnayName) {
		super();
		this.phoneno = phoneno;
		this.simCompnayName = simCompnayName;
	}

	public String toString() {
		return "Phone NUmber:" + phoneno + "  SimCompany: " + simCompnayName;
	}
}
