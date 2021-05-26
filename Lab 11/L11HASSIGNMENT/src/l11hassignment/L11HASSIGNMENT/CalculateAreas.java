
package l11hassignment.L11HASSIGNMENT;


public class CalculateAreas {
	private double [] areas;
	
	public CalculateAreas(Shape s []) {
		areas = new double [s.length];
		for (int i=0; i<s.length; i++) {
			areas[i]= s[i].area();
		}
	}
	
	public void display() {
		System.out.print("[ ");
	    for (int i = 0; i < areas.length; i++) {
	        System.out.print(" "+areas[i]);
	        if(i<areas.length-1) 
	            System.out.print(",");
	    }
	    System.out.println(" ]");
	}

}
