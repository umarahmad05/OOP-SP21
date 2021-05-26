
package l11hassignment.L11HASSIGNMENT;

public class Rectangle implements Shape {
	
	private double height, width, area;
	
	public Rectangle(double h, double w) {
		height=h;
		width=w;
	}
	
	public double area() {
		area=height*width;
		return area;
	}

}
