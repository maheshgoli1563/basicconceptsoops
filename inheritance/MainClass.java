package inheritance;

public class MainClass {
	public static void main(String[] args) {

		ParentClass s = new ChildClasss("mahesh",10);
		System.out.println(s.s1);
		s.method();
		System.out.println("___________________________");
		ChildClasss s2 = (ChildClasss) s;
		System.out.println(s2.s1);
		System.out.println(s2.s2);
		s2.method();
	}
}
