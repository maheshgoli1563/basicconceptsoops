package oopsconceptsin;

public class AggreationChildSphereClass {
	// 4pir2
	AggreationOperationClass r;
	double pi = 3.14;

	double area(int radius) {
		r = new AggreationOperationClass();
		double rspher = pi * r.square(radius);
		return rspher;
	}
	

}
