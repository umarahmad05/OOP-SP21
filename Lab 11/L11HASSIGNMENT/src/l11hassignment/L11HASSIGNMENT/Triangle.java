
package l11hassignment.L11HASSIGNMENT;

public class Triangle implements Shape {
	private double x, y, base, height, area;
	
	public Triangle(double a, double b, double bse, double h) {
		x=a;
		y=b;
		base=bse;
		height=h;
	}
	
	public double area() {
		area= (height*base)/2;
		return area;
	}

}