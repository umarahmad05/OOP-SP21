
package l3ac3.L3AC3;

public class PointTest {

    
    public static void main(String[] args) {

        Point p1 = new Point(10,20);   // p1 value represented by x in 
        Point p2 = new Point (30,40);  // p2 value       by  pa
        Point p3 = new Point ();          // p3 value by pb and it will be have original value(default) of x since no value is mentioned in p3 
        
Point p4 = p1.Add(p2,p3);
p4.display();
}
}
    

