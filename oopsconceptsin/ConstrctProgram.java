package oopsconceptsin;

public class ConstrctProgram {
	int id;
	String name;

	public ConstrctProgram() {
		id = 234;
		name = "mahesh";
	}

	ConstrctProgram(int id, String name) {
		this.id = id;
		this.name = name;
	}

	ConstrctProgram(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public static void defultConstruct() {
		ConstrctProgram cs = new ConstrctProgram();
		System.out.println("constructor because we didnt intilaize it ");
		System.out.print(cs.id + " ");
		System.out.println(cs.name);
	}

	public static void withArgument() {
		ConstrctProgram cs = new ConstrctProgram(1, "rajesh");
		System.out.println("constructor with intilaize it ");
		System.out.print(cs.id + " ");
		System.out.println(cs.name);
		ConstrctProgram cs1 = new ConstrctProgram("rakesh", 2);
		System.out.println("constructor with intilaize position are changed ");
		System.out.print(cs1.id + " ");
		System.out.println(cs1.name);
		ConstrctProgram mw=cs;
		System.out.println(mw.name);
		System.out.println(mw.id);
	}

	public static void main(String[] args) {
		defultConstruct();
		withArgument();
	}

}
