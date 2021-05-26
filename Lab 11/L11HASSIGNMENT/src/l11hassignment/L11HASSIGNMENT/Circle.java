
package l11hassignment.L11HASSIGNMENT;

public class Circle implements Shape{
	private double radius, area;
	private final double PI = 3.14;
	
	public Circle(double r) {
		radius=r;
	}
	
	public double area() {
		area= 2*PI*radius;
		return area;
	}

}