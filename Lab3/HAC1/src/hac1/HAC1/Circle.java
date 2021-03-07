
package hac1.HAC1;


public class Circle {
    
    public double radius;
    
    public Circle() {
        radius = 5;
    }
    
    public Circle(int r ) {
        radius = r;
    }
    
         public double calculateCircum() {
             
                 return(2*Math.PI*radius);

         }

    
}
