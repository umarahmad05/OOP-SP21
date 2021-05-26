
package l11hassignment.L11HASSIGNMENT;


public class Runner {

    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(15.0, 23.0);
		Circle c = new Circle(7.0);
		Triangle t = new Triangle(12.0, 12.0, 20.0, 7.0);
		
		Shape [] s= {r, c, t};
		
		CalculateAreas areas = new CalculateAreas(s);
		areas.display();
		

	}

}

 
