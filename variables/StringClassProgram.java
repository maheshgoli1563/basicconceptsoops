package variables;

public class StringClassProgram {
	private String name;
	private String engine;

	public static int numberOfStaticWords;

	public StringClassProgram(String name, String engine) {
		this.name = name;
		this.engine = engine;
		numberOfStaticWords++;
	}
	static int no=34;
	static{
		no=no+30;	
	}
	static int getVal() {
		System.out.println("static");
		return no;
	}

	public String gettername() {
		return name;

	}

	public int getNumberOfStaticWords() {
		return numberOfStaticWords;
	}

	// getters and setters
	public static void main(String[] args) {
		StringClassProgram sc = new StringClassProgram("mahesh", "ece");

		System.out.println(sc.gettername());
		System.out.println(sc.getNumberOfStaticWords());
		StringClassProgram sc1 = new StringClassProgram("rajesh", "mech");
		System.out.println(sc1.gettername());
		System.out.println(sc1.getNumberOfStaticWords());
		System.out.println(getVal());
	}
}
