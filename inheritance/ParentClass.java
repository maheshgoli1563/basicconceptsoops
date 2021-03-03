package inheritance;

public class ParentClass {

	String name;
	int id;
	String s1 = "Parentparent";
	public ParentClass(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void method(){
		System.out.println("Parent Class name:" +name+" id: "+id);
	}
}
