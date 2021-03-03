package oopsconceptsin;

public class EncapuslationEmployee {
	private int id;
	private String name;
	private int age;
	private double sal;
	private String gender;
	private boolean maritalStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public static void main(String[] args) {
		EncapuslationEmployee emp = new EncapuslationEmployee();
		emp.setAge(23);
		emp.setGender("male");
		emp.setId(101);
		emp.setMaritalStatus(true);
		emp.setName("mahesh");
		emp.setSal(25000);
		System.out.println("employee id: "+emp.getId());
		System.out.println("employee name: "+emp.getName());
		System.out.println("Gender: "+emp.getGender());
		System.out.println("Age: "+emp.getAge());
		System.out.println("Salary: "+emp.getSal());
		System.out.println("MaritalStatus: "+emp.isMaritalStatus());

	}
}
